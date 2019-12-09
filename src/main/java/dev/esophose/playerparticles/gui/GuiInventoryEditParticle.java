package dev.esophose.playerparticles.gui;

import dev.esophose.playerparticles.PlayerParticles;
import dev.esophose.playerparticles.manager.DataManager;
import dev.esophose.playerparticles.manager.GuiManager;
import dev.esophose.playerparticles.manager.LangManager;
import dev.esophose.playerparticles.manager.LangManager.Lang;
import dev.esophose.playerparticles.manager.SettingManager.GuiIcon;
import dev.esophose.playerparticles.particles.PPlayer;
import dev.esophose.playerparticles.particles.ParticleEffect.ParticleProperty;
import dev.esophose.playerparticles.particles.ParticleGroup;
import dev.esophose.playerparticles.particles.ParticlePair;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class GuiInventoryEditParticle extends GuiInventory {

    public GuiInventoryEditParticle(PPlayer pplayer, ParticlePair editingParticle) {
        super(pplayer, Bukkit.createInventory(pplayer.getPlayer(), INVENTORY_SIZE, LangManager.getText(Lang.GUI_EDITING_PARTICLE, editingParticle.getId())));

        DataManager dataManager = PlayerParticles.getInstance().getManager(DataManager.class);

        this.fillBorder(BorderColor.RED);

        // Particle Info Icon
        String particleInfo = LangManager.getText(Lang.GUI_PARTICLE_INFO, editingParticle.getId(), editingParticle.getEffect().getName(), editingParticle.getStyle().getName(), editingParticle.getDataString());
        GuiActionButton particleInfoIcon = new GuiActionButton(
                13,
                GuiIcon.PARTICLES.get(),
                LangManager.getText(Lang.GUI_COLOR_ICON_NAME) + LangManager.getText(Lang.GUI_PARTICLE_NAME, editingParticle.getId()),
                new String[]{LangManager.getText(Lang.GUI_COLOR_INFO) + particleInfo},
                (button, isShiftClick) -> { });
        this.actionButtons.add(particleInfoIcon);

        // Edit Effect Button
        GuiActionButton editEffectButton = new GuiActionButton(
                38,
                GuiIcon.EDIT_EFFECT.get(),
                LangManager.getText(Lang.GUI_COLOR_ICON_NAME) + LangManager.getText(Lang.GUI_EDIT_EFFECT),
                new String[]{LangManager.getText(Lang.GUI_COLOR_SUBTEXT) + LangManager.getText(Lang.GUI_EDIT_EFFECT_DESCRIPTION)},
                (button, isShiftClick) -> {
                    List<GuiInventoryEditFinishedCallback> callbacks = new ArrayList<>();
                    callbacks.add(() -> GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle)));
                    callbacks.add(() -> GuiManager.transition(new GuiInventoryEditEffect(pplayer, editingParticle, 1, callbacks, 1)));
                    callbacks.add(() -> {
                        ParticleGroup group = pplayer.getActiveParticleGroup();
                        for (ParticlePair particle : group.getParticles()) {
                            if (particle.getId() == editingParticle.getId()) {
                                particle.setEffect(editingParticle.getEffect());
                                break;
                            }
                        }
                        dataManager.saveParticleGroup(pplayer.getUniqueId(), group);

                        GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle));
                    });

                    callbacks.get(1).execute();
                });
        this.actionButtons.add(editEffectButton);

        // Edit Style Button
        GuiActionButton editStyleButton = new GuiActionButton(40,
                GuiIcon.EDIT_STYLE.get(),
                LangManager.getText(Lang.GUI_COLOR_ICON_NAME) + LangManager.getText(Lang.GUI_EDIT_STYLE),
                new String[]{LangManager.getText(Lang.GUI_COLOR_SUBTEXT) + LangManager.getText(Lang.GUI_EDIT_STYLE_DESCRIPTION)},
                (button, isShiftClick) -> {
                    List<GuiInventoryEditFinishedCallback> callbacks = new ArrayList<>();
                    callbacks.add(() -> GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle)));
                    callbacks.add(() -> GuiManager.transition(new GuiInventoryEditStyle(pplayer, editingParticle, 1, callbacks, 1)));
                    callbacks.add(() -> {
                        ParticleGroup group = pplayer.getActiveParticleGroup();
                        for (ParticlePair particle : group.getParticles()) {
                            if (particle.getId() == editingParticle.getId()) {
                                particle.setStyle(editingParticle.getStyle());
                                break;
                            }
                        }
                        dataManager.saveParticleGroup(pplayer.getUniqueId(), group);

                        GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle));
                    });

                    callbacks.get(1).execute();
                });
        this.actionButtons.add(editStyleButton);

        // Edit Data Button
        boolean usesData = editingParticle.getEffect().hasProperty(ParticleProperty.COLORABLE) || editingParticle.getEffect().hasProperty(ParticleProperty.REQUIRES_MATERIAL_DATA);
        GuiActionButton editDataButton = new GuiActionButton(42,
                GuiIcon.EDIT_DATA.get(),
                LangManager.getText(Lang.GUI_COLOR_ICON_NAME) + LangManager.getText(Lang.GUI_EDIT_DATA),
                usesData ? new String[]{LangManager.getText(Lang.GUI_COLOR_SUBTEXT) + LangManager.getText(Lang.GUI_EDIT_DATA_DESCRIPTION)} :
                        new String[]{LangManager.getText(Lang.GUI_COLOR_UNAVAILABLE) + LangManager.getText(Lang.GUI_EDIT_DATA_UNAVAILABLE)},
                (button, isShiftClick) -> {
                    if (usesData) {
                        List<GuiInventoryEditFinishedCallback> callbacks = new ArrayList<>();
                        callbacks.add(() -> GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle)));
                        callbacks.add(() -> GuiManager.transition(new GuiInventoryEditData(pplayer, editingParticle, 1, callbacks, 1)));
                        callbacks.add(() -> {
                            ParticleGroup group = pplayer.getActiveParticleGroup();
                            for (ParticlePair particle : group.getParticles()) {
                                if (particle.getId() == editingParticle.getId()) {
                                    particle.setColor(editingParticle.getColor());
                                    particle.setNoteColor(editingParticle.getNoteColor());
                                    particle.setItemMaterial(editingParticle.getItemMaterial());
                                    particle.setBlockMaterial(editingParticle.getBlockMaterial());
                                    break;
                                }
                            }
                            dataManager.saveParticleGroup(pplayer.getUniqueId(), group);

                            GuiManager.transition(new GuiInventoryEditParticle(pplayer, editingParticle));
                        });

                        callbacks.get(1).execute();
                    }
                });
        this.actionButtons.add(editDataButton);

        // Back Button
        GuiActionButton backButton = new GuiActionButton(
                INVENTORY_SIZE - 1,
                GuiIcon.BACK.get(),
                LangManager.getText(Lang.GUI_COLOR_INFO) + LangManager.getText(Lang.GUI_BACK_BUTTON),
                new String[]{},
                (button, isShiftClick) -> GuiManager.transition(new GuiInventoryManageParticles(pplayer)));
        this.actionButtons.add(backButton);

        this.populate();
    }

}

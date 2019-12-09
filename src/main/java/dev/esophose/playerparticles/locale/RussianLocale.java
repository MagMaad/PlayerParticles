package dev.esophose.playerparticles.locale;

import java.util.LinkedHashMap;
import java.util.Map;

public class RussianLocale implements Locale {

    @Override
    public String getLocaleName() {
        return "ru_RU";
    }

    @Override
    public String getTranslatorName() {
        return "Dimatron74";
    }

    @Override
    public Map<String, String> getDefaultLocaleStrings() {
        return new LinkedHashMap<String, String>() {{
            // Plugin Prefix
            this.put("prefix", "&7[&3PlayerParticles&7] ");

            // Command Errors
            this.put("command-error-no-effects", "&cВы должны иметь доступ к эффектам чтобы использовать эту команду!");
            this.put("command-error-unknown", "&cНеизвестная команда, напишите &b/pp help &c, чтобы узнать команды.");

            // Command Descriptions
            this.put("command-descriptions", "&eВам доступны команды ниже:");
            this.put("command-descriptions-usage", "&e/pp {0} {1}");
            this.put("command-descriptions-help-1", "&7> &b/pp {0} &e- {1}");
            this.put("command-descriptions-help-2", "&7> &b/pp {0} {1} &e- {2}");
            this.put("command-descriptions-help-other", "&7> &b/ppo <Игрок> <Команда> &e- Посмотреть командны /pp от лица другого игрока.");
            this.put("command-description-add", "Добавить новые частицы.");
            this.put("command-description-data", "Проверить, какой тип данных использует эффект.");
            this.put("command-description-default", "Главная команда. Обычно открывает интерфейс.");
            this.put("command-description-edit", "Изменить частицы.");
            this.put("command-description-effects", "Показать список эффектов, которые Вы можете использовать.");
            this.put("command-description-fixed", "Управление Вашими исправными эффектами.");
            this.put("command-description-group", "Управление Вашими группами.");
            this.put("command-description-gui", "Показать интерфейс для простого изменения частиц.");
            this.put("command-description-help", "Показать список команд... в котором Вы находитесь.");
            this.put("command-description-info", "Показать описание одного из Ваших активных эффектов.");
            this.put("command-description-list", "Списки ID Ваших активных частиц.");
            this.put("command-description-reload", "Перезапустить конфигурацию.");
            this.put("command-description-remove", "Убрать некоторые частицы.");
            this.put("command-description-reset", "Убрать все Ваши активные частицы.");
            this.put("command-description-styles", "Показать список стилей, которые Вы можете использовать.");
            this.put("command-description-toggle", "Сделать частицы видимыми или невидимыми.");
            this.put("command-description-version", "Показать версию и создателя плагина.");
            this.put("command-description-worlds", "Узнать, в каком мире Ваши частицы отключены.");

            // Sub-Command Usage
            this.put("command-description-fixed-create", "&e/pp fixed create «x> <y> <z>|<looking» <Эффект> <Стиль> [данные] - Создаёт новый эффект.");
            this.put("command-description-fixed-edit", "&e/pp fixed edit <id> <Эффект|Стиль|Данные> <аргумент> - Изменяет чать эффекта по его ID.");
            this.put("command-description-fixed-remove", "&e/pp fixed remove <ID> - Удаляет эффект по его ID.");
            this.put("command-description-fixed-list", "&e/pp fixed list - Показывает список ID всех Ваших эффектов.");
            this.put("command-description-fixed-info", "&e/pp fixed info <ID> - Показывает информацию об одном из Ваших эффектов.");
            this.put("command-description-fixed-clear", "&e/pp fixed clear <Радиус> - Удаляет все эффекты игроков, находящихся в заданном радиусе.");
            this.put("command-description-group-save", "&e/pp group save <Имя> - Сохраняет все активные частицы в новой группе.");
            this.put("command-description-group-load", "&e/pp group load <name> - Загружает все частицы, сохранённые в группе.");
            this.put("command-description-group-remove", "&e/pp group remove <name> - Удаляет сохранённую Вами группу.");
            this.put("command-description-group-list", "&e/pp group list <name> - Список всех групп частиц, которые Вы сохранили.");
            this.put("command-description-group-info", "&e/pp group info <name> - Показывает частицы, сохранённые в группе.");


            // Command ID Lookup
            this.put("id-invalid", "&cID, который Вы ввели, недействительный, это должно быть целое число!");
            this.put("id-unknown", "&cВы не имеете частиц с ID &b{0}&c!");

            // Other Command
            this.put("other-no-permission", "&cВы не имеете права, чтобы выполнять команды от других игроков!");
            this.put("other-missing-args", "&cВы не ввели некоторые аргументы. &b/ppo <Игрок> <Команда>");
            this.put("other-unknown-player", "&cИгрок &b{0} &cwas не найден. Скорее всего игрок оффлайн.");
            this.put("other-unknown-command", "&cКоманды &b/pp {0} &cне существует.");
            this.put("other-success", "&eВыполнена команда /pp от лица &b{0}&e. Результат:");

            // Add Command
            this.put("add-reached-max", "&cНевозможно применить частицу, Вы использовали &b{0} &c, максимум допустимых!");
            this.put("add-particle-applied", "&aНовая частица была приложена к эффекту &b{0}&a, стилю &b{1}&a и данным &b{2}&a!");

            // Data Command
            this.put("data-no-args", "&cВы не ввели аргумент для эффекта! Используйте &b/pp data <Эффект>");

            // Edit Command
            this.put("edit-invalid-property", "&cНедействительное свойство &b{0} &cпредусмотрено. Действительные свойства: &bЭффект&c, &bСтиль&c, &bДанные.");
            this.put("edit-success-effect", "&aЭффект Ваших частиц под ID &b{0} &aбыл изменён на &b{1}&a!");
            this.put("edit-success-style", "&aСтиль Ваших частиц под ID &b{0} &aбыл изменён на &b{1}&a!");
            this.put("edit-success-data", "&aДанные Ваших частиц под ID &b{0} &aбыли изменены на &b{1}&a!");

            // Group Command
            this.put("group-invalid", "&cСохранённая или заданная группа под названием &b{0}&cне существует!");
            this.put("group-no-permission", "&cВы потеряли право использовать эффект или стиль в группе &b{0}&c!");
            this.put("group-preset-no-permission", "&cВы потеряли право использовать эффект или стиль в заданной группе &b{0}&c!");
            this.put("group-reserved", "&cНазвание группы &bактивно &cи не может быть использованно!");
            this.put("group-no-name", "&cВы не ввели название группы! &b/pp {0} <названиеГруппы>");
            this.put("group-save-reached-max", "&cНевозможно сохранить группу, Вы превысили максимальное количество групп!");
            this.put("group-save-no-particles", "&cНевозможно сохранить группу, у Вас нет никаких приложенных частиц!");
            this.put("group-save-success", "&aВаши эффекты были сохранены в группе под названием &b{0}&a!");
            this.put("group-save-success-overwrite", "&aГруппа &b{0} &aбыла обновлена с Вашими частицами!");
            this.put("group-load-success", "&aИз группы &b{1}&a прикреплено частиц - &b{0}!");
            this.put("group-load-preset-success", "&aИз группы &b{1}&a прикреплено частиц - &b{0}");
            this.put("group-remove-preset", "&cВы не можете удалить заданную группу!");
            this.put("group-remove-success", "&aУдалена группа под названием &b{0}&a!");
            this.put("group-info-header", "&eГруппа &b{0} &eимеет следующие частицы:");
            this.put("group-list-none", "&eУ Вас нет никаких сохранённых групп с частицами!");
            this.put("group-list-output", "&eУ Вас есть следующие сохранённые группы: &b{0}");
            this.put("group-list-presets", "&eДоступны следующие заданные группы: &b{0}");

            // Reload Command
            this.put("reload-success", "&aКонфигурация перезагружена!");
            this.put("reload-no-permission", "&cВы не имеете права, чтобы перезагружать параметры плагина!");

            // Remove Command
            this.put("remove-no-args", "&cВы не ввели ID для удаления! &b/pp remove <ID>");
            this.put("remove-id-success", "&aВаши частицы под ID &b{0} &aбыли успешно удалены!");
            this.put("remove-effect-success", "&aКоличество удалённых частиц - &b{0} &a, эффектов - &b{1}&a!");
            this.put("remove-effect-none", "&cУ Вас нет каких-либо частиц с эффектом &b{0}&c!");
            this.put("remove-style-success", "&aКоличество удалённых частиц - &b{0} &a, стилей - &b{1}&a!");
            this.put("remove-style-none", "&cУ Вас нет каких-либо частиц со стилем &b{0}&c!");
            this.put("remove-unknown", "&cЭффект или стиль под названием &b{0} &cне существует!");

            // List Command
            this.put("list-none", "&eУ вас нет каких-либо активных частиц!");
            this.put("list-you-have", "&eУ Вас есть следующие частицы:");
            this.put("list-output", "&eID: &b{0} &eЭффект: &b{1} &eСтиль: &b{2} &eДанные: &b{3}");

            // Toggle Command
            this.put("toggle-on", "&eЧастицы были &aВКЛЮЧЕНЫ&e!");
            this.put("toggle-off", "&eЧастицы были &cВЫКЛЮЧЕНЫ&e!");

            // Rainbow
            this.put("rainbow", "&cР&6а&eд&aу&bг&9а&d!");

            // Random
            this.put("random", "Random");

            // Effects
            this.put("effect-no-permission", "&cУ Вас нет прав использовать эффект &b{0} &c!");
            this.put("effect-invalid", "&cЭффект &b{0} &cне существует! Введите &b/pp effects, &cчтобы узнать доступные Вам эффекты.");
            this.put("effect-list", "&eВы можете использовать следующие эффекты: &b{0}");
            this.put("effect-list-empty", "&cУ Вас нет права использовать какие-либо эффекты!");

            // Styles
            this.put("style-no-permission", "&cУ Вас нет прав использовать стиль &b{0} &c!");
            this.put("style-event-spawning-info", "&eЗаписка: стиль &b{0} &eспавнит частицы во время Ивента.");
            this.put("style-invalid", "&cСтиль &b{0} &cне существует! Введите &b/pp styles &cчтобы узнать доступные Вам стили.");
            this.put("style-list", "&eВы можете использовать следующие стили: &b{0}");

            // Data
            this.put("data-usage-none", "&eЭффект &b{0} &eне использует какие-либо данные!");
            this.put("data-usage-block", "&eЭффект &b{0} &eзапрашивает &bблок &eданных! &bФормат: <названиеБлока>");
            this.put("data-usage-item", "&eЭффект &b{0} &eзапрашивает &bпредмет &eданных! &bФормат: <названиеПредмета>");
            this.put("data-usage-color", "&eЭффект &b{0} &eзапрашивает &bцвет &eданных! &bФормат: «0-255> <0-255> <0-255»|<rainbow>|<random>");
            this.put("data-usage-note", "&eЭффект &b{0} &eзапрашивает &bноту &eданных! &bФормат: <0-24>|<rainbow>|<random>");
            this.put("data-invalid-block", "&bБлок &cданных, который Вы ввели, недействителен! &bФормат: <названиеБлока>");
            this.put("data-invalid-item", "&bПредмет &cданных, который Вы ввели, недействителен! &bФормат: <названиеПредмета>");
            this.put("data-invalid-color", "&bЦвет &cданных, который Вы ввели, недействителен! &bФормат: «0-255> <0-255> <0-255»|<rainbow>|<random>");
            this.put("data-invalid-note", "&bНота &cданных, которую Вы ввели, недействительна! &bФормат: <0-24>|<rainbow>|<random>");
            this.put("data-invalid-material-not-item", "&bМатериал &cпредмета&b{0}&c, который Вы ввели, не является предметом!");
            this.put("data-invalid-material-not-block",  "&bМатериал &cблока&b{0}&c, который Вы ввели, не является блоком!");
            this.put("data-invalid-material-item", "&bМатериал &cпредмета&b{0}, который Вы ввели, не существует!");
            this.put("ata-invalid-material-block", "&bМатериал &cблока&b{0}, который Вы ввели, не существует!");

            // Worlds
            this.put("disabled-worlds", "&b{0} &eне поддерживает данные частицы.");
            this.put("disabled-worlds-none", "&eЧастицы не поддерживаются ни в каком мире.");

            // Reset
            this.put("reset-success", "&aУдалено &aактивных частиц - &b{0}!");

            // Fixed Effects
            this.put("fixed-create-missing-args", "&cНевозможно создать эффект, не введено запрашиваемых аргументов - &b{0}!");
            this.put("fixed-create-invalid-coords", "&cНевозможно создать эффект, одни или несколько координат, которые Вы ввели, неверны!");
            this.put("fixed-create-out-of-range", "&cНевозможно создать эффект, Вы должны быть в &b{0} &cблоках от желаемой локации!");
            this.put("fixed-create-looking-too-far", "&cНевозможно создать эффект, Вы стоите слишком далеко от блока, на который смотрите!");
            this.put("fixed-create-effect-invalid", "&cНевозможно создать эффект, эффект под названием &b{0} &cне существует!");
            this.put("fixed-create-effect-no-permission", "&cНевозможно создать эффект, у Вас нет права использовать эффект &b{0}&c!");
            this.put("fixed-create-style-invalid", "&cНевозможно создать эффект, стиль под названием &b{0} &cне существует!");
            this.put("fixed-create-style-no-permission", "&cНевозможно создать эффект, у Вас нет права использовать стиль &b{0}&c!");
            this.put("fixed-create-style-non-fixable", "&cНевозможно создать эффект, стиль &b{0} &cне может быть использован!");
            this.put("fixed-create-data-error", "&cНевозможно создать эффект, введённые данные неверны! Введите &b/pp data <Эффект>&c, чтобы найти правильный формат данных!");
            this.put("fixed-create-success", "&aВаш эффект был создан!");

            this.put("fixed-edit-missing-args", "&cНевозможно изменить эффект, Вы не ввели некоторые аргументы!");
            this.put("fixed-edit-invalid-id", "&cНевозможно изменить эффект, введённый ID недействителен или не существует!");
            this.put("fixed-edit-invalid-property", "&cНевозможно изменить эффект, указано недействительное свойство! Только &bлокация&c, &bэффект&c, &bстиль&c, и &bданные &cдействительны.");
            this.put("fixed-edit-invalid-coords", "&cНевозможно изменить эффект, одни или несколько координат, которые Вы ввели, недействительны!");
            this.put("fixed-edit-out-of-range", "&cНевозможно изменить эффект, Вы должны быть в &b{0} &cблоках от желаемой локации!");
            this.put("fixed-edit-looking-too-far", "&cНевозможно изменить эффект, Вы стоите слишком далеко от блока, на который смотрите!");
            this.put("fixed-edit-effect-invalid", "&cНевозможно изменить эффект, эффект под названием &b{0} &cне существует!");
            this.put("fixed-edit-effect-no-permission", "&cНевозможно создать эффект, у Вас нет права использовать эффект &b{0}&c!");
            this.put("fixed-edit-style-invalid", "&cНевозможно изменить эффект, стиль под названием &b{0} &cне существует!");
            this.put("fixed-edit-style-no-permission", "&cНевозможно изменить эффект, у Вас нет права использовать стиль &b{0}&c!");
            this.put("fixed-edit-style-non-fixable", "&cНевозможно изменить эффект, стиль &b{0} &cне может быть использован!");
            this.put("fixed-edit-data-error", "&cНевозможно создать эффект, введённые данные неверны! Введите &b/pp data <Эффект>&c, чтобы найти правильный формат данных!");
            this.put("fixed-edit-data-none", "&cНевозможно изменить эффект, эффект не запрашивает какие-либо данные!");
            this.put("fixed-edit-success", "&aОбновлено эффектов под ID &b{1}&a - &b{0}&a!");

            this.put("fixed-remove-invalid", "&cНевозможно удалить эффект, у Вас нет эффекта под ID &b{0}&c!");
            this.put("fixed-remove-no-args", "&cYou did not specify an ID to remove!");
            this.put("fixed-remove-args-invalid", "&cНевозможно удалить, введённый ID должен состоять из чисел!");
            this.put("fixed-remove-success", "&aВаш эффект под ID &b{0} &aбыл удалён!");

            this.put("fixed-list-none", "&eУ Вас нет каких-либо эффектов!");
            this.put("fixed-list-success", "&eУ Вас есть эффекты с этими ID: &b{0}");

            this.put("fixed-info-invalid", "&cНевозможно получить информацию, у Вас нет эффекта под ID &b{0}&c!");
            this.put("fixed-info-no-args", "&cВы не ввели ID, по которому нужно узнать информацию!");
            this.put("fixed-info-invalid-args", "&cНевозможно получить информацию, введённый ID должен состоять из чисел!");
            this.put("fixed-info-success", "&eID: &b{0} &eМир: &b{1} &eX: &b{2} &eY: &b{3} &eZ: &b{4} &eЭффект: &b{5} &eСтиль: &b{6} &eДанные: &b{7}");

            this.put("fixed-clear-no-permission", "&cУ Вас нет права, чтобы убрать ближайшие эффекты!");
            this.put("fixed-clear-no-args", "&cВы не ввели радиус, на котором необходимо убрать эффекты!");
            this.put("fixed-clear-invalid-args", "&cВведённый радиус недействителен, это должно быть целое число!");
            this.put("fixed-clear-success", "&aУбрано эффектов  - &b{0}&a!");

            this.put("fixed-no-permission", "&cУ Вас нет права, чтобы использовать этот эффект!");
            this.put("fixed-max-reached", "&cВы достигли максимального количества эффектов!");
            this.put("fixed-invalid-command", "&cНедействительная команда для &b/pp fixed&c!");

            // Update Available
            this.put("update-available", "&eОбновление (&b{0}&e) доступно! Ваша версия - &bv{1}&e. https://www.spigotmc.org/resources/playerparticles.40261/");

            // GUI
            this.put("gui-disabled", "&cАдминистратор отключил интерфейс!");
            this.put("gui-color-icon-name", "&a");
            this.put("gui-color-info", "&e");
            this.put("gui-color-subtext", "&b");
            this.put("gui-color-unavailable", "&c");
            this.put("gui-commands-info", "Узнать подробнее о командах - &b/pp help");
            this.put("gui-back-button", "Назад");
            this.put("gui-next-page-button", "Следующая страница ({0}/{1})");
            this.put("gui-previous-page-button", "Предыдущая страница ({0}/{1})");
            this.put("gui-click-to-load", "Доступны {0} частицы для загрузки:");
            this.put("gui-shift-click-to-delete", "Shift+ЛКМ для удаления");
            this.put("gui-particle-info", " - ID: &b{0} &eЭффект: &b{1} &eСтиль: &b{2} &eДанные: &b{3}");
            this.put("gui-playerparticles", "Выбор частиц");
            this.put("gui-active-particles", "Активные частицы - &b{0}");
            this.put("gui-saved-groups", "Сохранённые группы - &b{0}");
            this.put("gui-fixed-effects", "Эффекты - &b{0}");
            this.put("gui-edit-primary-effect", "Изменить эффект");
            this.put("gui-edit-primary-effect-description", "Изменение эффекта Ваших частиц");
            this.put("gui-edit-primary-style", "Изменить стиль");
            this.put("gui-edit-primary-style-missing-effect", "Для начала выберите эффект");
            this.put("gui-edit-primary-style-description", "Изменение стиля Ваших частиц");
            this.put("gui-edit-primary-data", "Изменить данные");
            this.put("gui-edit-primary-data-missing-effect", "Для начала выберите эффект");
            this.put("gui-edit-primary-data-unavailable", "Ваш эффект не использует какие-либо данные");
            this.put("gui-edit-primary-data-description", "Изменение данных Ваших частиц");
            this.put("gui-manage-your-particles", "Создать свой эффект");
            this.put("gui-manage-your-particles-description", "Создание, изменение и удаление Ваших частиц");
            this.put("gui-manage-your-groups", "Управление группами");
            this.put("gui-manage-your-groups-description", "Создание, изменение и удаление Ваших групп");
            this.put("gui-load-a-preset-group", "Установить группу");
            this.put("gui-load-a-preset-group-description", "Установка готовой группы частиц");
            this.put("gui-save-group", "Сохранить новую группу");
            this.put("gui-save-group-description", "Нажмите, чтобы сохранить группу. Вам нужно будет ввести новое название группы в чат.");
            this.put("gui-save-group-full", "Вы достигли максимального числа групп!");
            this.put("gui-save-group-no-particles", "У Вас нет каких-либо активных частиц!");
            this.put("gui-save-group-hotbar-message", "&eВведите &b1 &eслово в чат, которое будет названием группы. Введите &cотмена&e для отмены.");
            this.put("gui-reset-particles", "Удалить ваши частицы");
            this.put("gui-reset-particles-description", "Убирает все Ваши активные частицы");
            this.put("gui-particle-name", "Частицы #{0}");
            this.put("gui-click-to-edit-particle", "Нажмите, чтобы изменить эффект, стиль или данные частиц");
            this.put("gui-editing-particle", "Изменение частиц #{0}");
            this.put("gui-edit-effect", "Изменить эффект");
            this.put("gui-edit-effect-description", "Нажмите, чтобы изменить эффект частиц");
            this.put("gui-edit-style", "Изменить стиль");
            this.put("gui-edit-style-description", "Нажмите, чтобы изменить стиль частиц");
            this.put("gui-edit-data", "Изменить данные");
            this.put("gui-edit-data-description", "Нажмите, чтобы изменить данные частиц");
            this.put("gui-edit-data-unavailable", "Эффект этих частиц не использует каких-либо данных");
            this.put("gui-data-none", "пусто");
            this.put("gui-create-particle", "Создать новые частицы");
            this.put("gui-create-particle-description", "Создать новые частицы с эффектом, стилем и данными");
            this.put("gui-create-particle-unavailable", "Вы достигли максимального числа частиц, которые можно создать");
            this.put("gui-select-effect", "Выбор эффекта частиц");
            this.put("gui-select-effect-description", "Выбрать эффект для частиц &b{0}");
            this.put("gui-select-style", "Выбор стиля частиц");
            this.put("gui-select-style-description", "Выбрать стиль для частиц &b{0}");
            this.put("gui-select-data", "Выбор данных частиц");
            this.put("gui-select-data-description", "Выбрать данные для частиц &b{0}");
            this.put("gui-select-data-note", "записка #{0}");
        }};
    }
}

package settings;

public enum Language {
    EN("English", "EnglishSet", "English \uD83C\uDDFA\uD83C\uDDF8"),
    UA("Ukrainian", "UkrainianSet", "Українська \uD83C\uDDFA\uD83C\uDDE6"),
    PL("Polish", "PolishSet", "Polski \uD83C\uDDF5\uD83C\uDDF1"),
    CZ("Czech", "CzechSet", "Čeština 🇨🇿"),
    RU("Russian", "RussianSet", "Русский \uD83C\uDDF7\uD83C\uDDFA");

    String langName;
    String langNameSet;
    String langFlag;

    Language(String langName, String langNameSet, String langFlag) {
        this.langName = langName;
        this.langFlag = langFlag;
        this.langNameSet = langNameSet;
    }


    public String getLangName() {
        return langName;
    }

    public String getLangNameSet() {
        return langNameSet;
    }

    public String getLangFlag() {
        return langFlag;
    }

    public static Language convertToEnum(String text) {
        for (Language lang : Language.values()) {
            if (lang.getLangName().equals(text)) {
                return lang;
            }
        }
        return null;
    }

    public static Language convertToEnumSet(String text) {
        for (Language lang : Language.values()) {
            if (lang.getLangNameSet().equals(text)) {
                return lang;
            }
        }
        return null;
    }

    public static String translate(String text, Language language) {
        switch (text) {
            case "Курс купівлі ":
                switch (language) {
                    case EN:
                        return "Purchase fx rate ";
                    case PL:
                        return "Kurs kupna ";
                    case CZ:
                        return "Nákup ";
                    default:
                        return text;
                }
            case "Курс продажу ":
                switch (language) {
                    case EN:
                        return "Sales fx rate ";
                    case PL:
                        return "Kurs sprzedaży ";
                    case CZ:
                        return "Prodej ";
                    default:
                        return text;
                }
            case "немає купівлі":
                switch (language) {
                    case EN:
                        return "no purchase";
                    case PL:
                        return "brak zakupu";
                    case CZ:
                        return "žádný nákup";
                    default:
                        return text;
                }
            case "немає продажу":
                switch (language) {
                    case EN:
                        return "no sale";
                    case PL:
                        return "brak sprzedaży";
                    case CZ:
                        return "žádný prodej";
                    default:
                        return text;
                }
            case "Будь ласка впишіть /start або натисніть кнопку.":
                switch (language) {
                    case EN:
                        return "Please type /start or press the button.";
                    case PL:
                        return "Proszę wpisz /start lub naciśnij klawisz.";
                    case CZ:
                        return "Prosím napište /start nebo stiskněte tlačítko.";
                    default:
                        return text;
                }
            case "Щоб отримати інфо натисність кнопку":
                switch (language) {
                    case EN:
                        return "For get info please press the button";
                    case PL:
                        return "Aby uzyskać informację naciśnij klawisz";
                    case CZ:
                        return "Pro získání informací stiskněte prosím tlačítko";
                    default:
                        return text;
                }
            case "Виберіть налаштування":
                switch (language) {
                    case EN:
                        return "Please choose options";
                    case PL:
                        return "Proszę wybrać preferowane ustawienia";
                    case CZ:
                        return "Vyberte prosím preferovaná nastavení";
                    default:
                        return text;
                }
            case "Ласкаво просимо. Цей бот дозволить відслідкувати актуальні курси валют.":
                switch (language) {
                    case EN:
                        return "Welcome. This bot will help you to follow up current fx rates.";
                    case PL:
                        return "Witamy. Ten bot pomoże śledzić aktualne kursy walut.";
                    case CZ:
                        return "Vítejte. Tento bot vám pomůže sledovat aktuální měnové kurzy.";
                    default:
                        return text;
                }
            case "Підтвердити":
                switch (language) {
                    case EN:
                        return "Confirm";
                    case PL:
                        return "Zatwierdzić";
                    case CZ:
                        return "Potvrdit";
                    default:
                        return text;
                }
            case "Оберіть за курсом якого банку ви хочете розрахувати обмін валют.":
                switch (language) {
                    case EN:
                        return "Select the bank for which you want to calculate the currency conversion.";
                    case PL:
                        return "Wybierz bank, dla którego chcesz obliczyć przewalutowanie.";
                    case CZ:
                        return "Vyberte banku, pro kterou chcete směnu vypočítat.";
                    default:
                        return text;
                }
            case "Оберіть валюту з якої ви хочете здійснити обмін.":
                switch (language) {
                    case EN:
                        return "Select the currency you want to exchange from.";
                    case PL:
                        return "Wybierz walutę, z której chcesz dokonać wymiany.";
                    case CZ:
                        return "Vyberte měnu, ze které chcete směnit.";
                    default:
                        return text;
                }
            case "Оберіть валюту на яку ви хочете здійснити обмін.":
                switch (language) {
                    case EN:
                        return "Select the currency you want to exchange.";
                    case PL:
                        return "Wybierz walutę, na którą chcesz wymienić.";
                    case CZ:
                        return "Vyberte měnu, za kterou chcete směnit.";
                    default:
                        return text;
                }
            case "Оберіть в якій валюті ви бажаєте ввести суму обміну.":
                switch (language) {
                    case EN:
                        return "Select the currency in which you want to enter the exchange amount.";
                    case PL:
                        return "Wybierz walutę, w której chcesz wprowadzić kwotę wymiany.";
                    case CZ:
                        return "Vyberte měnu, ve které chcete zadat částku výměny.";
                    default:
                        return text;
                }

            case "Відправте боту суму яку ви хочете обміняти. Зверніть увагу що приймаються лише числа.":
                switch (language) {
                    case EN:
                        return "Send the bot the amount you want to exchange. Please note that only numbers are accepted.";
                    case PL:
                        return "Wyślij botowi kwotę, którą chcesz wymienić. Pamiętaj, że akceptowane są tylko liczby.";
                    case CZ:
                        return "Pošlete robotovi částku, kterou chcete vyměnit. Upozorňujeme, že jsou přijímána pouze čísla.";
                    default:
                        return text;
                }
            case "Відправте боту суму яку ви хочете отримати. Зверніть увагу що приймаються лише числа.":
                switch (language) {
                    case EN:
                        return "Send the bot the amount you want to receive. Please note that only numbers are accepted.";
                    case PL:
                        return "Wyślij botowi kwotę, którą chcesz otrzymać. Pamiętaj, że akceptowane są tylko liczby.";
                    case CZ:
                        return "Pošlete robotovi částku, kterou chcete obdržet. Upozorňujeme, že jsou přijímána pouze čísla.";
                    default:
                        return text;
                }

            case "Ви ввели не правильну суму. Конвертувати можна сумму від 0,1 до 10000000.":
                switch (language) {
                    case EN:
                        return "You entered the wrong amount. You can convert the amount from 0.1 to 10000000.";
                    case PL:
                        return "Wpisałeś niewłaściwą kwotę. Możesz przeliczyć kwotę od 0,1 do 10000000.";
                    case CZ:
                        return "Zadali jste nesprávnou částku. Můžete vyměnit částku od 0,1 do 1 000 000.";
                    default:
                        return text;
                }

            case "При обміні ":
                switch (language) {
                    case EN:
                        return "When you exchange ";
                    case PL:
                        return "Kiedy wymienisz ";
                    case CZ:
                        return "Když si směníte ";
                    default:
                        return text;
                }

            case " ви отримаєте ":
                switch (language) {
                    case EN:
                        return ", you will receive ";
                    case PL:
                        return ", otrzymasz ";
                    case CZ:
                        return ", dostanete ";
                    default:
                        return text;
                }

            case "Для отримання ":
                switch (language) {
                    case EN:
                        return "To get ";
                    case PL:
                        return "Aby otrzymać ";
                    case CZ:
                        return "K získání ";
                    default:
                        return text;
                }

            case " вам необхідно ":
                switch (language) {
                    case EN:
                        return " you need ";
                    case PL:
                        return ", potrzebujesz ";
                    case CZ:
                        return ", potřebujete ";
                    default:
                        return text;
                }

        }
        return "";
    }

    public static String getConvertSettings(Long chatId, Language selectedLanguage) {
        StringBuilder sb = new StringBuilder();

        String title = null;
        String selectedBank = null;
        String selectedCurrency = null;
        if (selectedLanguage == Language.UA) {
            title = "Обрані параметри: \n";
            selectedBank = "Банк: ";
            selectedCurrency = "Валюти обміну:";
        }
        if (selectedLanguage == Language.EN) {
            title = "Selected parameters: \n";
            selectedBank = "Bank: ";
            selectedCurrency = "Exchange currencies:";
        }
        if (selectedLanguage == Language.PL) {
            title = "Wybrane parametry: \n";
            selectedBank = "Bank: ";
            selectedCurrency = "Wymieniaj waluty:";
        }
        if (selectedLanguage == Language.CZ) {
            title = "Vybrané parametry: \n";
            selectedBank = "Banka: ";
            selectedCurrency = "Směnné měny:";
        }

        ConverterSetting converterSetting = ConverterSettings.converterSettings.get(chatId);
        if (converterSetting != null) {
            if (converterSetting.getSelectBank() != null) {
                sb.append(title)
                        .append(selectedBank)
                        .append(converterSetting.getSelectBank());
            }
            if (converterSetting.getSellCurrency() != null) {
                sb.append("\n")
                        .append(selectedCurrency)
                        .append("  ")
                        .append(converterSetting.getSellCurrency())
                        .append(" -> ");
            }
            if (converterSetting.getBuyCurrency() != null) {
                sb.append(converterSetting.getBuyCurrency());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

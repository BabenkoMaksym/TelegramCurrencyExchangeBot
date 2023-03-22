package settings;

public enum Buttons {
    START("Старт", "/start", "/start", "/start"),
    CONVERTER("Конвертер валют", "Currency converter",
            "Przelicznik walut", "Převodník měn"),
    GET_INFO("Отримати інфо", "Get info",
            "Otrzymać informację", "Získat informace"),
    SETTINGS("Налаштування", "Settings", "Ustawienia", "Nastavení"),
    NUM_DECIMAL_PLACES("Кількість знаків після коми", "Number of decimal places",
            "Liczba miejsc po przecinku", "Počet desetinných míst"),
    BANK("Банк", "Bank", "Bank", "Banka"),
    CURRENCY("Валюта", "Currency", "Waluta", "Měna"),
    NOTIFICATION("Час сповіщення", "Notification time",
            "Czas powiadomienia", "Čas oznámení"),
    ZONEID("Часовий пояс", "Time zone",
            "Strefa czasowa", "Časové pásmo"),
    LANGUAGE("Мова", "Language", "Język", "Jazyk"),
    BACK("↩️", "Settings", "Settings", "Settings"),
    BACK_TO_START("🏠️", "BACK_TO_START", "BACK_TO_START", "BACK_TO_START"),
    INSERT_SELL_CURRENCY("У валюті з якої хочемо обміняти",
            "In the currency from which we want to exchange",
            "W walucie, z której chcemy dokonać wymiany",
            "V měně, ze které chceme směnit"),
    INSERT_BUY_CURRENCY("У валюті яку хочемо купити",
            "In the currency we want to buy",
            "W walucie, którą chcemy kupić",
            "V měně, kterou chceme koupit");

    private String buttonsNameUA;
    private String buttonsNameEN;
    private String buttonsNamePL;
    private String buttonsNameCZ;

    Buttons(String buttonsNameUA, String buttonsNameEN, String buttonsNamePL, String buttonsNameCZ) {
        this.buttonsNameUA = buttonsNameUA;
        this.buttonsNameEN = buttonsNameEN;
        this.buttonsNamePL = buttonsNamePL;
        this.buttonsNameCZ = buttonsNameCZ;
    }

    public String getNameUA() {
        return buttonsNameUA;
    }

    public String getNameEN() {
        return buttonsNameEN;
    }
    public String getNamePL() {
        return buttonsNamePL;
    }
    public String getNameCZ() {
        return buttonsNameCZ;
    }

    public static Buttons convertToEnum(String text) {
        for (Buttons button : Buttons.values()) {
            if (button.getNameEN().equals(text)) {
                return button;
            }
        }
        return null;
    }
}

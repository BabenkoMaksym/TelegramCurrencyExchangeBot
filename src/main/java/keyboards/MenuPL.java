package keyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import settings.Buttons;
import settings.Currency;
import settings.Setting;
import settings.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuPL extends Menu{
    public MenuPL(Settings settings) {
        super(settings);
    }

    @Override
    public InlineKeyboardMarkup keyboardSettings(Setting setting) {
        String selectedCurr = setting.getSelectedCurrency().stream()
                .map(Currency::getCurrencyName)
                .collect(Collectors.joining(", ", "(", ")"));

        List<List<InlineKeyboardButton>> keyboardMenuSettings = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow6 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow7 = new ArrayList<>();
        InlineKeyboardButton buttonNumOfDecPlaces = InlineKeyboardButton.builder()
                .text(Buttons.NUM_DECIMAL_PLACES.getNamePL() + " (" + setting.getNumberOfDecimalPlaces() + ")")
                .callbackData(Buttons.NUM_DECIMAL_PLACES.getNameEN())
                .build();
        InlineKeyboardButton buttonBank = InlineKeyboardButton.builder()
                .text(Buttons.BANK.getNamePL() + " (" + setting.getSelectedBank().getBankNameEN() + ")")
                .callbackData(Buttons.BANK.getNameEN())
                .build();
        InlineKeyboardButton buttonCurrency = InlineKeyboardButton.builder()
                .text(Buttons.CURRENCY.getNamePL() + selectedCurr)
                .callbackData(Buttons.CURRENCY.getNameEN())
                .build();
        String NotificationTimeSet = setting.getNotificationTime().getTime() == 0 ? "OFF" :
                String.valueOf(setting.getNotificationTime().getTime());
        InlineKeyboardButton buttonNotificationTime = InlineKeyboardButton.builder()
                .text(Buttons.NOTIFICATION.getNamePL() + " (" + NotificationTimeSet + ")")
                .callbackData(Buttons.NOTIFICATION.getNameEN())
                .build();
        InlineKeyboardButton buttonZoneId = InlineKeyboardButton.builder()
                .text(Buttons.ZONEID.getNamePL() + " (" + setting.getZoneId().getNameZone() + ")")
                .callbackData(Buttons.ZONEID.getNameEN())
                .build();
        InlineKeyboardButton buttonLang = InlineKeyboardButton.builder()
                .text(Buttons.LANGUAGE.getNamePL() + " (" + setting.getSelectedLanguage().getLangFlag() + ")")
                .callbackData(Buttons.LANGUAGE.getNameEN())
                .build();
        InlineKeyboardButton buttonBack = InlineKeyboardButton.builder()
                .text(Buttons.BACK_TO_START.getNameUA())
                .callbackData(Buttons.BACK_TO_START.getNameEN())
                .build();

        keyboardMSetRow1.add(buttonNumOfDecPlaces);
        keyboardMSetRow2.add(buttonBank);
        keyboardMSetRow3.add(buttonCurrency);
        keyboardMSetRow4.add(buttonNotificationTime);
        keyboardMSetRow5.add(buttonZoneId);
        keyboardMSetRow6.add(buttonLang);
        keyboardMSetRow7.add(buttonBack);
        keyboardMenuSettings.add(keyboardMSetRow1);
        keyboardMenuSettings.add(keyboardMSetRow2);
        keyboardMenuSettings.add(keyboardMSetRow3);
        keyboardMenuSettings.add(keyboardMSetRow4);
        keyboardMenuSettings.add(keyboardMSetRow5);
        keyboardMenuSettings.add(keyboardMSetRow6);
        keyboardMenuSettings.add(keyboardMSetRow7);

        return InlineKeyboardMarkup.builder().keyboard(keyboardMenuSettings).build();
    }

    @Override
    public InlineKeyboardMarkup keyboardConverterLvl4(Long chatId) {
        List<List<InlineKeyboardButton>> keyboardSelectSellOrBuyCurrency = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow3 = new ArrayList<>();
        InlineKeyboardButton selectSellCurrency = InlineKeyboardButton.builder()
                .text(Buttons.INSERT_SELL_CURRENCY.getNamePL())
                .callbackData(Buttons.INSERT_SELL_CURRENCY.getNameEN())
                .build();
        InlineKeyboardButton selectBuyCurrency = InlineKeyboardButton.builder()
                .text(Buttons.INSERT_BUY_CURRENCY.getNamePL())
                .callbackData(Buttons.INSERT_BUY_CURRENCY.getNameEN())
                .build();
        InlineKeyboardButton buttonHome = InlineKeyboardButton.builder()
                .text(Buttons.BACK_TO_START.getNameUA())
                .callbackData(Buttons.BACK_TO_START.getNameEN())
                .build();
        InlineKeyboardButton buttonBack = InlineKeyboardButton.builder()
                .text(Buttons.BACK.getNameUA())
                .callbackData("back_to_3_lvl")
                .build();
        keyboardMSRow1.add(selectSellCurrency);
        keyboardMSRow2.add(selectBuyCurrency);
        keyboardMSRow3.add(buttonHome);
        keyboardMSRow3.add(buttonBack);
        keyboardSelectSellOrBuyCurrency.add(keyboardMSRow1);
        keyboardSelectSellOrBuyCurrency.add(keyboardMSRow2);
        keyboardSelectSellOrBuyCurrency.add(keyboardMSRow3);

        return InlineKeyboardMarkup.builder().keyboard(keyboardSelectSellOrBuyCurrency).build();
    }

    @Override
    public InlineKeyboardMarkup keyboardStart() {
        List<List<InlineKeyboardButton>> keyboardMenuStart = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSRow3 = new ArrayList<>();
        InlineKeyboardButton buttonGetInfo = InlineKeyboardButton.builder()
                .text(Buttons.GET_INFO.getNamePL())
                .callbackData(Buttons.GET_INFO.getNameEN())
                .build();
        InlineKeyboardButton buttonConverter = InlineKeyboardButton.builder()
                .text(Buttons.CONVERTER.getNamePL())
                .callbackData(Buttons.CONVERTER.getNameEN())
                .build();
        InlineKeyboardButton buttonSettings = InlineKeyboardButton.builder()
                .text(Buttons.SETTINGS.getNamePL())
                .callbackData(Buttons.SETTINGS.getNameEN())
                .build();
        keyboardMSRow1.add(buttonGetInfo);
        keyboardMSRow2.add(buttonConverter);
        keyboardMSRow3.add(buttonSettings);
        keyboardMenuStart.add(keyboardMSRow1);
        keyboardMenuStart.add(keyboardMSRow2);
        keyboardMenuStart.add(keyboardMSRow3);
        return InlineKeyboardMarkup.builder().keyboard(keyboardMenuStart).build();
    }
}

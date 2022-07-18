package keyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MenuSettings {
    public static InlineKeyboardMarkup keyboard() {
        List<List<InlineKeyboardButton>> keyboardMenuSettings = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMSetRow5 = new ArrayList<>();
        InlineKeyboardButton buttonNumOfDecPlaces = InlineKeyboardButton.builder()
                .text("Кількість знаків після коми")
                .callbackData("NumDecimalPlaces")
                .build();
        InlineKeyboardButton buttonBank = InlineKeyboardButton.builder()
                .text("Банк")
                .callbackData("Bank")
                .build();
        InlineKeyboardButton buttonCurrency = InlineKeyboardButton.builder()
                .text("Валюта")
                .callbackData("Currency")
                .build();
        InlineKeyboardButton buttonNotificationTime = InlineKeyboardButton.builder()
                .text("Час сповіщення")
                .callbackData("Notification")
                .build();
        InlineKeyboardButton buttonBack = InlineKeyboardButton.builder()
                .text("Повернутись до попереднього меню")
                .callbackData("BackToSettings")
                .build();
        keyboardMSetRow1.add(buttonNumOfDecPlaces);
        keyboardMSetRow2.add(buttonBank);
        keyboardMSetRow3.add(buttonCurrency);
        keyboardMSetRow4.add(buttonNotificationTime);
        keyboardMSetRow5.add(buttonBack);
        keyboardMenuSettings.add(keyboardMSetRow1);
        keyboardMenuSettings.add(keyboardMSetRow2);
        keyboardMenuSettings.add(keyboardMSetRow3);
        keyboardMenuSettings.add(keyboardMSetRow4);
        keyboardMenuSettings.add(keyboardMSetRow5);

        return InlineKeyboardMarkup.builder().keyboard(keyboardMenuSettings).build();
    }
}

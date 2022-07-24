package keyboards;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import settings.Buttons;
import settings.ZoneId;

import java.util.ArrayList;
import java.util.List;

public class MenuZoneId {
    public static InlineKeyboardMarkup keyboard() {
        List<List<InlineKeyboardButton>> keyboardMZoneId =  new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow6 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardMZoneIdRow7 = new ArrayList<>();
        InlineKeyboardButton buttonZoneIdOne = InlineKeyboardButton.builder()
                .text(ZoneId.UTCONE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCONE))
                .callbackData(ZoneId.UTCONE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdTwo = InlineKeyboardButton.builder()
                .text(ZoneId.UTCTWO.getZone() + ZoneId.getButtonStatus(ZoneId.UTCTWO))
                .callbackData(ZoneId.UTCTWO.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdThree = InlineKeyboardButton.builder()
                .text(ZoneId.UTCTHREE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCTHREE))
                .callbackData(ZoneId.UTCTHREE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdFour = InlineKeyboardButton.builder()
                .text(ZoneId.UTCFOUR.getZone() + ZoneId.getButtonStatus(ZoneId.UTCFOUR))
                .callbackData(ZoneId.UTCFOUR.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdFive = InlineKeyboardButton.builder()
                .text(ZoneId.UTCFIVE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCFIVE))
                .callbackData(ZoneId.UTCFIVE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdSix = InlineKeyboardButton.builder()
                .text(ZoneId.UTCSIX.getZone() + ZoneId.getButtonStatus(ZoneId.UTCSIX))
                .callbackData(ZoneId.UTCSIX.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdSeven = InlineKeyboardButton.builder()
                .text(ZoneId.UTCSEVEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCSEVEN))
                .callbackData(ZoneId.UTCSEVEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdEight = InlineKeyboardButton.builder()
                .text(ZoneId.UTCEIGHT.getZone() + ZoneId.getButtonStatus(ZoneId.UTCEIGHT))
                .callbackData(ZoneId.UTCEIGHT.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdNine = InlineKeyboardButton.builder()
                .text(ZoneId.UTCNINE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCNINE))
                .callbackData(ZoneId.UTCNINE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdTen = InlineKeyboardButton.builder()
                .text(ZoneId.UTCTEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCTEN))
                .callbackData(ZoneId.UTCTEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdEleven = InlineKeyboardButton.builder()
                .text(ZoneId.UTCELEVEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCELEVEN))
                .callbackData(ZoneId.UTCELEVEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdTwelve = InlineKeyboardButton.builder()
                .text(ZoneId.UTCTWELVE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCTWELVE))
                .callbackData(ZoneId.UTCTWELVE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMOne = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSONE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSONE))
                .callbackData(ZoneId.UTCMINUSONE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMTwo = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSTWO.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSTWO))
                .callbackData(ZoneId.UTCMINUSTWO.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMThree = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSTHREE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSTHREE))
                .callbackData(ZoneId.UTCMINUSTHREE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMFour = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSFOUR.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSFOUR))
                .callbackData(ZoneId.UTCMINUSFOUR.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMFive = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSFIVE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSFIVE))
                .callbackData(ZoneId.UTCMINUSFIVE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMSix = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSSIX.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSSIX))
                .callbackData(ZoneId.UTCMINUSSIX.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMSeven = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSSEVEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSSEVEN))
                .callbackData(ZoneId.UTCMINUSSEVEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdOMEight = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSEIGHT.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSEIGHT))
                .callbackData(ZoneId.UTCMINUSEIGHT.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMNine = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSNINE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSNINE))
                .callbackData(ZoneId.UTCMINUSNINE.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMTen = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSTEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSTEN))
                .callbackData(ZoneId.UTCMINUSTEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMEleven = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSELEVEN.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSELEVEN))
                .callbackData(ZoneId.UTCMINUSELEVEN.getNameZone())
                .build();
        InlineKeyboardButton buttonZoneIdMTwelve = InlineKeyboardButton.builder()
                .text(ZoneId.UTCMINUSTWELVE.getZone() + ZoneId.getButtonStatus(ZoneId.UTCMINUSTWELVE))
                .callbackData(ZoneId.UTCMINUSTWELVE.getNameZone())
                .build();
        InlineKeyboardButton buttonBackToSetting = InlineKeyboardButton.builder()
                .text(Buttons.BACK_TO_SETTINGS.getName())
                .callbackData(Buttons.BACK_TO_SETTINGS.getNameEN())
                .build();

        keyboardMZoneIdRow1.add(buttonZoneIdOne);
        keyboardMZoneIdRow1.add(buttonZoneIdTwo);
        keyboardMZoneIdRow1.add(buttonZoneIdThree);
        keyboardMZoneIdRow1.add(buttonZoneIdFour);

        keyboardMZoneIdRow2.add(buttonZoneIdFive);
        keyboardMZoneIdRow2.add(buttonZoneIdSix);
        keyboardMZoneIdRow2.add(buttonZoneIdSeven);
        keyboardMZoneIdRow2.add(buttonZoneIdEight);

        keyboardMZoneIdRow3.add(buttonZoneIdNine);
        keyboardMZoneIdRow3.add(buttonZoneIdTen);
        keyboardMZoneIdRow3.add(buttonZoneIdEleven);
        keyboardMZoneIdRow3.add(buttonZoneIdTwelve);

        keyboardMZoneIdRow4.add(buttonZoneIdMOne);
        keyboardMZoneIdRow4.add(buttonZoneIdMTwo);
        keyboardMZoneIdRow4.add(buttonZoneIdMThree);
        keyboardMZoneIdRow4.add(buttonZoneIdMFour);

        keyboardMZoneIdRow5.add(buttonZoneIdMFive);
        keyboardMZoneIdRow5.add(buttonZoneIdMSix);
        keyboardMZoneIdRow5.add(buttonZoneIdMSeven);
        keyboardMZoneIdRow5.add(buttonZoneIdOMEight);

        keyboardMZoneIdRow6.add(buttonZoneIdMNine);
        keyboardMZoneIdRow6.add(buttonZoneIdMTen);
        keyboardMZoneIdRow6.add(buttonZoneIdMEleven);
        keyboardMZoneIdRow6.add(buttonZoneIdMTwelve);

        keyboardMZoneIdRow7.add(buttonBackToSetting);



        keyboardMZoneId.add(keyboardMZoneIdRow1);
        keyboardMZoneId.add(keyboardMZoneIdRow2);
        keyboardMZoneId.add(keyboardMZoneIdRow3);
        keyboardMZoneId.add(keyboardMZoneIdRow4);
        keyboardMZoneId.add(keyboardMZoneIdRow5);
        keyboardMZoneId.add(keyboardMZoneIdRow6);
        keyboardMZoneId.add(keyboardMZoneIdRow7);

        return InlineKeyboardMarkup.builder().keyboard(keyboardMZoneId).build();
    }
}

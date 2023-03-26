package banksUtil;

import org.telegram.telegrambots.meta.api.objects.Message;
import serviceClasses.Bank;
import serviceClasses.CurrencyDataBase;
import settings.*;

public class Converter {

    public String convert(Long chatId, Message message, Settings settings) {
        Long numeric = null;
        Float result = null;
         try {
             numeric = Long.parseLong(message.getText());
         } catch (NumberFormatException ex) {
             ex.printStackTrace();
         }
         if (numeric != null) {
             if (numeric > 0 && numeric <=10000000.00f) {
                 CurrencyDataBase currencyDataBase = settings.getCurrencyDataBase();
                 ConverterSetting converterSetting = ConverterSettings.converterSettings.get(chatId);
                 Banks selectBank = converterSetting.getSelectBank();
                 Bank bank = currencyDataBase.currentInfo.get(selectBank);
                 Currency sellCurrency = converterSetting.getSellCurrency();
                 Currency buyCurrency = converterSetting.getBuyCurrency();
                 if (sellCurrency == Currency.UAH) {
                     result = (converterSetting.getProcedure() == ConverterSetting.Procedure.SELL) ?
                             numeric / bank.getSellRate(buyCurrency) : numeric * bank.getSellRate(buyCurrency);
                 } else if (buyCurrency == Currency.UAH) {
                     result = (converterSetting.getProcedure() == ConverterSetting.Procedure.SELL) ?
                             numeric * bank.getBuyRate(sellCurrency) : numeric / bank.getBuyRate(sellCurrency);
                 } else {
                     result = (converterSetting.getProcedure() == ConverterSetting.Procedure.SELL) ?
                             numeric * bank.getBuyRate(sellCurrency) / bank.getSellRate(buyCurrency) :
                             numeric * bank.getSellRate(buyCurrency) / bank.getBuyRate(sellCurrency);
                 }
                 if (converterSetting.getProcedure() == ConverterSetting.Procedure.SELL) {
                     converterSetting.setSellCount(numeric);
                     converterSetting.setBuyCount(result);
                 } else {
                     converterSetting.setSellCount(result);
                     converterSetting.setBuyCount(numeric);
                 }
                 ConverterSettings.converterSettings.put(chatId, converterSetting);
             } else {
                 result = -1.00f;
             }
         }
        return result.toString();
    }

    private String convertFrom() {
        return null;
    }
    private String convertTo() {
        return null;
    }

}

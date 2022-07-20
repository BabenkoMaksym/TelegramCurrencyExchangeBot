import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class AppLauncher  {
    public static void main(String[] args) throws TelegramApiException {
        CurrencyInfoBot currencyInfoBot = CurrencyInfoBot.getInstance("currencyInfoBot");
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(currencyInfoBot);
    }
}

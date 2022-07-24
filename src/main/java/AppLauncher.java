
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class AppLauncher {
    public static void main(String[] args) throws TelegramApiException {
        Timer timer = new Timer();
        Thread messageInTime = new Thread(timer);
        messageInTime.start();
        CurrencyInfoBot currencyInfoBot = CurrencyInfoBot.getInstance("currencyInfoBot");
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(currencyInfoBot);
    }
}

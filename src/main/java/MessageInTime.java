
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.Duration;
import java.time.LocalDateTime;

public class MessageInTime extends CurrencyInfoBot implements Runnable {
    private long chatId;
    private int hour = 12;
    public void setChatId(long chatId) {
        this.chatId = chatId;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    @Override
    public void run() {
        while (true) {
            appointedTime();
            try {
                execute(SendMessage.builder()
                        .text("all working")
                        .chatId(chatId)
                        .build());
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void appointedTime() {
        try {
            Thread.sleep(1010);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LocalDateTime dateNow = LocalDateTime.now();
        int SECOND = 0;
        int MINUTE = 0;
        LocalDateTime appointedTime = LocalDateTime.now().withHour(hour).withMinute(MINUTE).withSecond(SECOND);
        if (dateNow.isAfter(appointedTime)) {
            appointedTime = appointedTime.plusDays(1);
        }
        long toStartMessage = Duration.between(dateNow, appointedTime).toMillis();
        System.out.println(toStartMessage);
        try {
            Thread.sleep(toStartMessage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

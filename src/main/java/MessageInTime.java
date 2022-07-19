
import java.time.Duration;
import java.time.LocalDateTime;

public class MessageInTime implements Runnable {
    private long chatId;
    private int hour = 19;

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }


    @Override
    public void run() {
        while (true) {
            appointedTime();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void appointedTime() {
        LocalDateTime dateNow = LocalDateTime.now();
        int SECOND = 0;
        int MINUTE = 25;
        LocalDateTime appointedTime = LocalDateTime.now().withHour(hour).withMinute(MINUTE).withSecond(SECOND);

        if (dateNow.isAfter(appointedTime)) {
            appointedTime = appointedTime.plusDays(1);
        }
        long toStartMessage = Duration.between(dateNow, appointedTime).toMillis();
        try {
            Thread.sleep(toStartMessage);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

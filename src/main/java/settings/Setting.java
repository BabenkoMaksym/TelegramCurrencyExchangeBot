package settings;

import java.util.List;

public class Setting {
    private long chatId;
    private NumberOfDecimalPlaces numberOfDecimalPlaces;
    private Banks selectedBank;
    private List<Currency> selectedCurrency;
    private NotificationTime notificationTime;
    private ZoneId zoneId;

    public Setting(long chatId, NumberOfDecimalPlaces numberOfDecimalPlaces, Banks selectedBank,
                   List<Currency> selectedCurrency, NotificationTime notificationTime, ZoneId zoneId) {
        this.chatId = chatId;
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
        this.selectedBank = selectedBank;
        this.selectedCurrency = selectedCurrency;
        this.notificationTime = notificationTime;
        this.zoneId = zoneId;
    }

    public long getChatId() {
        return chatId;
    }

    public int getNumberOfDecimalPlaces() {
        return numberOfDecimalPlaces.getIntNumber();
    }

    public void setNumberOfDecimalPlaces(NumberOfDecimalPlaces numberOfDecimalPlaces) {
        this.numberOfDecimalPlaces = numberOfDecimalPlaces;
    }

    public Banks getSelectedBank() {
        return selectedBank;
    }

    public void setSelectedBank(Banks selectedBank) {
        this.selectedBank = selectedBank;
    }

    public List<Currency> getSelectedCurrency() {
        return selectedCurrency;
    }

    public void setSelectedCurrency(List<Currency> selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
    }

    public NotificationTime getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(NotificationTime notificationTime) {
        this.notificationTime = notificationTime;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }
    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    @Override
    public String toString() {
        return "chatId=" + chatId +
                ", numberOfDecimalPlaces=" + numberOfDecimalPlaces +
                ", selectedBank=" + selectedBank +
                ", selectedCurrency=" + selectedCurrency +
                ", notificationTime=" + notificationTime +
                ", zoneId=" + zoneId +
                '}';
    }
}

import settings.Banks;

import java.util.Objects;

public class Bank {

    private Enum<Banks> bankName;
    private Float USD_buy;
    private Float USD_sell;
    private Float EUR_buy;
    private Float EUR_sell;
    private Float PLN_buy;
    private Float PLN_sell;
    private Float BTC_buy;
    private Float BTC_sell;
    private Float time;

    public Enum<Banks> getBankName() {
        return bankName;
    }

    public void setBankName(Enum<Banks> bankName) {
        this.bankName = bankName;
    }

    public Float getUSD_buy() {
        return USD_buy;
    }

    public void setUSD_buy(Float USD_buy) {
        this.USD_buy = USD_buy;
    }

    public Float getUSD_sell() {
        return USD_sell;
    }

    public void setUSD_sell(Float USD_sell) {
        this.USD_sell = USD_sell;
    }

    public Float getEUR_buy() {
        return EUR_buy;
    }

    public void setEUR_buy(Float EUR_buy) {
        this.EUR_buy = EUR_buy;
    }

    public Float getEUR_sell() {
        return EUR_sell;
    }

    public void setEUR_sell(Float EUR_sell) {
        this.EUR_sell = EUR_sell;
    }

    public Float getPLN_buy() {
        return PLN_buy;
    }

    public void setPLN_buy(Float PLN_buy) {
        this.PLN_buy = PLN_buy;
    }

    public Float getPLN_sell() {
        return PLN_sell;
    }

    public void setPLN_sell(Float PLN_sell) {
        this.PLN_sell = PLN_sell;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public Float getBTC_buy() {
        return BTC_buy;
    }

    public void setBTC_buy(Float BTC_buy) {
        this.BTC_buy = BTC_buy;
    }

    public Float getBTC_sell() {
        return BTC_sell;
    }

    public void setBTC_sell(Float BTC_sell) {
        this.BTC_sell = BTC_sell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(bankName, bank.bankName) && Objects.equals(USD_buy, bank.USD_buy) && Objects.equals(USD_sell, bank.USD_sell) && Objects.equals(EUR_buy, bank.EUR_buy) && Objects.equals(EUR_sell, bank.EUR_sell) && Objects.equals(PLN_buy, bank.PLN_buy) && Objects.equals(PLN_sell, bank.PLN_sell) && Objects.equals(time, bank.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, USD_buy, USD_sell, EUR_buy, EUR_sell, PLN_buy, PLN_sell, time);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName=" + bankName +
                ", USD_buy=" + USD_buy +
                ", USD_sell=" + USD_sell +
                ", EUR_buy=" + EUR_buy +
                ", EUR_sell=" + EUR_sell +
                ", PLN_buy=" + PLN_buy +
                ", PLN_sell=" + PLN_sell +
                ", BTC_buy=" + BTC_buy +
                ", BTC_sell=" + BTC_sell +
                ", time=" + time +
                '}';
    }
}

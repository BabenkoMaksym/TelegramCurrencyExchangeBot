package settings;

public class ConverterSetting {
    private Banks selectBank;
    private Currency sellCurrency;
    private Currency buyCurrency;
    private float sellCount = 0.0f;
    private float buyCount = 0.0f;
    private Procedure procedure;

    public enum Procedure {
        SELL,
        BUY;
    }


    public Banks getSelectBank() {
        return selectBank;
    }

    public void setSelectBank(Banks selectBank) {
        this.selectBank = selectBank;
    }

    public Currency getSellCurrency() {
        return sellCurrency;
    }

    public void setSellCurrency(Currency sellCurrency) {
        this.sellCurrency = sellCurrency;
    }

    public Currency getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(Currency buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public float getSellCount() {
        return sellCount;
    }

    public void setSellCount(float sellCount) {
        this.sellCount = sellCount;
    }

    public float getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(float buyCount) {
        this.buyCount = buyCount;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        if (procedure.equalsIgnoreCase("sell")) {
            this.procedure = Procedure.SELL;
        } else if (procedure.equalsIgnoreCase("buy")) {
            this.procedure = Procedure.BUY;
        }
    }

    @Override
    public String toString() {
        return "ConverterSetting{" +
                "selectBank=" + selectBank +
                ", sellCurrency=" + sellCurrency +
                ", buyCurrency=" + buyCurrency +
                ", sellCount=" + sellCount +
                ", buyCount=" + buyCount +
                '}';
    }
}

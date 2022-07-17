package privat;

import java.io.IOException;
import java.net.URI;
import java.util.List;

public class APIPrivat {
    private static final String PRIVAT_URL = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
    private static final String PRIVAT_PLZ_URL = "https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=12";

    public static void main(String[] args) throws IOException, InterruptedException {
        final List<Private> date = HttpUtil.sendGetBank(URI.create(PRIVAT_URL));
        final List<Private> datePlz = HttpUtil.sendGetBank(URI.create(PRIVAT_PLZ_URL));
        for (Private currency : datePlz) {
            if (currency.getCcy().equals("PLZ")) {
                date.add(currency);
                break;
            }
        }
        System.out.println("API Privat "+date);
        final HttpUtil.Bank bank = HttpUtil.getPrivat(date);
        System.out.println(bank.toString());
    }
}

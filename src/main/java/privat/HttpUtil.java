package privat;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import settings.Banks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpUtil {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final Gson GSON = new Gson();

    public static List<Private> sendGetBank(URI uri) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        List<Private> date = GSON.fromJson(response.body(), new TypeToken<List<Private>>() {
        }.getType());
        return date;
    }

    public Bank getPrivat(List<Private> date) throws IOException, InterruptedException {
        Banks bankPrivate = Banks.PRIVAT;
        Bank bank = new Bank();
        bank.setBankName(bankPrivate);
        for (Private currency : date) {
            if(currency.getCcy().equals("USD")){
                bank.setUSD_buy(currency.getBuy());
                bank.setUSD_sell(currency.getSale());
            }else if (currency.getCcy().equals("EUR")){
                bank.setEUR_buy(currency.getBuy());
                bank.setEUR_sell(currency.getSale());
            }else if (currency.getCcy().equals("PLZ")){
                bank.setPLN_buy(currency.getBuy());
                bank.setPLN_sell(currency.getSale());
            }else if (currency.getCcy().equals("BTC")){
                bank.setBTC_buy(currency.getBuy());
                bank.setBTC_sell(currency.getSale());
            }
        }
        return bank;
    }


}

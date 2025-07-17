import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

  private static final String API_KEY = "SUA CHAVE EXCHANGERATE-API AQUI";

  public static double buscarTaxa(String de, String para) throws Exception {
    String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + de + "/" + para;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


    JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
    return json.get("conversion_rate").getAsDouble();
  }
}
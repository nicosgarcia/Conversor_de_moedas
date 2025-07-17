import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Conversor {

  private static String getApiKey() throws IOException {
    Properties props = new Properties();
    props.load(new FileInputStream("config.properties"));
    return props.getProperty("API_KEY");
  }

  public static double buscarTaxa(String de, String para) throws Exception {
    String apiKey = getApiKey();
    String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + de + "/" + para;

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


    JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
    return json.get("conversion_rate").getAsDouble();
  }
}
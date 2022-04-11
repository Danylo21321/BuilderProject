package BestPractise;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

public class ExcheneService {
    private final String apiURL;

    public ExcheneService(String apiURL) {
        this.apiURL = apiURL;
    }
    public void sendGetReqwest() throws URISyntaxException {
        URI url = new URI(this.apiURL);
//        HttpURLConnection connection = url.

    }
}

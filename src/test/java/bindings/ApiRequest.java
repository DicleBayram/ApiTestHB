package bindings;

import java.net.*;

public class ApiRequest{

    public ApiRequest(){}

    public int GetJsonResultFromApi() throws Throwable {
        URL url = new URL("http://generator.swagger.io/api/swagger.json");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int code = connection.getResponseCode();

        return code;
    }
}
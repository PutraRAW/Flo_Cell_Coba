package flocell;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Delete {
    
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://169.254.213.48:5005/api/v1.1/tickets");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("DELETE");
        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();
    }
}

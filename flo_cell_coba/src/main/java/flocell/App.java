package flocell;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String response = regisProcess();
        // BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
        // System.out.println(ticket);
        String[] arrResponse = response.split(": ");
        // System.out.println(arr[1]);
        String[] arr = arrResponse[1].split("\"");
        String ticket = arr[1];
        System.out.println(ticket);
        String responRun = runTicket(ticket);
        System.out.println("run ticket : " + responRun);


    }

    public static String regisProcess() throws IOException{
        URL url = new URL("http://169.254.213.48:5005/api/v1.1/tickets");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");

        String data = "{\n    \"protocol\": \"harvesting\",\n    \"params\": {\n        \"harvested-cell-volume\": 10500\n     },\n    \"reuse\": true\n}";

        byte[] out = data.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        String jsonResponseBody = IOUtils.toString(http.getInputStream(), "UTF-8");
        http.disconnect();
        return jsonResponseBody;
    }

    public static String runTicket(String tiket) throws IOException {
        URL url = new URL("http://169.254.213.48:5005/api/v1.1/tickets/"+tiket+"/run");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");
        http.setRequestProperty("Content-Length", "0");

        // System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();
        return http.getResponseCode()+" "+http.getResponseMessage();
    }

    public static int checkProgress(String tiket) throws IOException{
        URL url = new URL("http://169.254.213.48:5005/api/v1.1/tickets/"+tiket+"/progress");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");
        http.setRequestProperty("Content-Length", "0");

        // System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
        http.disconnect();
        String jsonResponseBody = IOUtils.toString(http.getInputStream(), "UTF-8");
        
        return 0;
    }
}

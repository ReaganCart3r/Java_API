import java.net.URI;
import java.net.http.HttpRequest;

public class RestApi {
    public static void main(String[] args) throws Exception{
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization",)
    }
}

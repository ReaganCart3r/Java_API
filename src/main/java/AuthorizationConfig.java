import java.io.InputStream;
import java.util.Properties;

public class AuthorizationConfig {
    private static final String CONFIG_FILE = "config.properties";
    private static final String AUTHORIZATION_CODE_KEY = "authorization.code";

    private static String authorizationCode;

    static {
        Properties properties = new Properties();
        try (InputStream input = AuthorizationConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + CONFIG_FILE);
            }
            properties.load(input);
            authorizationCode = properties.getProperty(AUTHORIZATION_CODE_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getAuthorizationCode() {
        return authorizationCode;
    }
}
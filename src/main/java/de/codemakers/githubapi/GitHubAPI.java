package de.codemakers.githubapi;

import com.google.gson.Gson;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GitHubAPI {
    
    public static final String API_URL = "https://api.github.com/";
    
    public static final Gson GSON = new Gson();
    
    public static final String API_REPO = "repo";
    public static final String API_REPOS = "repos";
    public static final String API_USER = "user";
    public static final String API_USERS = "users";
    public static final String API_COMMENT = "comment";
    public static final String API_COMMENTS = "comments";
    public static final String API_COMMIT = "commit";
    public static final String API_COMMITS = "commits";
    public static final String API_ORG = "org";
    public static final String API_ORGS = "orgs";
    
    public static final CloseableHttpClient HTTP_CLIENT = HttpClients.createDefault();
    
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                HTTP_CLIENT.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }));
    }
    
    public static final URI createURI(Map<String, String> params, byte[] accessToken, String... paths) {
        try {
            return new URI(createURLString(params, accessToken, paths));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static final URL createURL(Map<String, String> params, byte[] accessToken, String... paths) {
        try {
            return new URL(createURLString(params, accessToken, paths));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static final String createURLString(Map<String, String> params, byte[] accessToken, String... paths) {
        return API_URL + Arrays.asList(paths).stream().collect(Collectors.joining("/")) + ((params != null && !params.isEmpty()) ? ("?" + params.entrySet().stream().map((entry) -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&"))) + ((accessToken != null && accessToken.length > 0) ? "&access_token=" + new String(accessToken) : "") : ((accessToken != null && accessToken.length > 0) ? "?access_token=" + new String(accessToken) : ""));
    }
    
}

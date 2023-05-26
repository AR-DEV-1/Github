import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GitHubRepoHoster {
    public static void main(String[] args) {
        // Open GitHub in the default web browser
        openGitHub();
    }

    private static void openGitHub() {
        try {
            // Open the GitHub website URL
            URI githubURI = new URI("https://github.com/");
            Desktop.getDesktop().browse(githubURI);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

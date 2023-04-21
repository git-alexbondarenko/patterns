package fabricmethod;

import java.util.Objects;
import java.util.Scanner;

public class Application {
    private Dialog dialog;

    public void initialize(String config) throws Exception {

        if (Objects.equals(config, "w")) {
            dialog = new WindowsDialog();
        } else if (Objects.equals(config, "h")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("error, unknown command");
        }
    }

    public static void main(String[] args) throws Exception {
        Application app = new Application();
        app.initialize(new Scanner(System.in).next());
        app.dialog.render();
    }
}

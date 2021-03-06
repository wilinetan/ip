import java.util.Scanner;

public class Ui {

    protected Scanner sc;

    public Ui() {
        this.sc = new Scanner(System.in);
    }

    /**
     * Shows the welcome message.
     */
    public void showWelcome() {
        System.out.println("    ___________________________________________________________");
        System.out.println("    Hello! I'm Duke\n    What can I do for you?");
        System.out.println("    ___________________________________________________________");
    }

    /**
     * Reads the next user input.
     *
     * @return The next user input.
     */
    public String readCommand() {
        return sc.nextLine();
    }

    /**
     * Shows the divider line.
     */
    public void showLine() {
        System.out.println("    ___________________________________________________________");
    }

    /**
     * Shows the loading error message.
     */
    public void showLoadingError() {
        System.out.println("Error loading file");
    }

    /**
     * Shows the error message.
     */
    public void showError(String errorMessage) {
        System.out.println(errorMessage);
    }
}

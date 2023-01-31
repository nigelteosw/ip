package duke;
public class Ui {

    public Ui() {
    }

    public void showLogo() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(logo);
        System.out.println("\nHello! I'm Duke\nWhat can I do for you?\n");
    }

    public void showLine() {
        System.out.println("-----------------------------------------");
    }

    public void showBye() {
        System.out.println("Bye. Hope to see you again soon!");
    }
}

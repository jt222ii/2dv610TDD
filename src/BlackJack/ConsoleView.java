package BlackJack;

import java.io.PrintStream;

/**
 * Created by jonastornfors on 2016-11-16.
 */
public class ConsoleView {
    public final static String MENU = "Black jack: (d)raw card, (s)tay or (q)uit";
    PrintStream out;
    public ConsoleView(PrintStream output) {
        this.out = output;
    }

    public ConsoleView() { //this should be removed. But for some reason the tests wont run if there are errors

    }

    public void showMenu() {
        out.println(MENU);
    }
}

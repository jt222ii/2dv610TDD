package BlackJack;

/**
 * Created by jonastornfors on 2016-11-16.
 */
public class BlackJackGame {
    private ConsoleView view;
    public BlackJackGame(ConsoleView view) {
        this.view = view;
    }

    public static void main(String[] args)
    {
        BlackJackGame game = new BlackJackGame(new ConsoleView(System.out));

        game.run();
    }

    public void run()
    {
        this.view.showMenu();
    }
}

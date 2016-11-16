package Tests;

import BlackJack.BlackJackGame;
import BlackJack.ConsoleView;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by jonastornfors on 2016-11-16.
 */
public class BlackJackGameTest {
    private BlackJackGame sut;
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void shouldShowMenu() {
        ConsoleView view = mock(ConsoleView.class);
        sut = new BlackJackGame(view);
        sut.run();

        verify(view).showMenu();

    }

}
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
    ConsoleView view;
    @Before
    public void setUp() throws Exception {
        view = mock(ConsoleView.class);
        sut = new BlackJackGame(view);
    }
    @Test
    public void shouldShowMenu() {
        sut.run();
        verify(view).showMenu();
    }

}
package Tests;

import BlackJack.ConsoleView;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by jonastornfors on 2016-11-16.
 */
public class ConsoleViewTest {

    private ConsoleView sut;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        sut = new ConsoleView(printStream);
    }

    @Test
    public void shouldShowMenu() throws Exception {
        sut.showMenu();
        verify(printStream).println(ConsoleView.MENU);
    }

}
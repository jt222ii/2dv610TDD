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

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldShowMenu() throws Exception {

        PrintStream printStream = mock(PrintStream.class);

        sut = new ConsoleView(printStream);

        sut.showMenu();

        verify(printStream).println();


    }

}
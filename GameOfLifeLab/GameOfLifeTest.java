
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *     0  1  2  3  4  5  6  7  8  9
         *  0  X  -  -  -  X  X  -  -  -  X 
         *  1  X  -  -  -  -  X  -  -  -  X
         *  2  X  -  -  -  -  -  -  -  -  X
         *  3  -  -  -  -  -  -  -  -  -  -
         *  4  X  X  -  -  X  X  -  -  -  X
         *  5  x  -  -  -  X  X  -  -  X  X
         *  6  -  -  -  -  -  -  -  -  -  -
         *  7  X  -  -  -  -  -  -  -  -  X
         *  8  X  -  -  -  X  -  -  -  -  X
         *  9  X  -  -  -  X  X  -  -  -  X
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 0) ||
                        (row == 0 && col == 4) ||
                        (row == 0 && col == 5) ||
                        (row == 0 && col == 9) ||
                        (row == 1 && col == 0) ||
                        (row == 1 && col == 3) ||
                        (row == 1 && col == 4) ||
                        (row == 2 && col == 10) ||
                        (row == 2 && col == 11) ||
                        (row == 4 && col == 3) ||
                        (row == 4 && col == 4) ||
                        (row == 4 && col == 10) ||
                        (row == 4 && col == 11) ||
                        (row == 4 && col == 7) ||
                        (row == 5 && col == 0) ||
                        (row == 5 && col == 2) ||
                        (row == 5 && col == 6) ||
                        (row == 5 && col == 7) ||
                        (row == 5 && col == 8) ||
                        (row == 7 && col == 13) ||
                        (row == 7 && col == 14) ||
                        (row == 8 && col == 0) ||
                        (row == 8 && col == 5) ||
                        (row == 8 && col == 6) ||
                        (row == 9 && col == 7) ||
                        (row == 9 && col == 8) ||
                        (row == 9 && col == 9) ||
                        (row == 9 && col == 14) ||
                        )
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 19 generations         
         * (X: alive; -: dead)
         * 
         *     0  1  2  3  4  5  6  7  8  9
         *  0  -  -  -  -  X  X  -  -  -  -
         *  1  -  -  -  -  -  -  -  -  -  -
         *  2  -  -  -  -  -  -  -  -  -  -
         *  3  -  -  -  -  -  -  -  -  -  -
         *  4  -  -  -  -  -  -  -  -  -  -
         *  5  -  -  -  -  -  -  -  -  -  -
         *  6  -  -  -  -  -  -  -  -  -  -
         *  7  -  -  -  -  -  -  -  -  -  -
         *  8  -  -  -  -  -  -  -  -  -  -
         *  9  -  -  -  -  X  X  -  -  -  -
         *
         */
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 4) ||
                        (row == 0 && col == 5) ||
                        (row == 9 && col == 4) ||
                        (row == 9 && col == 5)
                        )
                        {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}


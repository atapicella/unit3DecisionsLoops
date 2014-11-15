
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @Andrew Apicella
 * @version 14 Nov 2014
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
                if(      (row == 0 && col == 0) ||
                        (row == 0 && col == 4) ||
                        (row == 0 && col == 5) ||
                        (row == 0 && col == 9) ||
                        (row == 1 && col == 0) ||
                        (row == 1 && col == 5) ||
                        (row == 1 && col == 9) ||
                        (row == 2 && col == 0) ||
                        (row == 2 && col == 9) ||
                        (row == 4 && col == 0) ||
                        (row == 4 && col == 1) ||
                        (row == 4 && col == 4) ||
                        (row == 4 && col == 5) ||
                        (row == 4 && col == 9) ||
                        (row == 5 && col == 0) ||
                        (row == 5 && col == 4) ||
                        (row == 5 && col == 5) ||
                        (row == 5 && col == 8) ||
                        (row == 5 && col == 9) ||
                        (row == 7 && col == 0) ||
                        (row == 7 && col == 9) ||
                        (row == 8 && col == 0) ||
                        (row == 8 && col == 4) ||
                        (row == 8 && col == 9) ||
                        (row == 9 && col == 0) ||
                        (row == 9 && col == 4) ||
                        (row == 9 && col == 5) ||
                        (row == 9 && col == 9) 
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
    throws InterruptedException
    {
        /* verify that the actual pattern matches the expected pattern after 19 generations         
         * (X: alive; -: dead)
         * 
         *     0  1  2  3  4  5  6  7  8  9
         *  0  -  -  -  -  -  -  -  -  -  -
         *  1  -  -  -  -  -  X  X  -  -  -
         *  2  -  -  -  -  -  X  X  -  -  -
         *  3  -  -  -  -  -  -  -  -  -  -
         *  4  -  -  -  -  -  -  -  -  -  -
         *  5  -  -  -  -  -  -  -  -  -  -
         *  6  -  -  -  -  -  -  -  -  -  -
         *  7  -  -  -  X  X  -  -  -  -  -
         *  8  -  -  -  X  X  -  -  -  -  -
         *  9  -  -  -  -  -  -  -  -  -  -
         *
         */

        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for (int i = 0; i<=9; i++)
        {
           Thread.sleep(500);
           game.createNextGeneration();
        }

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 1 && col == 5) ||
                        (row == 1 && col == 6) ||
                        (row == 2 && col == 5) ||
                        (row == 2 && col == 6) ||
                        (row == 7 && col == 3) ||
                        (row == 7 && col == 4) ||
                        (row == 8 && col == 3) ||
                        (row == 8 && col == 4)
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


/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement, String statementOld)
    {
        String response = "";
        if (statement.equals(statementOld))
        {
            response = "You said that already.";
        }
        else if (statement.equals("asdfghjkl;'"))
        {
            response = "I am familiar with the keyboard.";
        }
        else if (statement.toUpperCase().indexOf("MOTHER") >= 0
                || statement.toUpperCase().indexOf("FATHER") >= 0
                || statement.toUpperCase().indexOf("SISTER") >= 0
                || statement.toUpperCase().indexOf("BROTHER") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.toUpperCase().indexOf("DOG") >= 0 || statement.indexOf("cat") >=0)
        {
            response = "Tell me more about your pets.";
          }
        else if (statement.toUpperCase().indexOf("SCHMIT") >= 0)
        {
            response = "He sounds like a good teacher";
          }
        else if (statement.trim().equals(""))
        {
            response = "Say something, please.";
          }
        else if (statement.toUpperCase().indexOf("I AM NOT") >= 0)
        {
            int len = statement.length();
            String rest = statement.substring(8, len);
            response = "I am sorry you are not" + rest + ".";
          }
        else if (statement.toUpperCase().indexOf("I AM") >= 0)
        {
            int len = statement.length();
            String rest = statement.substring(4, len);
            response = "Why are you" + rest + "?";
          }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "...";
        }
        else if (whichResponse == 5)
        {
            response = "I'm confused.z";
        }
        return response;
    }
}

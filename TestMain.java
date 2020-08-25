import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestReadWriteIntegers.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testReadWriteIntegers();
    }

    @Test
    public void testReadWriteIntegers() {

        try {
            Main.main(null);
            Scanner scan1 = new Scanner(new FileReader("test.in"));
            Scanner scan2 = new Scanner(new FileReader("test.out"));

            while (scan1.hasNextInt() && scan2.hasNextInt()) {
                int temp1 = scan1.nextInt();
                int temp2 = scan2.nextInt();
                assertEquals(temp1+1, temp2);
            }
            assertEquals("did not match all numbers", scan1.hasNextInt(), scan2.hasNextInt());

            scan1.close();
            scan2.close(); 
        } catch (Exception e) {
            fail(e.toString());
        }

    }
}

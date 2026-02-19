import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   @Test
   public void testQ1()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     PracticeProblem.q1();

     // assertion
     assertEquals("a\n", bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }

   @Test
   public void testQ2_1()
   {
      String data = "help\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a word: l\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_2()
   {
      String data = "great\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a word: e\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_1()
   {
      String data = "cold\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a word: The second character user entered was: o\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_2()
   {
      String data = "insane\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a word: The second character user entered was: n\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_1()
   {
      String data = "8\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Your number plus 1 is: 9\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_2()
   {
      String data = "0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Your number plus 1 is: 1\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_1()
   {
      String data = "A\nB\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a letter: Input another letter: 131\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ5_2()
   {
      String data = "d\nf\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a letter: Input another letter: 202\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

}

import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, input2);

  }

  @Test
  public void testReverseInPlace3() {
    int[] input2 = { 1, 2 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 2, 1 }, input2);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2};
    assertArrayEquals(new int[] {2, 1}, ArrayExamples.reversed(input1));
  }
   
   @Test
   public void averageWithoutLowest() {
    double[] input1 = {1, 3, 3, 3};
    double input2 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3, input2, 0.0);
    
   }
   @Test
   public void averageWithoutLowest2() {
    double[] input1 = {3, 3, 3};
    double input2 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(3, input2, 0.0);

   }

}

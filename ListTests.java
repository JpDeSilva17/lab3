import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {

    @Test
    public void testfilter(){
        String[] input1 = {"a", "b", "c", "d"};
        List<String> input = Arrays.asList(input1);
        String[] input2 = {"a", "b", "c", "d"};
        List<String> result = Arrays.asList(input2);
        StringChecker sc = new ListExamples();;
        ListExamples.filter(input, sc);
        assertEquals(result, ListExamples.filter(input, sc));
    }
    @Test
    public void testMerge(){
        String[] input1 = {"a", "b", "c", "d"};
        List<String> input = Arrays.asList(input1);
        String[] input2 = {"a", "a", "b", "b", "c", "c", "d", "d"};
        List<String> input3 = Arrays.asList(input2);
        List<String> result = input;
        assertEquals(input3, ListExamples.merge(input, result));
    }
       
}

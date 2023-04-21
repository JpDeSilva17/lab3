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
    
}

package javaSessions.streamAPI;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIS {
    @Test
    public void test() {
        List<Integer> list= Arrays.asList(2,4,6,7);
        System.out.println(list);
        list.stream().map(x-> x*x).collect(Collectors.toList());
        int [          ]          a =new int[2];
        System.out.println(Arrays.toString(a));
    }
}

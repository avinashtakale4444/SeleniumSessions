package javaSessions.streamAPI;

import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreams {
    @Test
    public void sumOfAllGivenNumbers() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> reduce = integers.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());
    }

    @Test
    public void squareOfAllGivenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void averageOfNumbers() {
        List<Integer> list = Arrays.asList(5, 4, 1, 3, 9, 2);
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);
    }

    @Test
    public void oddAndEvenNumbers() {
        List<Integer> list = Arrays.asList(5, 4, 1, 3, 9, 2);
        List<Integer> evenNumbers = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println("evenNumbers: "+evenNumbers);
        List<Integer> oddNumbers = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        System.out.println("oddNumbers : "+oddNumbers);
    }
    @Test
    public void numberStartsWithPrefix() {
        List<Integer> list = Arrays.asList(125, 124, 122, 233, 219, 2154);
      List<Integer> list1= list.stream()
               .map(e->String.valueOf(e))
                    .filter(e->e.startsWith("2"))
                        .map(Integer::valueOf)
                            .collect(Collectors.toList());
        System.out.println(list1);
    }
    @Test
    public void duplicateNumbers() {
        List<Integer> list = Arrays.asList(125, 124, 122, 233, 219, 2154,125,233);
        Set<Integer> collect = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(collect);

        Set<Integer> set=new HashSet<>();
        Set<Integer> collect1 = list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet());
        System.out.println(collect1);
    }
    @Test
    public void maxMinNumber() {
        List<Integer> list = Arrays.asList(5, 4, 1, 3, 2,45,-1);
        Integer maxNumber = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(maxNumber);
        Integer minNumber = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(minNumber);
    }
    @Test
    public void sortNumbers() {
        List<Integer> list = Arrays.asList(5, 4, 1, 3, 2,45,-1);
        List<Integer> ascendingOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);
        List<Integer> descendingOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrder);
    }
    @Test
    public void nthHighestNumber() {
        List<Integer> list = Arrays.asList(5, 4, 1, 3, 2,45,-1);
        Integer integer = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(integer);
        Integer integer1 = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(integer1);
    }

    @Test
    public void occurrenceOfChar() {
        String str="Avinaish";
        String s[]=str.split("");
        System.out.println(Arrays.toString(s));
        Map<String, Long> collect = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}

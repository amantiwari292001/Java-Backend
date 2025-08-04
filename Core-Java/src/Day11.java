import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Enhanced for loop
        for(int i : list){ //Datatype of list and a variable which represents elements of list.
            System.out.print(i);
        }

        //For Each Loop
        list.forEach(i -> System.out.print(i)); //We use lambda function, I denotes the elements.
        //We can also write Consumer<Integer> printer = n -> System.out.println(n); and pass printer inside list.forEach();
        System.out.println();

        //Stream API -> Used it to play with collections, We can manipulate and filter the elements.
        //A stream can be used only once. else will throw - IllegalStateException.
        Stream<Integer> s1 = list.stream(); //Converting list into a stream.
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); //Filter returns a new stream after filtering.
        //Filter take Predicate interface object to work.
        //Predicate<Integer> willFilter = (n) -> { return n%10==0; };
        //s2.forEach(n -> System.out.println(n)); //We use for each to print a stream.
        Stream<Integer> s3 = s2.map(n -> n*3); //Map returns a new stream by processing the elements.
        //Map uses the object of Function Inteface.
        //s3.forEach(n -> System.out.println(n));
        int s4 = s3.reduce(0, (a,b) -> a+b); //reduce doesn't return a stream, but an element.
        //Reduce uses the object of BinaryOperator Inteface.

        //We can put all in a single line.
        int singleLine = list.stream().filter(n -> n%4==0)
                .map(n -> n*10)
                .reduce(0, (a,b) -> a+b);
        System.out.println(singleLine);

        list.stream()
                .distinct() //This returns a stream and gives unique values, same .sorted()/sorted(Comparator),
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        Set<Integer> list1 = list.stream().collect(Collectors.toSet()); //collect(Collector.something) is used to convert a stream into collection.
        System.out.println(list1);

        Random rand = new Random(); //With Random we get random numbers.
        System.out.println(rand.nextInt(32)); //Object.next(Any Datatype)(Numbers Under);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0;i<100;i++){
            list2.add(rand.nextInt(100));
        }
        System.out.println(list2);

        int result2 = list2
                .stream()
                .mapToInt(i -> i-1) //mapToInt provides methods which helps us in mathametical work.
                //.reduce(0, (a, b) -> {return a+b;});
                .sum();
        System.out.println(result2);

        //Parallel Stream: It’s a Java method that allows a stream to process elements concurrently using multiple threads, list.parallelStream()
        // improving performance for large datasets.
        //Splits the task into subtasks, runs in parallel, and merges results

        //Note-> .lower(list/set.last()) gives us the second last element.

        //Optional class, Which helps in countring null pointer exception.
        Optional<Integer> opt = list.stream().filter(i -> i>100).findFirst();
        System.out.println("Not found");
        //Or
        Integer opt1 = list.stream().filter(i -> i>100).findFirst().orElse(-1);
        System.out.println(opt1);

        //Method reference, Don't need to write everything.
        list.forEach(System.out::println); //Write Class::Its method

    }
}

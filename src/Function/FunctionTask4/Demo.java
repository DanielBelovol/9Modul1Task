package Function.FunctionTask4;

import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
       Generator generator = new Generator();
       Stream<Long> random = generator.generate(0L,2521490,1L <<48,11);
        random.limit(10).forEach(System.out::println);
    }
}

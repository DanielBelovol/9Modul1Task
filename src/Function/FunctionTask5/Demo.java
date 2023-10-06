package Function.FunctionTask5;

import java.util.stream.Stream;

import static Function.FunctionTask5.Mixer.zip;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 4, 5, 12, 423);
        Stream<Integer> second = Stream.of(321,4,12,74);

        Stream<Integer> mixedStream = zip(first,second);

        mixedStream.forEach(System.out::println);

    }
}

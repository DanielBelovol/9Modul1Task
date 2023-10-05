package FunctionTask5;

import java.util.List;
import java.util.stream.Stream;

public class Mixer<T> {
    public static <T>Stream<T> zip(Stream<T> first,Stream<T> second){
        List<T> list;
        list.stream().map(first,second)
    }
}

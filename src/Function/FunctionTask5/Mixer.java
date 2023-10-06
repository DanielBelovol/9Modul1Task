package Function.FunctionTask5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Mixer<T> {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Iterator<T> inputFirst = first.iterator();
        Iterator<T> inputSecond = second.iterator();

        List<T> mix = new ArrayList<>();

        while(inputFirst.hasNext() && inputSecond.hasNext()){
            mix.add((T) inputFirst.next());
            mix.add((T) inputSecond.next());
        }
        return mix.stream();
    }
}

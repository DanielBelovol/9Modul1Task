package FunctionTask4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Generator {
    public Stream<Long> generate(long seed, long a, long m, long c) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}

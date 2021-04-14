import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {

    private AtomicInteger integer01 = new AtomicInteger(0);
    @Test
    public void test012() {
        //



        for (int i = 0; i < 10; i++) {

            int current;
            int next;
            do {
                current = this.integer01.get();
                next = current > 10 ? 0 : current + 1;

            } while (!this.integer01.compareAndSet(current, next));

            System.out.println("*****" + next);
        }
    }

}

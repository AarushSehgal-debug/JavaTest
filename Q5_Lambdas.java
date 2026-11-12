import java.util.function.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Q5_Lambdas {

    // ── PREDICT: What does main() print for lines 1-3? ── 
    // 1: 7 * 3 = 21 
    // Also answer the inline questions.

    public static void main(String[] args) {
        int multiplier = 3;
        IntUnaryOperator triple = x -> x * multiplier;
        System.out.println("1: " + triple.applyAsInt(7));
        // Q: if you uncomment the next line, does it compile? why?
        // multiplier = 4; not 100% but im p sure tha the class would need a local variable to be final or like effectively final and when we assigin it with a 4 then it makes java tweak and it's not final and compilation errors occur.
        

        Runnable[] tasks = new Runnable[3];
        for (int i = 0; i < 3; i++) {
            final int idx = i;
            tasks[i] = () -> System.out.print(idx);
        }
        System.out.print("2: ");
        for (Runnable r : tasks) r.run();
        System.out.println();
        // i 0 = 0 i 1 = 1 i 2 = 2 output = 012
        // Q: what if you removed "final" from idx? does it still compile?
        // yes even without final you never chamged the value of idx so it is effecitvely final.

        List<String> motors = Arrays.asList("Falcon", "Neo", "Kraken", "Vortex");
        motors.sort((a, b) -> a.length() - b.length());
        System.out.println("3: " + motors);

        // Neom falcon, Kranken, Vortex.
        static void applyToAll(List<Integer> list, UnaryOperator<Integer> operator) {
            for (int i = 0; i < list.size(); i++) {
                    int curr = list.get(i);
                    int upd = operator.apply(current);
                    list.set(i, updated);
                }
        }

        static IntUnaryOperator compose(IntUnaryOperator f, IntUnaryOperator g) {
            return x -> f.applyAsInt(g.applyAsInt(x));
        }

        IntUnaryOperator doubleIt = x -> x * 2;
        IntUnaryOperator addThree = x -> x + 3;
        IntUnaryOperator doubleThenAdd = compose(addThree, doubleIt);
        assert doubleThenAdd.applyAsInt(5) == 13 : "compose failed";  // addThree(doubleIt(5)) = 13
        System.out.println("compose ok");

        // 3) Using streams, write one expression that filters nums to only
        //    values > 5, then sums them. Store result in "total".

        int total = nums.stream()
            {
            .filter(n -> n > 5)
            .maptoint(Integer::intVlaue
            .sum();
        }

        int total = 0; // replace this
        assert total == 9 + 16 + 25 : "stream sum failed: " + total;
        System.out.println("stream ok");
    }

    // TODO
    static void applyToAll(List<Integer> list, UnaryOperator<Integer> op) {
        // your code here
    }

    // TODO
    static IntUnaryOperator compose(IntUnaryOperator f, IntUnaryOperator g) {
        // your code here
        return x -> x;
    }
}

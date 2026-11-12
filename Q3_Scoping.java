public class Q3_Scoping {

    // ── PREDICT: What does main() print for lines 1-4? ──
    // 1. 1  2 2. 1  1 3. 13 4. 5 1 

    static int count = 0;
    int id;

    Q3_Scoping() { id = ++count; }
    static void reset() { count = 0; }

    public static void main(String[] args) {
        Q3_Scoping a = new Q3_Scoping();
        Q3_Scoping b = new Q3_Scoping();
        System.out.println("1: " + a.id + " " + b.id);

        reset();
        Q3_Scoping c = new Q3_Scoping();
        System.out.println("2: " + c.id + " " + count);

        int x = 10;
        for (int i = 0; i < 3; i++) {
            int x2 = x + i;
            x = x2;
        }
        System.out.println("3: " + x);
        // Q: does "x2" exist here? (yes/no, and why)
        // it exsists only inside the loop. it would exsist here if called outside the loop

        int val = 5;
        System.out.println("4: " + val + " " + a.count);
        // Q: why does a.count compile? is this good practice?
        // count is static not sure why this would be a good practice possibly be cause .count is shared by all variables not just a so it creates decent comfusion.

        // ── WRITE ──
        // Create a class Counter with:
        //   - a static int "total" tracking how many Counters have been created
        //   - an instance String "label"
        //   - a constructor Counter(String label)
        //   - a method String toString() that returns "label (#id)" where id
        //     is the 1-based creation order (first Counter is #1, second is #2, etc.)
        //
        // Uncomment when done:

        // Counter c1 = new Counter("left");
        // Counter c2 = new Counter("right");
        // System.out.println("5: " + c1);   // left (#1)
        // System.out.println("6: " + c2);   // right (#2)
        // assert Counter.total == 2;
        // System.out.println("Counter ok");
    }

    // TODO: write Counter here

    static class Counter {
        static int total = 0;
        String label;
        int id;
    }

    Counter(String label){
        this.label = label;
        id = ++total;
    }

    @Override
    Public string toString() {
        return label + " (#" + id + ")"
            }
}

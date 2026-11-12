public class Q4_ControlFlow {

    // ── PREDICT: What does main() print for lines 1-5? ──

    static boolean log(String label) {
        System.out.println("  eval " + label);
        return true;
    }

    public static void main(String[] args) {
        // Q4a: which "eval" lines actually print?
        System.out.println("1:");
        if (false && log("A")) {} //false and ... - flase
        if (true || log("B")) {}  // true or ... - true 
        if (false || log("C")) {}  // false or treu - true - this one prints rest will just not evaluate the part 2 

        

        // Q4b: switch fallthrough
        System.out.println("2:");
        int val = 2;
        switch (val) {
            case 1: System.out.println("  one");
            case 2: System.out.println("  two");
            case 3: System.out.println("  three");
            default: System.out.println("  default");
        }

        //2: two, three default. this would first go through case 2 then 3 then 4 

        // Q4c: what's the final value of sum?
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) continue;
            if (i > 7) break;
            sum += i;
        }
        System.out.println("3: " + sum):// 19 = 1 + 2 + 4 + 5 + 76 

        // Q4d: post-increment in expression
        int n = 5;
        int result = n++ + ++n; // 6 + 5 + 7 
        System.out.println("4: " + result + " " + n);

        // 4: 12 7 

        // Q4e
        System.out.println("5: " + (true ? "yes" : "no") + (1 > 2 ? "!" : "?"));
        // bro im not sure what a ? is i THINK  it just works like an if else like if true continues with yes. 
        // im not sure for the second either but 1 isnt  greater than 2 so like would it return just the ?... not sure 

        

        // ── WRITE ──
        // Implement fizzBuzz(int n) that returns:
        //   "FizzBuzz" if divisible by both 3 and 5
        //   "Fizz"     if divisible by 3 only
        //   "Buzz"     if divisible by 5 only
        //   the number as a String otherwise
        //
        // Use a SWITCH EXPRESSION (Java 14+), not if/else. ok
        // Hint: you can switch on a computed value.

        static string fizzBuzz(int n){
                return switch (n % 15 ){
            case 0 -> "fizzbuzz";
            case 3,6,9,12 -> "fizz";
            case 5, 10  -> "Buzz";
                default _________;
            }
        // I used the -> so that each case is seperate and I didn't want to use any break bc accidental fallthroguhes could occur..
        
        assert fizzBuzz(15).equals("FizzBuzz");
        assert fizzBuzz(9).equals("Fizz");
        assert fizzBuzz(10).equals("Buzz");
        assert fizzBuzz(7).equals("7");
        assert fizzBuzz(30).equals("FizzBuzz");
        assert fizzBuzz(1).equals("1");
        System.out.println("fizzBuzz ok");
    }

    // TODO: implement with a switch expression
    static String fizzBuzz(int n) {
        // your code here
        return "";
    }
}

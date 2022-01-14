//Ameer Ahmed

public class FibSeq {

    public static int Fib(int n) {
        //assuming n >= 2
        if(n >= 2) {
            return Fib(n-1) + Fib(n-2);

        }
        else if(n == 0) {

            return 0; 

        }

        else if(n == 1) {

            return 1;
        }
        return n;
    }

    public static void main (String[] args) { 
        System.out.println("The 0th fibonacci number is: " + Fib(0));
        System.out.println("The 1th fibonacci number is: " + Fib(1));
        System.out.println("The 2nd fibonacci number is: " + Fib(2));
        System.out.println("The 3rd fibonacci number is: " + Fib(3));
        System.out.println("The 4th fibonacci number is: " + Fib(4));
        System.out.println("The 5th fibonacci number is: " + Fib(5));
        System.out.println("The 6th fibonacci number is: " + Fib(6));
        System.out.println("The 7th fibonacci number is: " + Fib(7));
        System.out.println("The 8th fibonacci number is: " + Fib(8));
        System.out.println("The 9th fibonacci number is: " + Fib(9));
        System.out.println("The 10th fibonacci number is: " + Fib(10));
        System.out.println("The 11th fibonacci number is: " + Fib(11));
        System.out.println("The 12th fibonacci number is: " + Fib(12));
        System.out.println("The 13th fibonacci number is: " + Fib(13));
        System.out.println("The 14th fibonacci number is: " + Fib(14));
        System.out.println("The 15th fibonacci number is: " + Fib(15));
        System.out.println("The 16th fibonacci number is: " + Fib(16));
        System.out.println("The 17th fibonacci number is: " + Fib(17));
        System.out.println("The 18th fibonacci number is: " + Fib(18));
        System.out.println("The 19th fibonacci number is: " + Fib(19));
    }	
}
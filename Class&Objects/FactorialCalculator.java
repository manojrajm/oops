public class FactorialCalculator {


    public static long calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers."); 
            return -1; 
        }

        long factorial = 1; 
        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }
        return factorial; 
    }

    public static void main(String[] args) {
        int num = 5;
        long result = calculateFactorial(num); 
        if (result != -1) { 
            System.out.println("The factorial of " + num + " is: " + result); 
        }
    }
}


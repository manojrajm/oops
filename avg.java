class CalculateAverage {
    public double display() { 
        int[] arr = {1, 2, 3, 4}; 
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { 
            sum += arr[i];
        }
                System.out.println(sum);
        double average = (double) sum / arr.length;
        return average;
    }
}

public class avg {
    public static void main(String[] args) {
        System.out.println("My name is Emorite");
        CalculateAverage c1 = new CalculateAverage(); 
        double average = c1.display(); 
        System.out.println("The average is: " + average);
    }
}


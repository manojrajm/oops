public class MaxFinder {


    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
        	System.out.println("Invalid");

        }
    

        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) { 
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }
        
        return max; 
   }

    public static void main(String[] args) {
        int[] array = {2,5}; 
        int maxNumber = findMax(array); 
        System.out.println("The maximum number in the array is: " + maxNumber); 
    }
}


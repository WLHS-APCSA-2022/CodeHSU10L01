
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(12));
        System.out.println(SumOfNumbers(5));
        RecursiveCountdown(10);
        int[] arrayToSum = {2,3,4,5,6};
        System.out.println(sumArray(arrayToSum,arrayToSum.length));
        System.out.println(sumArray2(arrayToSum));
    }

    public static void RecursiveCountdown(int n){
        if(n == 1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            RecursiveCountdown(n-1);
        }
    }
    public static int SumOfNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n+SumOfNumbers(n-1);

    }
    public static int SumOfNumbers2(int n){
        if(n != 0){
            return n+SumOfNumbers2(n-1);
        }
        return n;

    }

    public static int factorial(int n){
        //base case
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    /**
     * Recursively sums all the elements of an array
     *
     * @param int[] arrayIn array you want to sum
     * @param int n size of the array
     * @return int the sum of all elements in the array
     */
    public static int sumArray(int[] arrayIn, int n){
        //base case, array length is 0
        if(n == 0){
            return 0;
        }
        return arrayIn[n-1]+sumArray(arrayIn,n-1);
    }

    public static int sumArray2(int[] arrayIn){
        if(arrayIn.length == 1){
            return arrayIn[arrayIn.length-1];
        }
        int[] temp = Arrays.copyOf(arrayIn,arrayIn.length-1);
        return arrayIn[arrayIn.length - 1] + sumArray2(temp);
    }
}
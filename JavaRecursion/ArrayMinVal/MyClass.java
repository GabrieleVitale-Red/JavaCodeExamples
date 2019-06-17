import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        //Array of elements, we need to find the element with the minimum value
        int[] array = new int[]{2,45,879,4,5,78,41,3};
        //0 indicates the starting index to be looped recusively
        int minVal = array[0];
        minVal = recMinValArray(array, minVal, 0);
        //minVal = findMinRec(array, array.length);
        System.out.println("Minimum value of the array: " + minVal);
    }
    
    private static int recMinValArray(int[] array, int minVal, int i){
        //Escape condition if the index goes over the array dimension
        if(i >= array.length){
            return minVal;
        }
        //Condition to evaluate the element currently in evaluation
        if(minVal > array[i]){
            minVal = array[i];
        }
        //Return the function increasing the index value
        return recMinValArray(array, minVal, i+1);
    }
    
    private static int findMinRec(int[] array, int n) { 
        if (n == 1) {
            return array[0];
        }
        //Recusiverly compares values after a complete exploration of the array
        return Math.min(array[n-1], findMinRec(array, n-1));
    }
}

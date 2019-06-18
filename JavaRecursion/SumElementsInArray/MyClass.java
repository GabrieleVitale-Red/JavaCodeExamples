public class MyClass {
    public static void main(String args[]) {
        int[] array = new int[]{3,4,6,8,7,3,5,9,0,1};
        System.out.println("All the elements in the array summed are equal to: "+recSumArrayElem(array, array.length));
    }
    
    private static int recSumArrayElem(int[]array, int n){
        if(n == 1){
            return array[0];
        }
        //Sums the previous element to the next one exploring till it goes to the bottom of the array
        return array[n-1] + recSumArrayElem(array, n-1);
    }
}
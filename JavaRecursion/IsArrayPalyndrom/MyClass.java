public class MyClass {
    public static void main(String args[]) {
        //Given array palyndrome or not
        int[] array = new int[]{1,4,5,6,1,6,5,4,1};
        if(recPalyndromArray(array, array.length) == 1)
            System.out.println("The given array is palyndrome");
        else{
            System.out.println("The given array is not palyndrome");
        }    
    }
    
    private static int recPalyndromArray(int[]array, int n){
        //if has length equal to one is good
        if(array.length == 1){
            return 1;
        }
        //if we reach the middle in both cases if it is even or not we return true
        if((n == array.length/2) && (array.length%2==0)){
            return 1;
        }
        if((n == (array.length/2 + 1)) && (array.length%2==1)){
            return 1;
        }
        //if the elements at the sides are equal it goes on
        if(array[n-1] == array[(array.length)-n]){
            return recPalyndromArray(array, n-1);
        }
        else{
            return 0;
        }
    }
}
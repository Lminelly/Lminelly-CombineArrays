
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int combinedLength= arr1.length + arr2.length;

        int[] combinedArray= new int[combinedLength];

         for(int i=0; i < arr1.length; i++){
            combinedArray[i] = arr1[i];
         }
         for(int i=arr1.length; i < combinedLength; i++){
            combinedArray[i] = arr2[i-arr1.length];
         }
        return combinedArray;
    }
}


/* Given a fixed length arr of integers, duplicate each occurrence of zero, shifting the remaining
*  elements to the right */

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for (int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j -1];
                }
                i++;
            }
        }
    }
}


import java.util.Arrays;

public class Question6 {
    public static void swapAndZero(int[] arr,int start,int end) {
        for(int i=end-1;i>=start;i--){
            arr[i+1]=arr[i];
        }
        arr[start]=0;
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,0,0};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                swapAndZero(arr,i+1,arr.length-1);
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

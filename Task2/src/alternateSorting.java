import java.util.Arrays;

public class alternateSorting {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        Arrays.sort(arr);
        int start=0, end=arr.length-1;
        int k=0;
        int result[]=new int[arr.length];
        while(start<end){
            result[k++]=arr[end--];
            result[k++]=arr[start++];
        }
        if(arr.length%2!=0){
            result[k]=arr[end];
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

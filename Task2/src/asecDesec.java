import java.util.Arrays;

public class asecDesec {
    public static void main(String[] args) {
        int[] arr={13,2,4,15,12,10,5};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int start=0, end=n-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start+=2;
            end-=2;
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

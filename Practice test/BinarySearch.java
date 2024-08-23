import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int low=0,high=arr.length-1;
        int mid=0; boolean found=false;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                found=true;
                break;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        if(!found)
            System.out.println(low);
        s.close();
    }
}

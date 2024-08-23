import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size=s.nextInt();
        int[] array=new int[size];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        System.out.print("Enter the rotation count: ");
        int rotationCount=s.nextInt();
        reverse(array, 0, size-1);
        reverse(array, 0, size-rotationCount-1);
        reverse(array, size-rotationCount, size-1);
        System.out.println(Arrays.toString(array));
        s.close();
    }

    public static void reverse(int[] array,int start,int end){
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}

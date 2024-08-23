public class smallElement {
    public static void main(String[] args) {
        int[] arr={10,3,2,4,1,9,60,100,999,75};
        int len=arr.length;
        int min=Integer.MAX_VALUE,pos=0;
        for(int i=0;i<len;i++){
            if(arr[i]<min){
                min = arr[i];
                pos=i;
            }
        }
        System.out.println("Smallest number in the array is "+min+" found at position(0 based index) "+pos);
    }
}

public class Question3 {
    public static void main(String[] args) {
        int th=2;
        int[] arr={5,8,10,13,6,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i]/th;
            if(arr[i]%th!=0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}

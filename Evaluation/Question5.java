public class Question5 {
    public static void main(String[] args) {
        int[] arr={3,2,3,2,2,2};
        int[] freq=new int[501];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        boolean split=true;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0 || freq[i]%2==0){
                continue;
            }
            else{
                split=false;
                break;
            }
        }
        if(split){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

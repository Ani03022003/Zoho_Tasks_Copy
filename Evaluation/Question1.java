class Question1{
    public static int findMax(int[] arr,int start,int end){
        int max=Integer.MIN_VALUE;
        for(int i=start;i<end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int k=4;
        int[] arr={8,5,10,7,9,4,15,12,90,13};
        int len=arr.length;
        for(int i=0;i<=len-k;i++){
            System.out.println(findMax(arr, i, i+k));
        }
    }
}
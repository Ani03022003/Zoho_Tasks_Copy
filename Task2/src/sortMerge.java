public class sortMerge {
    public static void main(String[] args) {
        int[] Array1={2,4,5,6,7,9,10,13};
        int[] Array2={2,3,4,5,6,7,8,9,11,15};
        int[] MergeArray=new int[Array1.length+Array2.length];

        int i=0,j=0,k=0;
        while(i!=Array1.length && j!=Array2.length){
            if(Array1[i]==Array2[j]){
                MergeArray[k++]=Array1[i];
                i++;
                j++;
            }
            else if(Array1[i]<Array2[j]){
                MergeArray[k++]=Array1[i];
                i++;
            }
            else{
                MergeArray[k++]=Array2[j];
                j++;
            }
        }
        while(i!=Array1.length){
            MergeArray[k++]=Array1[i++];
        }
        while(j!=Array2.length){
            MergeArray[k++]=Array2[j++];
        }
        for(int l=0;l<MergeArray.length;l++){
            if(MergeArray[l]==0 && MergeArray[0]!=0)
                break;
            System.out.print(MergeArray[l]+" ");
        }
    }
}

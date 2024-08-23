import java.util.Arrays;

public interface Sortable {
    void sort(int[] arr,int low,int high);
}

class BubbleSort implements Sortable{

    public void sort(int[] arr,int low,int high){
        for(int i=low;i<=high;i++){
            for(int j=0;j<=high-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

class QuickSort implements Sortable{

    public int pivot(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public void sort(int[] arr,int low,int high){
        if(low<high){
            int pi=pivot(arr,low,high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}

class MergeSort implements Sortable{
    public void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=low;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }

        while(i<n1){
            arr[k++]=L[i++];
        }

        while(j<n2){
            arr[k++]=R[j++];
        }

    }
    public void sort(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);

        }
    }
}
class SortInterfaceDemo{
    public static void main(String[] args) {
        int arr[]={22,16,36,18,4,21,28,2,7,35,9,15,5,23,10,20};
        BubbleSort bs=new BubbleSort();
        bs.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        QuickSort qs=new QuickSort();
        qs.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        MergeSort ms=new MergeSort();
        ms.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

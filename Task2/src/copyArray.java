public class copyArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}

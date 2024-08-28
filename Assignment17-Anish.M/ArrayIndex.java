package Assignment_15;
/*
 * 5. Write program to demonstrate ArrayIndexOutOfBoundsException
 */
public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Index Out Of Bound is Occured");
        }
    }
}

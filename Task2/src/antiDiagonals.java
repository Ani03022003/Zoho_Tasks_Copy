import java.util.*;

public class antiDiagonals {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        for(int i=0;i<2*n-1;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.get(i+j).add(arr[i][j]);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

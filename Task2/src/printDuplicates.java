import java.util.HashMap;
import java.util.Map;

public class printDuplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr={1,1,2,2,3,4,5,6,7,8,8,9,10};
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>=2){
                System.out.println(m.getKey());
            }
        }
    }
}

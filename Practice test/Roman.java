import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] roman={'0','I','V','X','L','C','D','M'};
        int[] values={0,1,5,10,50,100,500,1000};
        int[] map1=new int[127];
        int k=0;
        for(int i=0;i<roman.length;i++){
            map1[roman[i]]=values[k++];
        }

        // HashMap<Character,Integer> map=new HashMap<>();
        // map.put('I',1);
        // map.put('V',5);
        // map.put('X',10);
        // map.put('L',50);
        // map.put('C',100);
        // map.put('D',500);
        // map.put('M',1000);
        int result=0;
        for(int i=0;i<str.length()-1;i++){
            if(map1[str.charAt(i)]>=map1[str.charAt(i+1)]){
                result+=map1[str.charAt(i)];
            }
            else{
                result-=map1[str.charAt(i)];
            }
        }
        result+=map1[str.charAt(str.length()-1)];

        System.out.println(result);
        s.close();
    }
}

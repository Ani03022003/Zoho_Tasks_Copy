import java.util.*;

public class Parenthesis{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int val=s.nextInt();
        s.close();
        recurive("",0,0,val);
    }
    public static void recurive(String s,int open,int close,int val){
        if(s.length()==val*2){
            System.out.println(s);
            return;
        }

        if(open<val){
            String str=s;
            str+='(';
            recurive(str, open+1, close, val);
        }
        if(open>close){
            String str=s;
            str+=')';
            recurive(str, open, close+1, val);
        }
    }
}

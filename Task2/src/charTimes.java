public class charTimes {
    public static boolean isChar(char c){
        if((c>=65 && c<=90) || (c>=97 && c<=122))
            return true;
        return false;
    }
    public static int nums(String str, int n){
        if(!isChar(str.charAt(n+1)) && !isChar(str.charAt(n+2))){
            String num=""+str.charAt(n+1) + str.charAt(n+2);
            return Integer.parseInt(num);
        }
        else{
            String num=""+str.charAt(n+1);
            return Integer.parseInt(num);
        }
    }
    public static void printTimes(String str){
        //HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length()-2;i++){
            if(isChar(str.charAt(i))){
                for(int j=1;j<=nums(str, i);j++){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        String str="b3c6d15";
        printTimes(str);
    }
}

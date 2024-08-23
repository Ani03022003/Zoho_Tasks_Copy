public class stringReverse {
    public static String revWord(String str){
        if(str.length()<1){
            return str;
        }
        return revWord(str.substring(1))+str.charAt(0)+"";
    }

    public static String revString(String str){
        int start=0,end=0;
        String result="";
        for(end=0;end<str.length();end++){
            if(str.charAt(end)==' '){
                result+=revWord(str.substring(start, end));
                start=end+1;
            }
        }
        result+=revWord(str.substring(start, end));
        String s=revWord(result);
        StringBuilder realresult=new StringBuilder();
        int k=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                realresult.append(" ");
            }
            else{
                realresult.append(s.charAt(k++));
            }
        }
        //System.out.println(realresult);
        return realresult.toString();
    }
    public static void main(String[] args) {
        String str="India won the world cup T20";
        System.out.println(revString(str));
    }
}

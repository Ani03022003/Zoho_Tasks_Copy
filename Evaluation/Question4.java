public class Question4 {
    public static void main(String[] args) {
        String str1="strstringthistest123123ststring";
        String str2="string";
        int i=0,j=0;
        while(j!=str2.length()-1 && i!=str1.length()-1){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else if(j>0){
                j=0;
            }
            else{
                i++;
                j=0;
            }
        }
        if(i==str1.length()-1 && j!=str2.length()-1){
            System.out.println(-1);

        }
        else{
            System.out.println((i-str2.length())+1);
        }
    }
}

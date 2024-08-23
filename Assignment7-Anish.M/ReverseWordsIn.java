public class ReverseWordsIn {
    public static void main(String[] args) {
        String str="Anish have a dog named Toshi";
        String reverseString="";
        String[] strArray=str.split(" ");
        for(int i=0;i<strArray.length;i++){
            reverseString+=reverse(strArray[i])+" ";
        }
        System.out.println(reverseString);
    }

    private static String reverse(String string) {
        //throw new UnsupportedOperationException("Unimplemented method 'reverseString'");
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev+=string.charAt(i);
        }
        return rev;
    }
}

public class CountVowels {
    public static void main(String[] args) {
        int count=0;
        String str="Anish";
        String lowerStr=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(lowerStr.charAt(i)=='a'||lowerStr.charAt(i)=='e'||lowerStr.charAt(i)=='i'||lowerStr.charAt(i)=='o'||lowerStr.charAt(i)=='u')
                count++;
        }
        System.out.println("Number of vowels in the string is: "+count);
    }
}

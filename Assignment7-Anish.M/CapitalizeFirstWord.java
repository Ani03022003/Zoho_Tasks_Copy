public class CapitalizeFirstWord {
    public static void main(String[] args) {
        String sentance="Anish have a dog named thoshi";
        String result="";
        String[] str=sentance.split(" ");
        for(int i=0;i<str.length;i++){
            result+=capitalize(str[i])+" ";
        }
        System.out.println(result);
    }

    public static String capitalize(String str){
        if(Character.isLowerCase(str.charAt(0)))
            return ""+Character.toUpperCase(str.charAt(0))+str.substring(1);
        return str;
    }
}

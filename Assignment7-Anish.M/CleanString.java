class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        String cleanString="";
        for(int i=0;i<identifier.length();i++){
            char c=identifier.charAt(i);
            if(i<identifier.length()-1 && c=='-'){
                cleanString=cleanString+(""+identifier.charAt(i+1)).toUpperCase();
                i++;
                continue;
            }
            if(Character.isLetterOrDigit(c) || c==' ')
                cleanString=cleanString+c;
            cleanString=cleanString.replaceAll(" ","_");
            cleanString=cleanString.replaceAll("4","a");
            cleanString=cleanString.replaceAll("3","e");
            cleanString=cleanString.replaceAll("0","o");
            cleanString=cleanString.replaceAll("1","l");
            cleanString=cleanString.replaceAll("7","t");
            
        }
        return cleanString;
    }
}
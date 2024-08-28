package Assignment_15;
/*2. Create a custom Exception by yourself and try throwing and catching the same. */
public class CreatedException extends Exception{
    CreatedException(String name){
        super(name);
    }
    public static void main(String[] args) {
        try {
            throw new CreatedException("Created Exception is thrown");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

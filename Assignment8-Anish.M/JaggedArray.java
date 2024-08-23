import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of persons: ");
        int n=s.nextInt();
        float[][] personWeight=new float[n][];
        int choice=0;
        while(true){
            System.out.println("1. Set person weights.");
            System.out.println("2. Find minimum weight of a person.");
            System.out.println("3. Exit.");
            System.out.print("Enter your choice: ");
            choice=s.nextInt();
            switch(choice){
                case 1:System.out.print("Enter who's weights you want to enter(Max no. "+n+"): ");
                    int person=s.nextInt();
                    setWeight(personWeight,person);
                    break;
                case 2:System.out.println("Enter who's minimum weight you want to find(Max no. "+n+"): ");
                    int person_1=s.nextInt();
                    float minWeight=findMinimumWeight(personWeight,person_1);
                    System.out.println("Minimum weight is: "+minWeight);
                    break;
                case 3: System.exit(0);
                default:System.out.println("Invalid Choice.");
            }
        }
    }

    public static int setWeight(float[][] personWeight,int person){
        System.out.print("Enter the weights of person "+person+"(Enter \"-1\" to stop): ");
        float[] weights=new float[100];
        int count=0;
        do{
            weights[count++]=s.nextFloat();
        }while(weights[count-1]!=-1);
        personWeight[person]=Arrays.copyOf(weights, count-1);
        return count-1;
    }

    public static float findMinimumWeight(float[][] personWeight,int person) {
        if(personWeight[person].length==0){
            System.out.println("Weight is not Entered");
            return 0;
        }
        float minimumWeight=Float.MAX_VALUE;
        for(int i=0;i<personWeight[person].length;i++){
            if(personWeight[person][i]<minimumWeight)
                minimumWeight=personWeight[person][i];
        }
        return minimumWeight;
    }
}

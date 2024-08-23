import java.util.Scanner;

public class AverageOfTen {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float averageWeight=0;
        float sumAverage=0;
        float weights[]=new float[10];
        for(int i=0;i<10;i++){
            weights[i]=s.nextFloat();
        }
        for(int i=0;i<10;i++){
            sumAverage+=weights[i];
        }
        averageWeight=sumAverage/10;
        System.out.println(averageWeight);
        s.close();
        //System.out.println(Test.x);
    }
}

// class Test{
//     int x=10;
//     public Test(){
//         System.out.println(x);
//     }
// }
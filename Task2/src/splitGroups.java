import java.util.Scanner;

public class splitGroups {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Total Number of students:");
        int n=s.nextInt();
        int grp1[]=new int[n/4];
        int grp2[]=new int[n/4];
        int grp3[]=new int[n/4];
        int grp4[]=new int[n/4];
        int k=0,l=0,p=0,q=0;
        for(int i=1;i<=n;i++){
            if(i%4==0){
                grp4[k++]=i;
            }
            if(i%4==3){
                grp3[l++]=i;
            }
            if(i%4==2){
                grp2[p++]=i;
            }
            if(i%4==1){
                grp1[q++]=i;
            }
        }
        System.out.println("Group1:");
        for(int i=0;i<n/4;i++){
            System.out.println(grp1[i]);
        }
        System.out.println("\nGroup2:");
        for(int i=0;i<n/4;i++){
            System.out.println(grp2[i]);
        }
        System.out.println("\nGroup3:");
        for(int i=0;i<n/4;i++){
            System.out.println(grp3[i]);
        }
        System.out.println("\nGroup4:");
        for(int i=0;i<n/4;i++){
            System.out.println(grp4[i]);
        }
        s.close();
    }
}

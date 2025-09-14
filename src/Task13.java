import java.util.Scanner;

public class Task13 {
    public static void main(String[ ] args){
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();


        for (int i =2; i<=n; i++){
            int count=0;
            for (int k=1;k<=i;k++){
                if (i%k==0){
                    count++;
                }
                if (count==2&&k==i) {
                    System.out.print(i+" ");
                } else if (count>2) {
                    break;
                }
            }

        }
    }
}

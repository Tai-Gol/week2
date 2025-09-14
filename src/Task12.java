
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ind=input.nextInt();
        int[] arr=new int[ind+1];

        for (int i=0; i<ind; i++){
            if ((i==1)||(i==0)){
                arr[i]=1;
            }else{
                arr[i]=arr[i-1]+arr[i-2];
                System.out.println(i-1);
                System.out.println(i-2);
            }
        }
        System.out.println("---"+arr[ind-1]+"-----");
        for (int i=0 ; i<ind ; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
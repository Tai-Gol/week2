import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int l=input.nextInt();
        int[] arr=new int[l];
        int counter=0;


        for (int i=0 ; i<l ; i++){
            arr[i]= input.nextInt();
        }

        int[]past=arr.clone();
        for (int p=0; p<l-1;p++){
            int min=p;
            for (int i = p+1; i<l ; i++){
                if (arr[min]>arr[i]){
                    min=i;
                }
            }
            int temp=arr[min];

            arr[min]=arr[p];
            arr[p]=temp;
            System.out.println(arr[min]);

        }

        for (int r=0;r<l;r++){
            System.out.print(arr[r]);
        }

    }
}

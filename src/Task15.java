import java.util.Arrays;

public class Task15 {
    public static void main(String [] args){
        int[ ] arr={1,4,2,6,8,8,9,5,0};
        int min=arr[0];
        int min_ind=0;
        int max=arr[0];
        int max_ind=0;

        for (int i=1; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
                min_ind=i;
            }
            if (max<arr[i]){
                max=arr[i];
                max_ind=i;
            }
        }
        int temp=min;
        arr[min_ind]=max;
        arr[max_ind]=min;

        for (int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

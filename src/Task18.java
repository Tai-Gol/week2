import java.util.Arrays;

public class Task18 {
    public static void main(String [] args){
        int[ ] arr={1,4,2,6,8,8,9,5,0};
        int sec_max=arr[0];
        int max=arr[0];
        int max_ind=0;

        for (int i=1; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
                max_ind=i;
            }
        }

        for (int i=1; i<arr.length; i++){
            if (i==max_ind){
                continue;
            }else if(sec_max<arr[i]){
                sec_max=arr[i];
            }
        }


        System.out.print(sec_max);

    }
}

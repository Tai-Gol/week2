public class Task14 {
    public static void main(String[] args){
        int[ ] arr={1,4,2,6,8,8,9,5,0};
        int coef=0;
        int sum=0;

        if(arr.length%2!=0){
            coef=1;
        }

        for (int i=0; i<arr.length-coef ; i+=2){
            sum+=arr[i];
        }

        System.out.print(sum);
    }
}

import java.util.Objects;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String line="Java is great and Java is powerful";
        line=line.toLowerCase();
//        String div=("[ ,//.//s]");
        int[] words= {34,123,56,98,34,56,2,6,9};
        int[] ans=new int[words.length];
        int counter=0;
        for (int i=0; i<words.length;i++){

            for (int k=0; k<ans.length;k++){

                if (Objects.equals(words[i], ans[k])){
                    break;

                }else if (k == (ans.length-1)){
                    ans[counter]=words[i];
                    counter++;
                }
            }

        }
        for (int y=0; y<ans.length;y++){
            System.out.println(ans[y]);
        }

    }
}
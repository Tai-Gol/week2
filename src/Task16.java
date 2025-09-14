import java.util.Arrays;

public class Task16 {
    public static void main(String [] args){
        String line="lineOfWords";
        int len=line.length();
        String[] letters=new String[len];

        for (int i=0; i<len; i++){
            letters[i]= String.valueOf(line.charAt(i));
        }

        int begin=0;
        int end=letters.length-1;
        String temp;
        while(end>begin){
            temp = letters[begin];
            letters[begin]=letters[end];
            letters[end] = temp;
            end--;
            begin++;
        }

        line="";

        for (int i=0; i<len; i++){
            line+=letters[i];
        }
        System.out.print(line);
    }
}

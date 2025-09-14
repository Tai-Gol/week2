import java.util.Scanner;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "ooh i love\nSPECIAL CHARACTERS\n\tfavorite thing EVER";


        String answ=line.replace("\t","");
        answ=answ.replace(" ","");
        answ=answ.replace("\n","");

        System.out.println(line);
        System.out.println(answ);
    }
}

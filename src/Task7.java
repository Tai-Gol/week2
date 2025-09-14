import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "a12bc34d5";
        String regex = "[^0-9]+";
        String[] words = line.split(regex);

        int sum = 0;

        for (int i = 0; i < words.length; i++) {
//            sum+=Integer.parseInt(words[i]);
            try {
                sum += Integer.parseInt(words[i]);
            }
            catch (NumberFormatException e) {
                continue;
            }
//            System.out.println(words[i].getClass().getCanonicalName());
        }
        System.out.print(sum);
    }
}

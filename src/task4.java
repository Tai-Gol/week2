public class task4 {
    public static void main(String[] args){
        String line="A man a plan a canal Panama";
//        String line="bow";

        line=line.toLowerCase();
        line=line.replaceAll(" ","");
        String ans=new String();
        String reverce=new String();
        int v_count=0;
        int c_count=0;

        for (int w=line.length()-1;w>=0;w--){
            char ch= line.charAt(w);
            reverce+=ch;

        }
        if (reverce==line){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
//        System.out.println(reverce);

    }
}

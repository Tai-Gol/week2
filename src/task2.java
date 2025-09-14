public class task2 {
    public static void main(String[] args){
        String line="Java is great and Java is powerful";
        line=line.toLowerCase();
        String[] words=line.split(" ");
       String ans=new String();
        for (int w=0;w<words.length;w++){

            if (w==0){
                continue;
            }
            String word1=words[w];
            String word2=words[w-1];
            if (word1.length()>=word2.length()){
                ans=word1;
            }else{
                ans=word2;
            }

        }
        System.out.println(ans);
    }
}

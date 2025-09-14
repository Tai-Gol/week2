public class task3 {
    public static void main(String[] args){
        String line="hello";
        line=line.toLowerCase();
        String[] words=line.split(" ");
        String ans=new String();
        String vovels="aouie";
        int v_count=0;
        int c_count=0;

        for (int w=0;w<words.length;w++){
            String word=words[w];

            for(int l=0;l<word.length(); l++){
                for (int x=0;x<vovels.length();x++){
                    if(vovels.charAt(x) == word.charAt(l)){
                        v_count++;
                        break;
                    } else if (x==vovels.length()-1) {
                        c_count++;

                    }
                }

            }

        }
        System.out.println(v_count);
        System.out.println(c_count);

    }
}

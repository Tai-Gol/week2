public class Task8 {
    public static void main(String[] args){
        String line = "asdganag";
        String dictionary="";
        int[] occurances=new int[line.length()];

        dictionary+=line.charAt(0);

        int count=0;


        for (int i = 0; i < line.length(); i++){
            for (int l=0;l<dictionary.length();l++){
                if (dictionary.charAt(l)==line.charAt(i)){
                    occurances[l]=occurances[l]+1;
                    count++;
                    break;
                }else if((dictionary.charAt(l)!=line.charAt(i))&&(l==dictionary.length()-1)){
                    dictionary+=line.charAt(i);
                    occurances[count]=0;
                }
            }

        }

        String[] words = new String[count];

        for (int o=0; o<dictionary.length();o++){
            if (occurances[o]>1){
                System.out.println(dictionary.charAt(o)+" - "+occurances[o]);
            }

        }
    }
}

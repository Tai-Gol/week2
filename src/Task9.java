public class Task9 {
    public static void main(String[] args){
        String line = "listen";
        String line2="silent";
        String dictionary="";
        String dictionary2="";
        int[] occurances=new int[line.length()];
        int[] occurances2=new int[line2.length()];

        dictionary+=line.charAt(0);
        dictionary2+=line2.charAt(0);

        int count=0;
        int count2=0;

        boolean state=true;


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

        for (int i = 0; i < line2.length(); i++){
            for (int l=0;l<dictionary2.length();l++){
                if (dictionary2.charAt(l)==line2.charAt(i)){
                    occurances2[l]=occurances2[l]+1;
                    count2++;
                    break;
                }else if((dictionary2.charAt(l)!=line2.charAt(i))&&(l==dictionary2.length()-1)){
                    dictionary2+=line2.charAt(i);
                    occurances2[count2]=0;
                }
            }

        }

        String[] words = new String[count];

        for (int o=0; o<dictionary.length();o++){
            System.out.print(dictionary.charAt(o)+"-"+occurances[o]+" ; ");
        }
        System.out.println();
        for (int o=0; o<dictionary2.length();o++){
            System.out.print(dictionary2.charAt(o)+"-"+occurances2[o]+" ; ");
        }
        Breakpoint:

        for (int f=0; f<dictionary.length() ; f++){
            for (int s = 0; s <dictionary2.length() ; s++){
                if((dictionary2.charAt(s)==dictionary.charAt(f))&&(occurances2[s]==occurances[f])){
                    break;
                }else if(((dictionary2.charAt(s)!=dictionary.charAt(f))&&s==dictionary2.length()-1)||((occurances2[s]!=occurances[f])&&s==dictionary2.length()-1)){
                    System.out.println("It isn't an anagram");
                    state=false;
                    break Breakpoint;
                }
            }
        }
        if (state==true){
            System.out.println("It is an anagram");
        }
    }
}

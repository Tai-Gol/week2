public class task5 {
    public static void main(String[] args){
        String line="as man has said";
        String subline="man";

        line=line.toLowerCase();
        line=line.replaceAll(" ","");
        String ans=new String();
        String reverce=new String();
        int c_count=0;

       //length of the whole line
        for (int l=0;l<subline.length();l++){
            for (int i=0; i<line.length();i++){//going through subline
                if(line.charAt(i)==subline.charAt(0)){
                    c_count++;
//                    System.out.println(subline.charAt(l));
                    if (c_count==subline.length()){
                        System.out.println("Is a substring");
                    }else{
                        break;
                    }


                }
            }
        }
//        System.out.println(reverce);

    }
}

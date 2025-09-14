public class Task20 {
    public static void main(String[] args){
        String line="thisaisakillingame";
        char subline='a';


        int[] ind_of_sub=new int[line.length()];
        int c_count=0;
        for (int i=0; i<line.length();i++){//going through subline
             if(line.charAt(i)==subline){
                 ind_of_sub[c_count]=i;
                 c_count++;
             }
        }
        int prev=ind_of_sub[0];
        String[] ans=new String[c_count+1];
        for (int i=0; i<= c_count; i++){

            if(i==0){
                ans[i]=line.substring(0,ind_of_sub[0]);
            }else if (i==c_count){
                ans[i]=line.substring(prev,line.length());
            }else{
                ans[i]=line.substring(prev,ind_of_sub[i]);
                prev=ind_of_sub[i]+1;
            }
        }
        for (int i=0; i<c_count; i++){
            System.out.println(ans[i]);
        }
    }
}

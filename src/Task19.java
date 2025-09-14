public class Task19 {
    public static void main(String[] args){
        String[] one={"word","example","in","an","array"};
        String[] two={"another","example","of","the","century"};
        int len=one.length+two.length;
        String[] merged=new String[len];

        int deez=0;

        for (int i=0;i<one.length;i++){//  <---- word to put in the merged arr
            System.out.print("Switched letter");
            int count=0;
            for (int y=0; y<len; y++){ //  <---- checking that it's not in the merged already


                if (one[i].equals(merged[y])){
                    System.out.println("Bazinga");
                    break;
                }else if(count==len-1){
                    System.out.println("IT HAPPENED");
                    merged[deez]=one[i];
                    deez++;
                }else{count++;
                    System.out.println("not sure yet");

                }
            }
        }

        for (int i=0;i<two.length;i++){//  <---- word to put in the merged arr
            System.out.print("Switched letter");
            int count=0;
            for (int y=0; y<len; y++){ //  <---- checking that it's not in the merged already


                if (two[i].equals(merged[y])){
                    System.out.println("Bazinga");
                    break;
                }else if(count==len-1){
                    System.out.println("IT HAPPENED");
                    merged[deez]=two[i];
                    deez++;
                }else{count++;
                    System.out.println("not sure yet");

                }
            }
        }
        for (int i=0;i<merged.length;i++){
            System.out.print(merged[i]+", ");

        }

//        System.out.print(one[1].contains(two[1]));
//        System.out.print(one[1].equals(two[1]));

    }
}

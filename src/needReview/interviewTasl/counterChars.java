package needReview.interviewTasl;
/*
Given any String print out how many times each character is found in the String
 */
public class counterChars {
    public static void main(String[] args) {
        counter("Java");
        //counter("Sun");
    }
    public static void counter(String str){
        String temp="";
        for (int i = 0; i <str.length() ; i++) { //J
            int count=0;
            char outer=str.charAt(i);
            if(temp.contains("" + outer)){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                char iner=str.charAt(j);
                if(("" + outer).equalsIgnoreCase(""+iner)){
                    count++;
                }
            }
            System.out.println(outer+" " + count);
            temp+=outer;
        }
    }


}

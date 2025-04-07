package needReview.interviewTasl;

/*
Write a program that will count how many times “java”is found in any given Stri
 */
public class counterString {
    public static void main(String[] args) {
        System.out.println(counterJava("Java is beauty java python excel"));
    }

    public static int counterJava(String str){
        int count=0;
        String java="java";
       String [] words =  str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equalsIgnoreCase(java)){
                count++;
            }
        }
        return count;
    }
}

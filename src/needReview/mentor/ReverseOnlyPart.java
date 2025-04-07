package needReview.mentor;

//Reverse only text
//"test12pro90java"
//return "tset12orp90avaj"
//USE STRINGBUILDER also
public class ReverseOnlyPart {
    public static void main(String[] args) {
        String str = "test12pro90java";
        System.out.println(returnReversed2(str));
    }

    public static String returnReversed2 (String str){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                stringBuilder.append(str.charAt(i));
            }
            if(Character.isDigit(str.charAt(i))){
                result.append(stringBuilder.reverse());
                stringBuilder=new StringBuilder();
                result.append(str.charAt(i));
            }
        }
        result.append(stringBuilder.reverse());
        return result.toString();
    }

}

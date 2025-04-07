package needReview.intervie;
/*
String>5 characters
word<3 char ---> return
word>3---> return only 3 char
iterate and print letters 1 by 1
 */
public class Interview2 {
    public static void main(String[] args) {
        String word = "Summer";
        //             0123
        String newWord = word.substring(0,3);
        System.out.println(newWord);
        if (word.length()<3) {
            System.out.println(word);
        } else {
            System.out.println(word.substring(0,3));

            String newWord2 = word.substring(0,3);
            for (int i = 0; i < newWord2.length(); i++) {
                System.out.println(newWord2.charAt(i));
            }
        }
/*
expect.== false
actual == false

exp. == false
act. == true 
 */
    }
}

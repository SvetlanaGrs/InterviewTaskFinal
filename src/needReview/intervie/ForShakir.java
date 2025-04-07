package needReview.intervie;
public class ForShakir {
    public static void main(String[] args) {
        String [] words = {"java", "selenium", "softskills", "mentors"};
        String longest = words[0];
        String shortest = words[0];
        for (String each:words) {
            if (each.length()>=longest.length()) {
                longest=each;
            }
            if (each.length()<shortest.length()) {
                shortest=each;
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
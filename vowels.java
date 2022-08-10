public class vowels {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeuio]", "");
    }
    public static void main(String[] args) {
        String str = disemvowel("bruh looser");
        System.out.println(str);
    }
}


package arrays_hashing;

public class KelimedekiElemanlarVarmiisaSubsequence {
    public static void main(String[] args) {
        String s="gsabc";
        String  t ="ahgbdc";
        int count =s.length();
        boolean durum =false;
        for (int i = 0; i < s.length(); i++) {
            if(t.contains(s.substring(i,i+1))) {
                count--;
            }
            if(count == 0) {
                durum = true;
            }
        }
        System.out.println("durum = " + durum);
    }
}

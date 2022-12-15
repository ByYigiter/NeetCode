package arrays_hashing;

public class EnUzunOrtakOnek {
    public static void main(String[] args) {
        String str[]={"flowers","flow","flowight","flowe"};
        String str1=str[0];
        String prefix="";
        for (int i=0; i<str.length; i++) {
            if (str1.substring(i,i+1).equals(str[i].substring(i,i+1))){
                prefix+=str1.substring(i,i+1);
            }

        }
        System.out.println(prefix);
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Monoalphabetic {
    public static void main(String[] args) {
        String PlainText;
        String key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Plaintext");
        PlainText=sc.nextLine().toUpperCase();
        System.out.println("Enter the Key");
        key="MNBVCXZLKJHGFDSAPOIUYTREWQ";//sc.nextLine().toUpperCase();

        HashMap<Character,Character> Map1=new HashMap<>();
        HashMap<Character,Character> Map2=new HashMap<>();

        for(int i=0;i<key.length();i++){
            char left=(char)(i+'A');
            char right=key.charAt(i);
            Map1.put(left,right);
            Map2.put(right,left);
        }
        //Encryption
        StringBuilder CipherText=new StringBuilder();
        char[] ar=PlainText.toCharArray();
        for(char c:ar){
            CipherText.append(Map1.get(c));
        }
        System.out.println("encrypted Message " +CipherText.toString().toLowerCase());

          //Decryption
        StringBuilder dec=new StringBuilder();
        ar=CipherText.toString().toCharArray();
        for(char c:ar){
            dec.append(Map2.get(c));
        }
        System.out.println("decrypted Message " +dec.toString().toUpperCase());
    }
}

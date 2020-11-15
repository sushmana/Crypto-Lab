import java.sql.SQLOutput;
import java.util.Scanner;
public class CeasarEncrypt {

    public static void main(String[] args) {
            String PlainText;
            int key;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the plaintext");
            PlainText = sc.nextLine().toUpperCase();
            System.out.println("Enter the key");
            key = sc.nextInt();

            String CipherText="";
            char alphabet;
            for(int i=0;i<PlainText.length();i++) {

                alphabet=PlainText.charAt(i);

                if((alphabet>='a') && (alphabet<='z')) {
                    alphabet = (char) (alphabet + key);

                    if (alphabet > 'z') {
                        alphabet =(char)(alphabet + 'a' + 'z' - 1);
                    }
                    CipherText=CipherText+alphabet;
                }
                else {
                    if((alphabet >= 'A') && (alphabet <= 'Z')){
                        alphabet=(char)(alphabet+key);
                        if(alphabet > 'Z'){
                            alphabet=(char)(alphabet+'A'+'Z'-1);
                        }
                    }
                    CipherText=CipherText+alphabet;
                }
            }
            System.out.println("CipherText is "+CipherText);
        }
    }



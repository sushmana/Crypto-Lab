import java.util.Scanner;

public class CeaserDecrypt {
    public static void main(String[] args) {
        String CipherText;
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CipherText");
        CipherText=sc.nextLine().toLowerCase();
        System.out.println("Enter the key");
        key=sc.nextInt();

        String PlainText="";
        char alphabet;

        for(int i=0;i<CipherText.length();i++){
            alphabet=CipherText.charAt(i);
            if((alphabet>='a') && (alphabet<='z')){

                alphabet= (char)(alphabet-key);
                PlainText=PlainText+alphabet;
            }
            else if((alphabet>='A') && (alphabet<='Z')){
                alphabet=(char)(alphabet-key);
                if(alphabet>'Z') {
                if(alphabet>'Z'){
                    alphabet=(char)(alphabet-('a'+'z'+1));
                }
                    alphabet = (char) (alphabet -('A'+'Z'+1));
                }
                PlainText=PlainText+alphabet;
        }
            else{
                PlainText=PlainText+alphabet;
            }


        }
        System.out.println("PlainText is"+ PlainText);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        String text = "EHUEDKdbd";
        String text2 = "BeRBAHAYA";
        String chipperText = enkripsi(text2.toLowerCase());
        String plainText = deskripsi(text.toLowerCase());

        System.out.println("Text awal plaintext :"+plainText);
        System.out.println("Text Chippertext nya :"+chipperText);

    }
    public static String enkripsi(String plainText){
        StringBuilder chipperText = new StringBuilder(plainText);

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
        'p','q','r','s','t','u','v','w','x','y','z'};

        char[] enkripsiAlphabet = {'d','e','f','g','h','i','j','k','l','m','n','o',
        'p','q','r','s','t','u','v','w','x','y','z','a','b','c'};

        for(int i=0; i < plainText.length(); i++){
            char ch = plainText.charAt(i);

            char enkripsiChar = ch;
            for(int j = 0; j < alphabet.length; j++){
                if(ch == alphabet[j]){
                    enkripsiChar = enkripsiAlphabet[j];
                    break;
                }
            }
            chipperText.append(enkripsiChar);
        }
        StringBuilder chipper = chipperText.delete(0, chipperText.length()/2);
        return chipperText.toString();
    }
    public static String deskripsi(String chipperText){
        StringBuilder plainText = new StringBuilder(chipperText);
        char[] enkripsiAlphabet = {'d','e','f','g','h','i','j','k','l','m','n','o',
        'p','q','r','s','t','u','v','w','x','y','z','a','b','c'};

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
        'p','q','r','s','t','u','v','w','x','y','z'};


        for(int i=0; i < chipperText.length(); i++){
            char ch = chipperText.charAt(i);

            char plainchar = ch;
            for(int j = 0; j < enkripsiAlphabet.length; j++){
                if(ch == enkripsiAlphabet[j]){
                    plainchar = alphabet[j];
                    break;
                }
            }
            plainText.append(plainchar);
        }
        StringBuilder plain = plainText.delete(0, plainText.length()/2);
        return plain.toString();
}
}


public class RomansToIntegers {

    public void roman_To_integers(String S){

        int num=0; 

        for (int i=0 ; i<=S.length() ; i++) {
            int ch=S.charAt(i);

            switch (ch) {
                case 'I':
                    num+=num;
                    break;

                case 'V':
                    num+4=num;
                    break;
            
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        
    }

}

I 1 V 5 X 10 L 50 C 100 D 500 M 1000
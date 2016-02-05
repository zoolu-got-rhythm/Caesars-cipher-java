public class CaesarCypher {

    public static void main(String args[]) {
      CaesarCipher("qebnrfzhyoltkclugrjmplsboqebixwvald", 3);
    }

    private static void CaesarCipher(String code, int rightShift){

      System.out.println("encoding: " + code);

      char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      String alphabet = new String(alpha);
      System.out.println(alphabet);

      int codeLength = code.length();
      String decoded = ""; // concatinate.

      for (int i = 0; i < codeLength; i++ ) {
          char letter = code.charAt(i); // current letter
          int position = alphabet.indexOf(letter); // current position
          if(position + rightShift > 25) {
            decoded += alphabet.substring(position+rightShift - alphabet.length(), position+rightShift + 1 - alphabet.length());
          } else {
            decoded += alphabet.substring(position+rightShift, position+rightShift + 1);
          }

          System.out.println(decoded);

          // decoded.add(alpha[position+rightShift]);
      }

      System.out.println("decoded");
    }
}

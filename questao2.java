public class questao2 {

   public static void main(String[] args) {
      System.out.println(countLetter("cafe com leite", 'a'));
      System.out.println(countLetter("incrivelmente, eh possivel construir periodos completos sem um digito especifico", 'a'));
   }

   public static int countLetter(String text, char letter) {
      int qnt = 0;
      for (int i = 0; i < text.length(); i++) {
         if (text.toLowerCase().charAt(i) == letter) {
            qnt++;
         }
      }
      return qnt;
   }
   
}

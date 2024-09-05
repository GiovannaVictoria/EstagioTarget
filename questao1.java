import java.util.ArrayList;

public class questao1 {

   private static ArrayList<Integer> sequencia;
   
   public static void main (String[] args) {

      init(5);

      System.out.println(isFibonacci(10));
      System.out.println(isFibonacci(13));
      System.out.println(isFibonacci(21));
      System.out.println(isFibonacci(50));

   }

   public static void init(int n) {
      sequencia = new ArrayList<>();
      
      sequencia.add(0);
      sequencia.add(1);
      
      for (int i = 2; i < n; i++) {
         sequencia.add(sequencia.get(i-1) + sequencia.get(i-2));
      }
   }
   
   public static boolean isFibonacci(int n) {
      int number = 0;
      if (sequencia.size() < 2) {
         init(2);
      }
      if (sequencia.contains(n)) {
         return true;
      } else {
         number = sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2);
         while (number < n) {
            sequencia.add(number);
            number = sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2);
         }
         if (number == n) {
            return true;
         } else {
            return false;
         }
      }
   }

}

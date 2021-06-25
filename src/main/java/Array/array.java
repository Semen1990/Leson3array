package Array;

public class array {
   public static void main(String[] args) {
       String[] stringsArray;
       stringsArray = new String[5];
       stringsArray[0] = "Str 1";
       stringsArray[1] = "Str 2";
       stringsArray[2] = "Str 3";
       stringsArray[3] = "Str 4";
       stringsArray[4] = "Str 5";
              for (int i=0; i < stringsArray.length; i+=2) {
           System.out.println(stringsArray[i]);

       }

   }
}

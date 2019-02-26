package lesson02;

public class StringTest {
     public void everyNth(String a, int n){
         String b = a.trim();
         for(int i=n-1; i < b.length(); i = i+n){
             System.out.print(b.charAt(i));
         }
     }
}

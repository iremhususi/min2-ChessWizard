import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        
        System.out.println("Lutfen sirasiyla 2 sayi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        
        System.out.println(enKucukSayi(sayi1,sayi2));
    }
    
    public static int enKucukSayi(int a, int b){
    
        if(a<b){
            return a;
        }
        
        else if(b<a){
            return b; 
        }
       return a;
    }
}

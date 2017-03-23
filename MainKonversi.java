package konversiAngka;
import java.util.Scanner;
public class MainKonversi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka yang akan dikonversi: ");
        int input = in.nextInt();
        angkatohuruf a = new angkatohuruf(input);
        a.convert();a.convert(input);a.display();
        System.out.print("Masukan terbilang yang akan dikonversi: ");
        String inputh = in.nextLine();inputh = in.nextLine();
        huruftoangka b = new huruftoangka(inputh);
        b.kurang11(inputh); b.belas(inputh); b.kurang100(inputh); b.kurang11(inputh); b.ratusan(inputh); b.seratus(inputh);
        b.display();
        
        
        
    }
    
}

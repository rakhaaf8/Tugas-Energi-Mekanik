import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Double massa,kecepatan,ketinggian,ekinetik,epotensial,emekanik,gravitasi = 10.0;

        Scanner input = new Scanner(System.in);

        //input
        System.out.print("masukan nilai massa = ");
        massa = input.nextDouble();
        System.out.print("masukan nilai kecepatan = ");
        kecepatan = input.nextDouble();
        System.out.print("masukan nilai ketinggian = ");
        ketinggian = input.nextDouble();

        //proses
        ekinetik= 0.5*massa*(kecepatan*kecepatan);
        epotensial= massa*gravitasi*ketinggian;
        emekanik= ekinetik+epotensial;

        //output
        System.out.print("massa="+massa);
        System.out.print(" ,kecepatan="+kecepatan);
        System.out.print(" , dan ketinggian="+ketinggian);
        System.out.println("\nenergi potensial = "+epotensial);
        System.out.println("energi kinetik = "+ekinetik);
        System.out.println("energi mekanik = "+emekanik);

        input.close();
    }
}

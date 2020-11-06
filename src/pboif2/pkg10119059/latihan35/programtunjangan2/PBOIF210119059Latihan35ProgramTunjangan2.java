/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan tunjangan karyawan OO
 */
package pboif2.pkg10119059.latihan35.programtunjangan2;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;

public class PBOIF210119059Latihan35ProgramTunjangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Karyawan k = new Karyawan();
   
        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        k.gaji = input.nextDouble();
        System.out.print("Status anda? (Menikah/Belum) : ");
        k.status = input.next();
        
        System.out.println("");
        System.out.println("~~~~~~~~ Hasil Perhitungan Gaji Anda ~~~~~~~~");
        System.out.println("Gaji Pokok          : " + k.gaji);
        System.out.println("Tunjangan           : " + k.hitungTunj());
        System.out.println("Total               : " + k.totalGaji());
    }
    
}

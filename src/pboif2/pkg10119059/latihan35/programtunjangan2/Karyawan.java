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
public class Karyawan {
    
    double gaji;
    String status;
    
    public double hitungTunj(){
        double tunj;
        if (status.equals("menikah") || status.equals("Menikah")) {
            tunj = 0.35 * gaji;
        } else {
            tunj = 0;
        }
        return tunj;     
    }
    
    public double totalGaji () {
        return gaji + hitungTunj();
    }
    
}

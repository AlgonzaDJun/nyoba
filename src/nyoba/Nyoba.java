/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyoba;

/**
 *
 * @author Arjunnn
 */
public class Nyoba {

    /**
     * @param args the command line arguments
     */
    private static Input input = new Input();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Siswa siswa = new Siswa();
        String nama = input.get("nama : ");
        siswa.setNama(nama);
        OrangTua orangTua = new OrangTua();
        String namaOrtu = input.get("Nama ortu : ");
        orangTua.setNama(namaOrtu);
        String pekerjaan = input.get("pekerjaan orangtua : ");
        orangTua.setKerja(pekerjaan);
        
        
    }
    
}

package tdi.training.java.core.data;

import java.util.Map;
import java.util.HashMap;

public class MahasiswaSet {

    public static void main(String[] args){
        Map<Integer, String> daftarMahasiswa = new HashMap<>();
        daftarMahasiswa.put(1 , "Dimas Maryanto");
        daftarMahasiswa.put(2 , "Hadi Siswanto");
        daftarMahasiswa.put(3 , "Hadi Siswanto");

        System.out.println(
            "Key ke 1 dari daftar mahasiswa adalah " + 
            daftarMahasiswa.get(1) + 
            " dari jumlah data " + 
            daftarMahasiswa.size()
        );

        daftarMahasiswa.remove(2);
        System.out.println(
            "jumlah array sekarang adalah " + daftarMahasiswa.size()
        );
    }
}
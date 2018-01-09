package tdi.training.java.core.data;

import java.util.Set;
import java.util.HashSet;

public class MahasiswaSet{

    public static void main(String[] args){
        Set<String> daftarMahasiswa = new HashSet<>();
        daftarMahasiswa.add("Dimas Maryanto");
        daftarMahasiswa.add("Hadi Siswanto");
        daftarMahasiswa.add("Hadi Siswanto");

        System.out.println(
            "Index ke 1 dari daftar mahasiswa adalah " + 
            daftarMahasiswa.get(1) + 
            " dari jumlah data " + 
            daftarMahasiswa.size()
        );

        daftarMahasiswa.remove(0);
        System.out.println(
            "jumlah array sekarang adalah " + daftarMahasiswa.size()
        );
    }
}
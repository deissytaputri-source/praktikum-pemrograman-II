package modul02.problem3;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        //baris ini error karena tidak ada titik koma(;)
        //e.name = "Roi"
        e.name = "Roi";

        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //pada baris ini umur belum diisi jadi tercetak 0, harusnya ditambahkan pengisian umur
        //(tidak ada baris sebelumnya)
        e.age = 17;

        //pada baris ini output tidak sesuai soal karena tertulis "Nama Pegawai", seharusnya "Nama"
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //pada baris ini output tidak sesuai soal karena tidak ada tulisan "tahun" setelah umur
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}
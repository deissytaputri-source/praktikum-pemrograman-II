package modul02.problem3;

public class Main {
    public static void main(String[] args) {
        //baris ini error karena class Employee tidak ada, adanya class Pegawai
        //Employee e = new Employee();
        Employee e = new Employee();

        //baris ini error karena tidak ada titik koma(;)
        //e.name = "Roi"
        e.name = "Roi";

        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //pada baris ini umur belum diisi jadi tercetak 0, harusnya ditambahkan pengisian umur
        //(tidak ada baris sebelumnya)
        e.age = 17;

        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age + " tahun");
    }
}
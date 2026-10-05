package modul02.problem3;

//pada baris ini terjadi error karena nama class (Pegawai) tidak sama dengan nama file (Employee.java) dan tidak sesuai dengan class yang dipanggil di Main
//public class Pegawai {
public class Employee {
    public String name;

    //pada baris ini terjadi error karena char hanya bisa menyimpan 1 huruf, jadi char perlu diganti menjadi String agar bisa menyimpan sebuah kalimat
    //public char origin;
    public String origin;

    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }
    //pada baris ini terjadi error karena method tidak punya parameter untuk menerima nilai, dan r belum dideklarasikan
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}

package QuanLySinhVien;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }


}

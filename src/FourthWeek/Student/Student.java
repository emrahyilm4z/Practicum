package FourthWeek.Student;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avaragemat, avaragefizik, avaragekimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calculateAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int mat1, int fizik, int fizik1, int kimya, int kimya1) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.examnote = mat1;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.examnote = fizik1;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.examnote = kimya1;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    public void calculateAverage() {
        this.avaragemat = (this.mat.examnote * 0.8) + (this.mat.note * 0.2);
        this.avaragefizik = (this.fizik.examnote * 0.8) + (this.fizik.note * 0.2);
        this.avaragekimya = (this.kimya.examnote * 0.8) + (this.kimya.note * 0.2);

        this.avarage = (this.avaragemat * 0.5) + (this.avaragefizik * 0.25) + (this.avaragekimya * 0.25);
    }


    public boolean isCheckPass() {
        calculateAverage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.avaragemat);
        System.out.println("Fizik Notu : " + this.avaragefizik);
        System.out.println("Kimya Notu : " + this.avaragekimya);
    }
}
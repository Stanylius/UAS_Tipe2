package com.example.uas_tipe2;

public class Employee {
    private String Id, Nama, Hp, Email, Subject, Biografi, Posisi, Kelas;
    private Integer Gaji;



    public Employee() {

    }

    public Employee(String id, String nama, String hp, String email, String subject, String biografi, String posisi, String kelas, int gaji){
        this.Id = id;
        this.Nama = nama;
        this.Hp = hp;
        this.Email = email;
        this.Subject = subject;
        this.Biografi = biografi;
        this.Posisi = posisi;
        this.Kelas = kelas;
        this.Gaji = gaji;
    }



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getHp() {
        return Hp;
    }

    public void setHp(String hp) {
        Hp = hp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getBiografi() {
        return Biografi;
    }

    public void setBiografi(String biografi) {
        Biografi = biografi;
    }

    public String getPosisi() {
        return Posisi;
    }

    public void setPosisi(String posisi) {
        Posisi = posisi;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public Integer getGaji() {
        return Gaji;
    }

    public void setGaji(Integer gaji) {
        Gaji = gaji;
    }
}

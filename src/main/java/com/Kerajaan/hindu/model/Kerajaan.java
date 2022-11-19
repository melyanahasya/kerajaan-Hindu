package com.Kerajaan.hindu.model;


import javax.persistence.*;

@Entity
@Table(name = "kerajaan")
public class Kerajaan {

    // untuk primary key
    @Id
    // untuk auto_increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //membuat colom data
    @Column(name = "kerajaanHindu")
    private String kerajaanHindu;
    @Column(name = "letak")
    private String letak;
    @Column(name = "tahunBerdiri")
    private String tahunBerdiri;
    @Column(name = "rajaTerkenal")
    private String rajaTerkenal;
    @Column(name = "peninggalanSejarah")
    private String peninggalanSejarah;

    public Kerajaan() {
    }

    // untuk
    public Kerajaan(String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        this.kerajaanHindu = kerajaanHindu;
        this.letak = letak;
        this.tahunBerdiri = tahunBerdiri;
        this. rajaTerkenal =  rajaTerkenal;
        this. peninggalanSejarah =  peninggalanSejarah;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // getter untuk mengambil data
    public String getKerajaanHindu() {
        return kerajaanHindu;
    }

    // setter untuk merubah data
    public void setKerajaanHindu(String kerajaanHindu) {
        this.kerajaanHindu = kerajaanHindu;
    }

    public String getLetak() {
        return letak;
    }

    public void setLetak(String letak) {
        this.letak = letak;
    }

    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getRajaTerkenal() {
        return rajaTerkenal;
    }

    public void setRajaTerkenal(String rajaTerkenal) {
        this.rajaTerkenal = rajaTerkenal;
    }

    public String getPeninggalanSejarah() {
        return peninggalanSejarah;
    }

    public void setPeninggalanSejarah(String peninggalanSejarah) {
        this.peninggalanSejarah = peninggalanSejarah;
    }

    @Override
    //
    public String toString() {
        return "Sekolah{" +
                "id=" + id +
                ", kerajaanHindu='" + kerajaanHindu + '\'' +
                ", letak='" + letak + '\'' +
                ", tahunBerdiri='" + tahunBerdiri + '\'' +
                ", rajaTerkenal='" + rajaTerkenal + '\'' +
                ", peninggalanSejarah='" + peninggalanSejarah + '\'' +
                '}';
    }
}

package com.Kerajaan.hindu.service;

import com.Kerajaan.hindu.model.Kerajaan;

import java.util.List;


public interface KerajaanService {
    // menambahkan data
    Kerajaan addKerajaan(Kerajaan kerajaan);

    // menampilkan data atau nilai pada URL
    Kerajaan getKerajaanById(Long id);

    // menampilkan semua data
    List<Kerajaan> getAllKerajaan();

    // mengedit data di dalam method
    Kerajaan editKerajaanById(Long id, String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah);

    // menghapus data di dalam method
    void deleteKerajaanById(Long id);

}



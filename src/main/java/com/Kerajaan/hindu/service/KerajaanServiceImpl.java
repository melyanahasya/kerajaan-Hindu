package com.Kerajaan.hindu.service;

import com.Kerajaan.hindu.model.Kerajaan;
import com.Kerajaan.hindu.repository.KerajaanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KerajaanServiceImpl implements KerajaanService{

    // memanggil class KerajaanRepository
    @Autowired
    private KerajaanRepository kerajaanRepository;

    // menambahkan data
    @Override
    public Kerajaan addKerajaan(Kerajaan kerajaan) {
        return kerajaanRepository.save(kerajaan);
    }

    // menampilkan data sesuai id
    @Override
    public Kerajaan getKerajaanById(Long id) {
        return kerajaanRepository.findById(id).get();
    }

    // menampilkan semua data
    @Override
    public List<Kerajaan> getAllKerajaan() {
        return kerajaanRepository.findAll();
    }

    // mengedit data
    @Override
    public Kerajaan editKerajaanById(Long id, String kerajaanHindu, String letak, String tahunBerdiri, String rajaTerkenal, String peninggalanSejarah) {
        Kerajaan kerajaan = kerajaanRepository.findById(id).get();
        kerajaan.setKerajaanHindu(kerajaanHindu);
        kerajaan.setLetak(letak);
        kerajaan.setTahunBerdiri(tahunBerdiri);
        kerajaan.setRajaTerkenal(rajaTerkenal);
        kerajaan.setPeninggalanSejarah(peninggalanSejarah);
        return kerajaanRepository.save(kerajaan);
    }

    // menghapus data
    @Override
    public void deleteKerajaanById(Long id){
        kerajaanRepository.deleteById(id);
    }
}

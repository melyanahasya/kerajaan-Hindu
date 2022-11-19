package com.Kerajaan.hindu.controller;

import com.Kerajaan.hindu.model.Kerajaan;
import com.Kerajaan.hindu.service.KerajaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/kerajaan")
public class KerajaanController {

  @Autowired
    private KerajaanService kerajaanService;

  // mengakses method menggunakan Post
    @PostMapping
    public Kerajaan addKerajaan(@RequestBody Kerajaan kerajaan)
    {
        return kerajaanService.addKerajaan(kerajaan);
    }

    // untuk mengambil data sesuai id
  @GetMapping("/{id}")
  public Kerajaan getKerajaanById(@PathVariable("id") Long id) {
    return kerajaanService.getKerajaanById(id);
  }

  // untuk merubah data
  @PutMapping("/{id}")
  public Kerajaan editKerajaanById(@PathVariable("id") Long id, @RequestBody Kerajaan kerajaan) {
    return kerajaanService.editKerajaanById(id, kerajaan.getKerajaanHindu(), kerajaan.getLetak(), kerajaan.getTahunBerdiri() ,kerajaan.getRajaTerkenal(), kerajaan.getPeninggalanSejarah());
  }

  // untuk melihat semua data
  @GetMapping("/all")
  public List<Kerajaan> getAllKerajaan() {
    return kerajaanService.getAllKerajaan();
  }

 // untuk menghapus data
  @DeleteMapping("/{id}")
  public void deleteKerajaanById(@PathVariable("id") Long id) {
    kerajaanService.deleteKerajaanById(id);
 }
}

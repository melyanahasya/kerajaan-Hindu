package com.Kerajaan.hindu.repository;

import com.Kerajaan.hindu.model.Kerajaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KerajaanRepository extends JpaRepository<Kerajaan, Long> {
}

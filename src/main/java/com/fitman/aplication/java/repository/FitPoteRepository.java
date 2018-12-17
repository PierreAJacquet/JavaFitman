package com.fitman.aplication.java.repository;

import com.fitman.aplication.java.model.FitPote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FitPoteRepository extends PagingAndSortingRepository<FitPote, Long> {
    FitPote findById (Long id);

    List<FitPote> findByNom (String nom);

    Page<FitPote> findByNom (String nom, Pageable pageable);

    void save(Long sarko);

}

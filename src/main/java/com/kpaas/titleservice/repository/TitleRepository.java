package com.kpaas.titleservice.repository;

import com.kpaas.titleservice.model.TitleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TitleRepository extends JpaRepository<TitleEntity, Long> {
    Optional<TitleEntity> findById(Long id);
}

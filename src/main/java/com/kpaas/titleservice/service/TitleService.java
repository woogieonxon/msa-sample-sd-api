package com.kpaas.titleservice.service;

import com.kpaas.titleservice.model.TitleEntity;
import com.kpaas.titleservice.repository.TitleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TitleService {
    private final TitleRepository titleRepository;

    public TitleService(TitleRepository titleRepository) { this.titleRepository = titleRepository; }
    public Optional<TitleEntity> getTitleByNo(Long id) { return titleRepository.findById(id); }
}

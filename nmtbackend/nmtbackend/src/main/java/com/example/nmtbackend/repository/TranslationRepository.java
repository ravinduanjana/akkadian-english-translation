package com.example.nmtbackend.repository;

import com.example.nmtbackend.model.Translation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TranslationRepository extends MongoRepository<Translation, String> {
    // Basic Save/Find methods are automatically included!
}
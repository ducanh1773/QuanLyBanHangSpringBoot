package com.example.demo.services;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    void store(MultipartFile file);
}

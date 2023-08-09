package com.example.spring_file_upload;

import com.example.spring_file_upload.service.FileStorageService;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFileUploadApplication  implements CommandLineRunner {
    @Resource
    FileStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(SpringFileUploadApplication.class, args);
    }

    @Override
    public void run(String... args) {
        storageService.init();
    }
}

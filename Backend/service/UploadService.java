package com.povosindigenas.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

@Service
public class UploadService {

    private final String pastaUpload = "uploads/";

    public String uploadImagem(MultipartFile file) throws IOException {

        String nomeArquivo = UUID.randomUUID() + "_" + file.getOriginalFilename();

        Path caminho = Paths.get(pastaUpload + nomeArquivo);

        Files.createDirectories(caminho.getParent());

        Files.copy(file.getInputStream(), caminho, StandardCopyOption.REPLACE_EXISTING);

        return "/uploads/" + nomeArquivo;

    }

}
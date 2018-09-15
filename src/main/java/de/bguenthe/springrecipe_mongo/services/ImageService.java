package de.bguenthe.springrecipe_mongo.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(String id, MultipartFile multipartFile);

    byte[] getImageFile(String id);

    byte[] getImageFile(String id, String imageName);
}
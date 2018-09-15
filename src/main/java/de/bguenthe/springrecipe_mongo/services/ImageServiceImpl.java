package de.bguenthe.springrecipe_mongo.services;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import de.bguenthe.springrecipe_mongo.domain.Recipe;
import de.bguenthe.springrecipe_mongo.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@Slf4j
public class ImageServiceImpl implements ImageService {
    @Autowired
    GridFsTemplate gridFsTemplate;

    @Autowired
    GridFsOperations gridOperations;

    RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void saveImageFile(String id, MultipartFile multipartFile) {
        Recipe detachedRecipe = recipeRepository.findById(id).get();
        try {
            String blobid = gridFsTemplate.store(multipartFile.getInputStream(), multipartFile.getOriginalFilename()).toString();
            detachedRecipe.setImage(blobid);

            Recipe savesRecipe = recipeRepository.save(detachedRecipe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] getImageFile(String id, String imageName) {
        Recipe detachedRecipe = recipeRepository.findById(id).get();
        String l = detachedRecipe.getImage();

        try {
            GridFSFile image1 = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(l)));

            Byte[] image = new Byte[(int) image1.getLength()];

            int i = 0;

            try {
                for (byte b : image1.getBytes()) {
                    image[i++] = b;
                }

                Recipe savesRecipe = recipeRepository.save(detachedRecipe);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

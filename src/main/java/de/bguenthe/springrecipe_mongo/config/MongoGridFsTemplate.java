package de.bguenthe.springrecipe_mongo.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;


@Configuration
public class MongoGridFsTemplate extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.host}")
    private String mongoAddress;

    @Value("${spring.data.mongodb.database}")
    private String mongoDatabase;

    @Bean
    public GridFsTemplate gridFsTemplate() throws Exception {
        return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
    }

    @Override
    protected String getDatabaseName() {
        return mongoDatabase;
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(mongoAddress);
    }
}
package org.ebook;

import org.ebook.entity.User;
import org.ebook.entity.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbookApplication {

    public static void main(String[] args) {
        try{
            ClassLoader.getSystemClassLoader().loadClass("org.ebook.DatabaseAdapter");
        }catch(Exception e){
            e.printStackTrace();
        }
        SpringApplication.run(EbookApplication.class, args);
    }

}

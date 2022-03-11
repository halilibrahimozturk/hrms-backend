package com.halilibrahim.hrms.core.concretes;

import com.cloudinary.utils.ObjectUtils;
import com.halilibrahim.hrms.core.abstracts.CloudinaryService;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Cv;
import com.cloudinary.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
@Service
public class CloudinaryManager implements CloudinaryService {


    Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "mavinci-bili-im",
            "api_key", "431973915748429",
            "api_secret", "jGOkAqv_9WbvEmNF2K04FJ1GnJM"));




    @Override
    public Result uploadImage(Cv cv) {

        try {

            cloudinary.uploader().upload(new File("C:\\Users\\halilibrahim.ozturk\\Downloads\\Olympic_flag.jpg"),
                    ObjectUtils.asMap("public_id", "olympic_flag"));







        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
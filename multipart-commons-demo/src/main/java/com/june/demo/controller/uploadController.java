package com.june.demo.controller;

import com.june.demo.util.FastDfsUtils;
import com.june.demo.util.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 文件上传
 *
 * @author junelee
 * @date 2020/1/13 11:06
 */
@Controller
public class uploadController {

    @Value("${fastdfs-domain}")
    private String domain;

    @GetMapping("/toMyLogin")
    public String toMyLogin(){
        return "mylogin";
    }

    @PostMapping("/uploadFile1")
    public String updloadFile1(MultipartFile file, String name, HttpSession session){
        System.out.println(file);
        //System.out.println(name);
        String fileName = null;
        //文件上传
        try {
            //fileName虚拟机的地址
            fileName = FastDfsUtils.upload(file.getBytes(), FileUtils.getFileSuffix(file.getOriginalFilename()));
            System.out.println(domain + fileName);
            session.setAttribute("MyGirlFriend",domain+fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "mypic";
    }

}

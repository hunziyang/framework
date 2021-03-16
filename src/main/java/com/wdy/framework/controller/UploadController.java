package com.wdy.framework.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public void upload(MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        File f = new File("E:/upload/" + file.getOriginalFilename());
        if (!f.getParentFile().exists()) {
            try {
                FileUtils.forceMkdir(f.getParentFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            file.transferTo(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response) {
        File file = new File("F:/test.txt");
        try {
            response.setHeader("Content-Disposition", "attachment; filename="+ URLEncoder.encode(file.getName(),"UTF-8"));
            response.addHeader("Content-Length", "" + file.length());
            response.setContentType("application/octet-stream");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            byte[] bytes = new byte[1024 * 1024];
            ServletOutputStream outputStream = response.getOutputStream();
            int num =-1;
            while ((num=in.read(bytes))!=-1){
                outputStream.write(bytes,0,num);
                outputStream.flush();
            }
            outputStream.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

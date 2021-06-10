package com.example.demo.shiyan;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class shiyanshangchuang {
    @RequestMapping("/test")
    @ResponseBody
    public String test(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        String name = file.getOriginalFilename();
        String fileName = file.getOriginalFilename();
        return "上传成功";
    }
//    @RequestParam("file")
}

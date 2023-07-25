package com.example.spring_boot_api_jwt_ad.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadImgController {

    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        // Xử lý tệp tin được tải lên ở đây
        // Ví dụ: Lưu tệp tin vào thư mục upload

        // Trả về thông báo thành công
        return "Tệp tin đã được tải lên thành công";
    }
}

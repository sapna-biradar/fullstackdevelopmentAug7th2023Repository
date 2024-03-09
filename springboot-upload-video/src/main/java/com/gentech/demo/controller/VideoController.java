package com.gentech.demo.controller;

import java.util.ArrayList;     
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsV2Result;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:3000/")
public class VideoController {

    @Autowired
    private AmazonS3 amazonS3; 

    @Value("${aws.s3.bucket}")
    private String bucketName;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadVideo(@RequestParam("file") MultipartFile file) {
        try {
            amazonS3.putObject(bucketName, file.getOriginalFilename(), file.getInputStream(), null);
            return ResponseEntity.ok("Video uploaded successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload video");
        }
    }
    
    @GetMapping("/videos")
    public ResponseEntity<List<String>> getAllVideos() {
        List<String> videos = new ArrayList<>();
        
        try {
            ListObjectsV2Result result = amazonS3.listObjectsV2(bucketName);
            result.getObjectSummaries().forEach(object -> videos.add(object.getKey()));
            return ResponseEntity.ok(videos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
}


package com.data.java_service_session13.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.data.java_service_session13.model.dto.ProductDTO;
import com.data.java_service_session13.model.dto.response.APIResponse;
import com.data.java_service_session13.model.entity.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok("Danh sách sản phẩm");
    }

    @PostMapping("/api/admin/products")
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto) {
        return ResponseEntity.ok("Tạo sản phẩm thành công");
    }

    @PutMapping("/api/admin/products/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody ProductDTO dto) {
        return ResponseEntity.ok("Cập nhật sản phẩm " + id);
    }

    @DeleteMapping("/api/admin/products/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.ok("Đã xóa sản phẩm " + id);
    }
}


package com.vista.astee.controller;

import com.vista.astee.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("users")
public class UserController {
    public final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<Object> getUserInfo(@PathVariable Long userId) {
        try{
            return ResponseEntity.ok().body(userService.getUserInfo(userId));
        } catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().body("internal server error");
        }
    }
}

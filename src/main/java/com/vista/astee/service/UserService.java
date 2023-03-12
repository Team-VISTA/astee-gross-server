package com.vista.astee.service;

import com.vista.astee.controller.dto.ResDto;
import com.vista.astee.domain.user.User;
import com.vista.astee.domain.user.UserRepository;
import com.vista.astee.utils.ErrorMessageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public ResDto getUserInfo(Long userId) {
        try {
            User user = userRepository.findUserByUserId(userId);
            if (user == null) {
                return ResDto.builder()
                        .resultCode(404)
                        .errorMessage(ErrorMessageUtil.INVALID_USER)
                        .document("Error")
                        .build();
            }
            return ResDto.builder()
                    .resultCode(200)
                    .errorMessage(ErrorMessageUtil.SUCCESS)
                    .document(user)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResDto.builder()
                    .resultCode(400)
                    .errorMessage(ErrorMessageUtil.NOT_FOUND)
                    .document(null)
                    .build();
        }
    }
}

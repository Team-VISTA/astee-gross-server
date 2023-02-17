package com.vista.astee.service;

import com.vista.astee.domain.dto.ResDto;
import com.vista.astee.domain.dto.user.UserResponseDto;
import com.vista.astee.domain.user.User;
import com.vista.astee.domain.user.UserRepository;
import com.vista.astee.util.ErrorMessageUtil;
import lombok.RequiredArgsConstructor;
import org.bson.codecs.ObjectIdGenerator;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.aggregation.ConvertOperators;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public ResDto getUserInfo(String userId) {
        try {
            User user = userRepository.findUserById(userId);
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

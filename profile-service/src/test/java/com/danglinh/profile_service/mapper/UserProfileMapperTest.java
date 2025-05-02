package com.danglinh.profile_service.mapper;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import com.danglinh.profile_service.dto.request.UserProfileCreationReq;
import com.danglinh.profile_service.entity.UserProfile;

public class UserProfileMapperTest {

    // Dùng factory của MapStruct để tạo instance mapper (bỏ qua Spring)
    private final UserProfileMapper mapper = Mappers.getMapper(UserProfileMapper.class);

    @Test
    void testToUserProfile() {
        // Tạo DTO test
        UserProfileCreationReq req = UserProfileCreationReq.builder()
                .userId("abc123")
                .firstName("Linh")
                .lastName("Dang")
                .dob(LocalDate.of(2000, 5, 20))
                .city("Hanoi")
                .build();

        // Gọi mapper
        UserProfile entity = mapper.toUserProfile(req);

        // In ra để xem
        System.out.println("=== ENTITY: " + entity);

        // Kiểm tra từng field
        assertNotNull(entity);
        assertEquals("abc123", entity.getUserId());
        assertEquals("Linh", entity.getFirstName());
        assertEquals("Dang", entity.getLastName());
        assertEquals(LocalDate.of(2000, 5, 20), entity.getDob());
        assertEquals("Hanoi", entity.getCity());
    }
}

package com.TrackYourGains.tracker.mapper;

import com.TrackYourGains.tracker.dto.UserDto;
import com.TrackYourGains.tracker.entity.User;

public class UserMapper {

    public static User mapToUser(UserDto userDto)
    {
        User u = new User();
        u.setFirstName(userDto.getFirstName());
        u.setLastName(userDto.getLastName());
        u.setHeight(userDto.getHeight());
        u.setWeight(userDto.getWeight());
        return u;
    }

    public static UserDto mapToUserDto(User user)
    {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setHeight(user.getHeight());
        dto.setWeight(user.getWeight());
        return dto;
    }
}

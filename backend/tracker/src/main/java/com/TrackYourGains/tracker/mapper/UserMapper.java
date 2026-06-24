package com.TrackYourGains.tracker.mapper;

import com.TrackYourGains.tracker.dto.UserDto;
import com.TrackYourGains.tracker.entity.User;

public class UserMapper {

    /**
     * Maps the user dto to an actual user object
     * @param userDto details of user
     * @return wrapped user object
     */
    public static User mapToUser(UserDto userDto)
    {
        User u = new User();
        u.setFirstName(userDto.getFirstName());
        u.setLastName(userDto.getLastName());
        u.setHeight(userDto.getHeight());
        u.setWeight(userDto.getWeight());
        return u;
    }

    /**
     * Maps the user object to a userDto
     * @param user details of the user
     * @return wrapped userDto object
     */
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

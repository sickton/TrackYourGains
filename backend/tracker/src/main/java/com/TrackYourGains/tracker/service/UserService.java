package com.TrackYourGains.tracker.service;

import com.TrackYourGains.tracker.dto.UserDto;

public interface UserService {

    UserDto addUser(UserDto u);
    void deleteUser(Long id);
    UserDto updateUser(Long id, UserDto userDto);
    UserDto getUserById(Long id);
}

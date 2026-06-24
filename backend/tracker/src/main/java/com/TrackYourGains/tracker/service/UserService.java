package com.TrackYourGains.tracker.service;

import com.TrackYourGains.tracker.dto.UserDto;

public interface UserService {

    /**
     * Method that adds a user to the backend
     * @param userDto details of the user
     * @return details of user when added successfully
     */
    UserDto addUser(UserDto userDto);

    /**
     * Method to delete a user by ID
     * @param id ID of the user in the database
     */
    void deleteUser(Long id);

    /**
     * Method to update the user details
     * @param id ID of the user in the database
     * @param userDto updated user details
     * @return updated user details
     */
    UserDto updateUser(Long id, UserDto userDto);

    /**
     * Method to find the user by ID
     * @param id ID of the user in database
     * @return user details
     */
    UserDto getUserById(Long id);
}

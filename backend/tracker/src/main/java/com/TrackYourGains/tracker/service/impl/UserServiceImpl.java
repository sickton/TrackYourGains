package com.TrackYourGains.tracker.service.impl;

import com.TrackYourGains.tracker.dto.UserDto;
import com.TrackYourGains.tracker.entity.User;
import com.TrackYourGains.tracker.mapper.UserMapper;
import com.TrackYourGains.tracker.repository.UserRepository;
import com.TrackYourGains.tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Method that adds a user to the backend
     * @param userDto details of the user
     * @return details of user when added successfully
     */
    @Override
    public UserDto addUser(UserDto userDto) {
        User u = UserMapper.mapToUser(userDto);
        User user = userRepository.save(u);
        return UserMapper.mapToUserDto(user);
    }

    /**
     * Method to delete a user by ID
     * @param id ID of the user in the database
     */
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    /**
     * Method to update the user details
     * @param id ID of the user in the database
     * @param userDto updated user details
     * @return updated user details
     */
    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            throw new RuntimeException("User not found!");
        else
        {
            User u = user.get();
            u.setFirstName(userDto.getFirstName());
            u.setLastName(userDto.getLastName());
            u.setWeight(userDto.getWeight());
            u.setHeight(userDto.getHeight());
            return UserMapper.mapToUserDto(userRepository.save(u));
        }
    }

    /**
     * Method to find the user by ID
     * @param id ID of the user in database
     * @return user details
     */
    @Override
    public UserDto getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty())
            throw new RuntimeException("User not found!");
        else
            return UserMapper.mapToUserDto(user.get());
    }
}

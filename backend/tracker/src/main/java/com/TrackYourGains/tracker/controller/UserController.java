package com.TrackYourGains.tracker.controller;

import com.TrackYourGains.tracker.dto.UserDto;
import com.TrackYourGains.tracker.repository.UserRepository;
import com.TrackYourGains.tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    /**
     * Endpoint that returns a user detail
     * @param id id of the user in database
     * @return user details
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserByID(@PathVariable Long id)
    {
        UserDto user = userService.getUserById(id);
        if(user == null)
            return new ResponseEntity("User not found", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(user);
    }

    /**
     * Endpoint that creates a new user in the backend
     * @param userDto user details
     * @return user details on successful addition
     */
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
    {
        if(!userRepository.existsByFirstNameAndLastName(userDto.getFirstName(), userDto.getLastName()))
            return new ResponseEntity("User does not exist", HttpStatus.BAD_REQUEST);
        UserDto user = userService.addUser(userDto);
        return ResponseEntity.ok(user);
    }

    /**
     * Endpoint that updates an existing user details
     * @param id id of the user in the database
     * @param userDto details of the updated user
     * @return updated user details
     */
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUserDetails(@PathVariable Long id, @RequestBody UserDto userDto)
    {
        if(!userRepository.existsById(id))
            return new ResponseEntity("User does not exist", HttpStatus.BAD_REQUEST);
        UserDto user = userService.updateUser(id, userDto);
        return ResponseEntity.ok(user);
    }

    /**
     * Endpoint to delete a user from the backend
     * @param id id of the user in the database
     * @return deletion success message
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id)
    {
        if(!userRepository.existsById(id))
            return new ResponseEntity("User does not exist",  HttpStatus.BAD_REQUEST);
        userService.deleteUser(id);
        return ResponseEntity.ok("Deleted user successfully!");
    }
}

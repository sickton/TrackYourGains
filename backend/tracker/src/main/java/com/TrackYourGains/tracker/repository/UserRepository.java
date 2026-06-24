package com.TrackYourGains.tracker.repository;

import com.TrackYourGains.tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Method that queries user based on first and last name
     * @param firstName first name of the user
     * @param lastName last name of the user
     * @return User if found
     */
    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

    /**
     * Method that queries whether a user exists in the database
     * @param firstName first name of the user
     * @param lastName last name of the user
     * @return true if user exists
     */
    boolean existsByFirstNameAndLastName(String firstName, String lastName);
}

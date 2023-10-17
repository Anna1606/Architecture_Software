package ru.alina_corp.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina_corp.model.User;
import ru.alina_corp.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getById(Long id) {
        return userRepository.getById(id);
    }

    public User create(String username, String password, String phoneNumber, String description, byte[] profileImage) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setDescription(description);
        user.setProfileImage(profileImage);
        return userRepository.save(user);
    }

    public User update(User user) {
        User userFromDb = userRepository.getById(user.getId());
        userFromDb.setUsername(user.getUsername());
        userFromDb.setPassword(user.getPassword());
        userFromDb.setPhoneNumber(user.getPhoneNumber());
        userFromDb.setDescription(user.getDescription());
        userFromDb.setProfileImage(user.getProfileImage());
        return userRepository.save(userFromDb);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

}

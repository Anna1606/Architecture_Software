package ru.alina_corp.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.alina_corp.model.User;
import ru.alina_corp.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
@Api(tags = {"Пользователи"})
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UserController {
    private final UserService userService;

    @ApiOperation("Получить пользователя по Id")
    @GetMapping("/{userId}")
    public User getUserById(
            @PathVariable Long userId
    ) {
        return userService.getById(userId);
    }

    @ApiOperation("Создать пользователя")
    @PostMapping()
    public User create(@RequestParam String username,
                       @RequestParam String password,
                       @RequestParam String phoneNumber,
                       @RequestParam String description,
                       @RequestParam byte[] profileImage) {
        return userService.create(username, password, phoneNumber, description, profileImage);
    }

    @ApiOperation("Изменить пользователя")
    @PostMapping()
    public User update(
            @RequestParam User user) {
        return userService.update(user);
    }

    @ApiOperation("Удалить пользователя")
    @DeleteMapping()
    public void delete(
            @RequestParam User user) {
        userService.delete(user);
    }
}

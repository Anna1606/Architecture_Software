package ru.alina_corp.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.alina_corp.model.Contact;
import ru.alina_corp.services.ContactService;

@RestController
@RequestMapping("/api/v1/contacts")
@AllArgsConstructor
@Api(tags = {"Контакты"})
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ContactController {
    private final ContactService contactService;

    @ApiOperation("Получить контакт по Id")
    @GetMapping("/{contactId}")
    public Contact getUserById(
            @PathVariable Long contactId
    ) {
        return contactService.getById(contactId);
    }

    @ApiOperation("Создать контакт")
    @PostMapping()
    public Contact create(@RequestParam Long userOwnerId,
                          @RequestParam Long userId) {
        return contactService.create(userOwnerId, userId);
    }

    @ApiOperation("Удалить контакт")
    @DeleteMapping()
    public void delete(
            @RequestParam Contact contact) {
        contactService.delete(contact);
    }
}

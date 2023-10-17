package ru.alina_corp.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.alina_corp.model.Message;
import ru.alina_corp.services.MessageService;

@RestController
@RequestMapping("/api/v1/messages")
@AllArgsConstructor
@Api(tags = {"Сообщения"})
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class MessageController {
    private final MessageService messageService;

    @ApiOperation("Получить сообщение по Id")
    @GetMapping("/{messageId}")
    public Message getUserById(
            @PathVariable Long messageId
    ) {
        return messageService.getById(messageId);
    }

    @ApiOperation("Создать сообщение")
    @PostMapping()
    public Message create(@RequestParam Long userId,
                          @RequestParam Long chatId,
                          @RequestParam String text) {
        return messageService.create(text, userId, chatId);
    }

    @ApiOperation("Изменить сообщение")
    @PostMapping()
    public Message update(
            @RequestParam Message message) {
        return messageService.update(message);
    }

    @ApiOperation("Удалить сообщение")
    @DeleteMapping()
    public void delete(
            @RequestParam Message message) {
        messageService.delete(message);
    }
}

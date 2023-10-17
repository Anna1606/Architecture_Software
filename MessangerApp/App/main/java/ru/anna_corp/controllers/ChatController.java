package ru.alina_corp.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.alina_corp.model.Chat;
import ru.alina_corp.services.ChatService;

@RestController
@RequestMapping("/api/v1/chats")
@AllArgsConstructor
@Api(tags = {"Чаты"})
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChatController {
    private final ChatService chatService;

    @ApiOperation("Получить чат по Id")
    @GetMapping("/{chatId}")
    public Chat getChatById(
            @PathVariable Long chatId
    ) {
        return chatService.getById(chatId);
    }

    @ApiOperation("Создать чат")
    @PostMapping()
    public Chat create(
            @RequestParam String chatName) {
        return chatService.create(chatName);
    }

    @ApiOperation("Изменить чат")
    @PostMapping()
    public Chat update(
            @RequestParam Chat chat) {
        return chatService.update(chat);
    }

    @ApiOperation("Удалить чат")
    @DeleteMapping()
    public void delete(
            @RequestParam Chat chat) {
        chatService.delete(chat);
    }
}

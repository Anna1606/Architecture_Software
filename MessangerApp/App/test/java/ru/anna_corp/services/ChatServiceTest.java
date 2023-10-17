package ru.alina_corp.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.alina_corp.model.Chat;
import ru.alina_corp.repository.ChatRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class ChatServiceTest {

    @Mock
    private ChatRepository chatRepository;

    @InjectMocks
    private ChatService chatService;

    private static final Long CHAT_ID = 1L;
    private static final String CHAT_NAME = "TEST_CHAT";

    @Test
    void getById() {
        Chat chat = new Chat();
        chat.setId(CHAT_ID);
        chat.setChatName(CHAT_NAME);
        when(chatRepository.getById(CHAT_ID)).thenReturn(chat);
        Chat response = chatService.getById(1L);
        assertEquals(CHAT_ID, response.getId());
        verify(chatRepository, times(1)).getById(CHAT_ID);

    }

    @Test
    void create() {
        Chat chat = new Chat();
        chat.setId(CHAT_ID);
        chat.setChatName(CHAT_NAME);
        when(chatRepository.save(any())).thenReturn(chat);
        Chat response = chatService.create(CHAT_NAME);
        assertEquals(CHAT_ID, response.getId());
        assertEquals(CHAT_NAME, response.getChatName());
        verify(chatRepository, times(1)).save(any());
    }

    @Test
    void update() {
        Chat chat = new Chat();
        chat.setId(CHAT_ID);
        chat.setChatName(CHAT_NAME);
        when(chatRepository.getById(CHAT_ID)).thenReturn(chat);
        when(chatRepository.save(chat)).thenReturn(chat);
        Chat response = chatService.update(chat);
        assertEquals(CHAT_ID, response.getId());
        assertEquals(CHAT_NAME, response.getChatName());
        verify(chatRepository, times(1)).getById(CHAT_ID);
        verify(chatRepository, times(1)).save(eq(chat));
    }

    @Test
    void delete() {
        Chat chat = new Chat();
        chat.setId(CHAT_ID);
        chat.setChatName(CHAT_NAME);
        chatService.delete(chat);
        verify(chatRepository, times(1)).delete(chat);
    }
}
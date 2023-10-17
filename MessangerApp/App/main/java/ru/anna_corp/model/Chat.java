package ru.alina_corp.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "chat_name")
    private String chatName;

    @ManyToMany(mappedBy = "chats")
    private Set<User> users = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "chat")
    private List<Message> messages;
}

package ru.alina_corp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_owner_id")
    private long userOwnerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_owner_id", insertable = false, updatable = false)
    private User userOwner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "userId")
    private User user;
}


package com.linkedin.users_service.entity;

import com.linkedin.users_service.enums.UserFileType;
import jakarta.persistence.*;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Table()
@Entity

public class UserFiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserFileType type;

    @Column(nullable = false)
    private String link;
}

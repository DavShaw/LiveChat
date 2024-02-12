package org.davshaw.livechat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "password", updatable = true, nullable = false)
    private String password;

    @Column(name = "email", updatable = true, nullable = false)
    private String email;

    @Column(name = "name", updatable = true, nullable = false)
    private String name;

    @Column(name = "created", updatable = false, nullable = false)
    @CreatedDate
    private LocalDateTime created;

    @Column(name = "updated", updatable = true, nullable = true)
    @LastModifiedDate
    private LocalDateTime updated;
}

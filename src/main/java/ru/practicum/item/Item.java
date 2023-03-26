package ru.practicum.item;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
class Item {
    private Long id;
    private Long userId;
    private String url;
}

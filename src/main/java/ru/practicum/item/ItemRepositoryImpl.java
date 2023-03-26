package ru.practicum.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ItemRepositoryImpl implements ItemRepository{

    private long itemId = 0;
    private final List<Item> items = new ArrayList<>();

    @Override
    public List<Item> findByUserId(long userId) {
       return items.stream()
               .filter(item -> item.getUserId()==userId)
               .collect(Collectors.toList());
    }

    @Override
    public Item save(Item item) {
        itemId++;
        item.setId(itemId);
        items.add(item);
        return item;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        items.stream()
                .filter(item -> item.getUserId()==userId)
                .filter(item -> item.getId()==itemId)
                .forEach(items::remove);
    }
}

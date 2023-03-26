package ru.practicum.item;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-26T12:40:55+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Amazon.com Inc.)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemDto toItemDto(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDto itemDto = new ItemDto();

        itemDto.setId( item.getId() );
        Set<String> set = item.getTags();
        if ( set != null ) {
            itemDto.setTags( new LinkedHashSet<String>( set ) );
        }
        itemDto.setUserId( item.getUserId() );
        itemDto.setUrl( item.getUrl() );

        return itemDto;
    }

    @Override
    public Item toItem(ItemDto itemDto) {
        if ( itemDto == null ) {
            return null;
        }

        Item item = new Item();

        item.setId( itemDto.getId() );
        Set<String> set = itemDto.getTags();
        if ( set != null ) {
            item.setTags( new LinkedHashSet<String>( set ) );
        }
        item.setUserId( itemDto.getUserId() );
        item.setUrl( itemDto.getUrl() );

        return item;
    }
}

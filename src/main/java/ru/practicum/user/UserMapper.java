package ru.practicum.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target="registrationDate", source = "registrationDate",
            dateFormat = "dd-MM-yyyy HH:mm:ss")
    UserDto toUserDto (User user);
    User toUser (UserDto userDto);
}

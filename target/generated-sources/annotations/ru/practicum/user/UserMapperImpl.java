package ru.practicum.user;

import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-26T12:40:56+0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        if ( user.getRegistrationDate() != null ) {
            userDto.setRegistrationDate( user.getRegistrationDate().toString() );
        }
        userDto.setId( user.getId() );
        userDto.setEmail( user.getEmail() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setState( user.getState() );

        return userDto;
    }

    @Override
    public User toUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setEmail( userDto.getEmail() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        if ( userDto.getRegistrationDate() != null ) {
            user.setRegistrationDate( Instant.parse( userDto.getRegistrationDate() ) );
        }
        user.setState( userDto.getState() );

        return user;
    }
}

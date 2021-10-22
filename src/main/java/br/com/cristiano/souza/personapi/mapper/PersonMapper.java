package br.com.cristiano.souza.personapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.cristiano.souza.personapi.dto.request.PersonDTO;
import br.com.cristiano.souza.personapi.entity.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "yyyy-MM-dd")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}

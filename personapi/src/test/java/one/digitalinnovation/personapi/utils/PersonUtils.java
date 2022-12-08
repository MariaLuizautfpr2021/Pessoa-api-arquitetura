package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entities.Person;

import java.time.LocalDate;

public class PersonUtils {

    private static final String FIRST_NAME = "Mylena";
    private static final String LAST_NAME = "Furlan";
    private static final String CPF_NUMBER = "001.002.003-20";
    private static final String END_NAME = "Rua Lala";
    private static final String MUNICIPIO_NAME = "Cocoricó";
    private static final String PESSOA_NAME = "PJ";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2022, 10, 1);

    /**
     * @return
     */
    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-04-2022")
                .end(END_NAME)
                .municipio(MUNICIPIO_NAME)
                .pessoafj(PESSOA_NAME)

                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .end(END_NAME)
                .municipio(MUNICIPIO_NAME)
                .pessoafj(PESSOA_NAME)
                .build();
    }
}

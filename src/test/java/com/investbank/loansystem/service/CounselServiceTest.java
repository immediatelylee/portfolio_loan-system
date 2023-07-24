package com.investbank.loansystem.service;

import com.investbank.loansystem.domain.Counsel;
import com.investbank.loansystem.dto.CounselDTO.Request;
import com.investbank.loansystem.dto.CounselDTO.Response;
import com.investbank.loansystem.repository.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.modelmapper.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CounselServiceTest {

    @InjectMocks
    CounselServiceImpl counselService;

    @Mock
    private CounselRepository counselRepository;

    @Spy
    private ModelMapper modelMapper;

    @Test
    void Should_ReturnResponseOfNewCounselEntity_When_RequestCounsel() {
        Counsel entity = Counsel.builder()
                .name("Member Kim")
                .cellPhone("010-1111-2222")
                .email("mail@abc.de")
                .memo("I hope to get a loan")
                .zipCode("123456")
                .address("Somewhere in Gangnam-gu, Seoul")
                .addressDetail("What Apartment No. 101, 1st floor No. 101")
                .build();

        Request request = Request.builder()
                .name("Member Kim")
                .cellPhone("010-1111-2222")
                .email("mail@abc.de")
                .memo("I hope to get a loan")
                .zipCode("123456")
                .address("Somewhere in Gangnam-gu, Seoul")
                .addressDetail("What Apartment No. 101, 1st floor No. 101")
                .build();

        when(counselRepository.save(ArgumentMatchers.any(Counsel.class))).thenReturn(entity);

        Response actual = counselService.create(request);

        assertThat(actual.getName()).isSameAs(entity.getName());
    }

}
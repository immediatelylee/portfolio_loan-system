package com.investbank.loansystem.service;

import com.investbank.loansystem.domain.*;
import com.investbank.loansystem.repository.*;
import com.investbank.loansystem.dto.ApplicationDTO.Request;
import com.investbank.loansystem.dto.ApplicationDTO.Response;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

import java.time.*;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    private final ModelMapper modelMapper;

    @Override
    public Response create(Request request) {
        Application application = modelMapper.map(request, Application.class);
        application.setAppliedAt(LocalDateTime.now());

        Application applied = applicationRepository.save(application);

        return modelMapper.map(applied, Response.class);
    }
}

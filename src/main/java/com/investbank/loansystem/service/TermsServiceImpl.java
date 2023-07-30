package com.investbank.loansystem.service;

import java.util.List;
import java.util.stream.Collectors;

import com.investbank.loansystem.domain.*;
import com.investbank.loansystem.dto.TermsDTO.Request;
import com.investbank.loansystem.dto.TermsDTO.Response;
import com.investbank.loansystem.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TermsServiceImpl implements TermsService {

    private final TermsRepository termsRepository;

    private final ModelMapper modelMapper;

    @Override
    public Response create(Request request) {
        Terms terms = modelMapper.map(request, Terms.class);
        Terms created = termsRepository.save(terms);

        return modelMapper.map(created, Response.class);
    }

}

package com.investbank.loansystem.service;

import com.investbank.loansystem.domain.*;
import com.investbank.loansystem.dto.CounselDTO.Response;
import com.investbank.loansystem.dto.CounselDTO.Request;
import com.investbank.loansystem.repository.*;
import lombok.*;
import org.modelmapper.*;
import org.springframework.stereotype.*;

import java.time.*;

@Service
@RequiredArgsConstructor
public class CounselServiceImpl implements CounselService{

    private final CounselRepository counselRepository;

    private final ModelMapper modelMapper;

    @Override
    public Response create(Request request){
        Counsel counsel = modelMapper.map(request,Counsel.class);
        counsel.setAppliedAt(LocalDateTime.now());

        Counsel created = counselRepository.save(counsel);

        return modelMapper.map(created,Response.class);
    }

}

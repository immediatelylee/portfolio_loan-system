package com.investbank.loansystem.service;


import com.investbank.loansystem.dto.CounselDTO.Response;
import com.investbank.loansystem.dto.CounselDTO.Request;

public interface CounselService {

    Response create(Request request);

    Response get(Long counselId);
}

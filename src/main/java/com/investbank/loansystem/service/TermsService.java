package com.investbank.loansystem.service;

import java.util.List;
import com.investbank.loansystem.dto.TermsDTO.Response;
import com.investbank.loansystem.dto.TermsDTO.Request;

public interface TermsService {

    Response create(Request request);

    List<Response> getAll();
}

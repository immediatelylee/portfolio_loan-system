package com.investbank.loansystem.controller;

import com.investbank.loansystem.dto.*;
import com.investbank.loansystem.dto.TermsDTO.Request;
import com.investbank.loansystem.dto.TermsDTO.Response;
import com.investbank.loansystem.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/terms")
public class TermsController extends AbstractController {

    private final TermsService termsService;

    @PostMapping
    public ResponseDTO<Response> create(@RequestBody Request request) {
        return ok(termsService.create(request));
    }


}

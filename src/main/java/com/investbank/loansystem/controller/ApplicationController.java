package com.investbank.loansystem.controller;

import com.investbank.loansystem.dto.*;
import com.investbank.loansystem.dto.ApplicationDTO.Request;
import com.investbank.loansystem.dto.ApplicationDTO.Response;
import com.investbank.loansystem.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/applications")
public class ApplicationController extends AbstractController {

    private final ApplicationService applicationService;

    @PostMapping
    public ResponseDTO<Response> create(@RequestBody Request request) {
        return ok(applicationService.create(request));
    }

    @GetMapping("/{applicationId}")
    public ResponseDTO<Response> get(@PathVariable Long applicationId) {
        return ok(applicationService.get(applicationId));
    }
}

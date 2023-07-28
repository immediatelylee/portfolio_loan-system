package com.investbank.loansystem.controller;

import com.investbank.loansystem.dto.*;
import com.investbank.loansystem.dto.CounselDTO.Request;
import com.investbank.loansystem.dto.CounselDTO.Response;
import com.investbank.loansystem.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/counsels")
public class CounselController extends AbstractController {

    private final CounselService counselService;

    @PostMapping
    public ResponseDTO<Response> create(@RequestBody Request request) {
        return ok(counselService.create(request));
    }

    @GetMapping("/{counselId}")
    public ResponseDTO<Response> get(@PathVariable Long counselId) {
        return ok(counselService.get(counselId));
    }

    @PutMapping("/{counselId}")
    public ResponseDTO<Response> update(@PathVariable Long counselId, @RequestBody Request request) {
        return ok(counselService.update(counselId, request));
    } // TODO: 어느 곳에서는 특정한 이유로 PutMapping 자체를 인정하지 않고 PostMapping만 인정하기도 한다 수정할지 여부를 좀더 공부하고 개선할지 결정할것

    @DeleteMapping("/{counselId}")
    public ResponseDTO<Void> delete(@PathVariable Long counselId) {
        counselService.delete(counselId);
        return ok();
    }
}


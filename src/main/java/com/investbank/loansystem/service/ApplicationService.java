package com.investbank.loansystem.service;
import com.investbank.loansystem.dto.ApplicationDTO.Response;
import com.investbank.loansystem.dto.ApplicationDTO.Request;

public interface ApplicationService {
    // TODO: Response, Request을 파일명을 통해 유추할수 있지만 import를 보지 않으면 ApplicationDTO 의 Response임을 인지 하지 못할 수 있다.
    // TODO: Counsel_Response같은 형식으로 가독성을 넣을지 아니면 파일명을 통해 유추하게 할지는 고민해봐야 할것같다.
    Response create(Request request);
}

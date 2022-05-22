package com.example.soaptryout.endpoint;

import com.example.soaptryout.DenemeRequest;
import com.example.soaptryout.DenemeResponse;
import com.example.soaptryout.service.MySoapService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@RequiredArgsConstructor
@Endpoint
public class MyEndPoints {

    private static final String NAMESPACE_URI = "http://www.firatdemircan.com/tmo-bim";
    private final MySoapService mySoapService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "denemeRequest")
    @ResponsePayload
    public DenemeResponse getPerson(@RequestPayload DenemeRequest request) {
        DenemeResponse response = new DenemeResponse();
        request.getId();

        DenemeResponse denemeResponse = mySoapService.denemeResponse(request.getId());
        return denemeResponse;
    }
}

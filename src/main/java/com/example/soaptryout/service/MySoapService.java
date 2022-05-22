package com.example.soaptryout.service;

import com.example.soaptryout.DenemeResponse;
import com.example.soaptryout.Obje;
import com.example.soaptryout.ObjectFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MySoapService {


    public DenemeResponse denemeResponse(int id){

        ObjectFactory objectFactory = new ObjectFactory();
        DenemeResponse denemeResponse = objectFactory.createDenemeResponse();
        Obje obje = objectFactory.createObje();

        obje.setAnaAdi("Yıldız");
        obje.setBabaAdi("Abdulkadir");
        denemeResponse.setAdi("Fırat");
        denemeResponse.setObje(obje);

        return denemeResponse;
    }

}

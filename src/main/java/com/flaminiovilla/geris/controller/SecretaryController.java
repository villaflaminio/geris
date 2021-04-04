package com.flaminiovilla.geris.controller;

import com.flaminiovilla.geris.controller.dto.SecretaryDTO;
import com.flaminiovilla.geris.model.Secretary;
import com.flaminiovilla.geris.service.SecretaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/secretary")
public class SecretaryController {

    @Autowired
    private SecretaryServiceImpl secretaryService;

    @GetMapping("/findAll")
    List<Secretary> findAll(){
        return secretaryService.findAll();
    }
}

package com.ironhack.finalprojectloggingservice.controller;

import com.ironhack.finalprojectloggingservice.model.Log;
import com.ironhack.finalprojectloggingservice.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    LogService logService;

    @PostMapping("/logging/post_log")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void postLog(@RequestBody Log log) {
        logService.postLog(log);
    }
}

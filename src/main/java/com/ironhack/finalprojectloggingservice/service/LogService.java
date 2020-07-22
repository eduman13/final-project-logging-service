package com.ironhack.finalprojectloggingservice.service;

import com.ironhack.finalprojectloggingservice.model.Log;
import com.ironhack.finalprojectloggingservice.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void postLog(Log log) {
        logRepository.save(log);
    }
}

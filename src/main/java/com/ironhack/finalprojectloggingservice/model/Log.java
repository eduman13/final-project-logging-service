package com.ironhack.finalprojectloggingservice.model;

import com.ironhack.finalprojectloggingservice.model.enums.StatusLog;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Log {

    private String id;
    private String microservice;
    private String timestamp;
    private StatusLog status;
    private Error error;

    public Log() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMicroservice() {
        return microservice;
    }

    public void setMicroservice(String microservice) {
        this.microservice = microservice;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public StatusLog getStatus() {
        return status;
    }

    public void setStatus(StatusLog status) {
        this.status = status;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}

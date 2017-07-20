package com.shell.starter.repository;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

@Repository
public class JsonRepository {
    public String jsonString(Object src) {
        Gson gson = new Gson();
        return gson.toJson(src);
    }
}

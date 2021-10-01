package com.mkaszynski.javatools.nomaven;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonMapper {
    static <T> T deserialize(String content, Class<T> valueType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, valueType);
    }
}
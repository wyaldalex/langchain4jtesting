package com.tudux.langchain4jtesting.service;

import com.tudux.langchain4jtesting.dto.ChatRequest;
import com.tudux.langchain4jtesting.dto.ChatResponse;

public interface GenAIService {

    String getResponse(ChatRequest request);
    String getResponseSimple(ChatRequest request);
}

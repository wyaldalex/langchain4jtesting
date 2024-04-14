package com.tudux.langchain4jtesting.controller;

import com.tudux.langchain4jtesting.dto.ChatRequest;
import com.tudux.langchain4jtesting.dto.ChatResponse;
import com.tudux.langchain4jtesting.service.GenAIService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class GenerativeController {

    @Autowired
    private GenAIService genAIService;

    @PostMapping
    public ChatResponse getChatResponse(@RequestBody ChatRequest chatRequest){
        log.info("Received chat request ", chatRequest);
        return new ChatResponse(genAIService.getResponse(chatRequest));
    }
}

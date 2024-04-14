package com.tudux.langchain4jtesting.controller;

import com.tudux.langchain4jtesting.dto.ChatRequest;
import com.tudux.langchain4jtesting.dto.ChatResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class GenerativeController {

    @PostMapping
    public ChatResponse getChatResponse(@RequestBody ChatRequest chatRequest){
        return null;
    }
}

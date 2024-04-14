package com.tudux.langchain4jtesting.service;

import com.tudux.langchain4jtesting.dto.ChatRequest;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class GenAIServiceImpl implements GenAIService{
    @Override
    public String getResponse(ChatRequest request) {

       var model =  OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName(OpenAiChatModelName.GPT_3_5_TURBO)
                .build();
        var response = model.generate(request.question());
        log.info("Received Open API response ", response);
        return response;
    }
}

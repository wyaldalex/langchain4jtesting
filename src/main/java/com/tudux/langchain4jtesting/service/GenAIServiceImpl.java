package com.tudux.langchain4jtesting.service;

import com.tudux.langchain4jtesting.dto.ChatRequest;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Slf4j
public class GenAIServiceImpl implements GenAIService{


    private final Assistant assistant;
    private UserContextRetrievalService userContextRetrievalService;
    private static String fullPrompt = """
            User Info:
            %s
            
            User Question:
            %s                        
            """;

    @Override
    public String getResponse(ChatRequest request) {
        int userId = request.userId();
        log.info("Received Open API request with request question:{} and userId:{}", request);
        String finalPrompt = String.format(fullPrompt, userContextRetrievalService.getUserContext(userId), request.question());
        // some mock user data
        return assistant.chat(userId,finalPrompt);

    }

    @Override
    public String getResponseSimple(ChatRequest request) {

       var model =  OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName(OpenAiChatModelName.GPT_3_5_TURBO)
                .build();
        var response = model.generate(request.question());
        log.info("Received Open API response ", response);
        return response;
    }
}

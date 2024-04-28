package com.tudux.langchain4jtesting.service;

import org.springframework.stereotype.Service;

@Service
public class UserContextRetrievalServiceImpl implements UserContextRetrievalService {
    @Override
    public String getUserContext(int userId) {
        return """
                UserId: 123
                Name: Leon Trotksy
                Plane Name: Monthly Payments
                Current Status: DELINQUENT_PAYMENTS
                Account Notes: Account suspended due to missing payments                                       
                """;
    }
}

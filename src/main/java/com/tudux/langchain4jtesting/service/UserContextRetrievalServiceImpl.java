package com.tudux.langchain4jtesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserContextRetrievalServiceImpl implements UserContextRetrievalService {

    @Autowired
    UserContextDataService userContextDataService;

    @Override
    public String getUserContext(int userId) {
        return userContextDataService.getFullUserContextInteraction((long) userId);
    }
}

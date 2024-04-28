package com.tudux.langchain4jtesting.service;

import com.tudux.langchain4jtesting.entity.Customer;
import com.tudux.langchain4jtesting.entity.InternetContract;
import com.tudux.langchain4jtesting.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserContextDataServiceImpl implements UserContextDataService{

    private static String CONTRACT_TEMPLATE = """
    
    Contract %s with id: %s
       Status:     %s
       Notes:    %s
       
               
    """;
    private static String USER_SERVICE_CONTEXT_TEMPLATE = """
            
            Customer Name: %s
            
            Customer Email: %s
            
            Customer Contract Status: 
                  %s
                
                        
            """;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String getFullUserContextInteraction(Long userId) {

        Optional<Customer> customer = customerRepository.findById(userId);
        if(customer.isPresent()) {
            Customer extractedCustomer = customer.get();
            String completeContext = String.format(
                    USER_SERVICE_CONTEXT_TEMPLATE
                    ,extractedCustomer.getFirstName() + " " + extractedCustomer.getLastName()
                    , extractedCustomer.getEmail()
                    , handleContracts(extractedCustomer.getInternetContracts())
            );
            return completeContext;
        }
        return "No Data Found for Customer";
    }

    public String handleContracts(List<InternetContract> internetContractList){
        String contractsInfo = "";

        for(InternetContract contract : internetContractList){
            contractsInfo =  contractsInfo.concat(
                    String.format(CONTRACT_TEMPLATE,
                            contract.getInternetPlan(),
                            contract.getId(),
                            contract.getStatus(),
                            contract.getNotes()

                    )
            );
        }
        return contractsInfo;
    }
}

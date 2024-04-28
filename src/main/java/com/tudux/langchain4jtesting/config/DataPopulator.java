package com.tudux.langchain4jtesting.config;

import com.tudux.langchain4jtesting.enums.ContractStatus.Status;
import com.tudux.langchain4jtesting.entity.Customer;
import com.tudux.langchain4jtesting.entity.InternetContract;
import com.tudux.langchain4jtesting.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DataPopulator implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
//        // Create dummy data and save using repository methods
//
//
//       //  Create customers (run 1)
//        Customer customer1 = customerRepository.save(Customer.builder()
//                .email("some@gmail.com")
//                .firstName("Robert")
//                .lastName("Zhang")
//                .build());
//        Customer customer2= customerRepository.save(Customer.builder()
//                .email("some2@gmail.com")
//                .firstName("Elaine")
//                .lastName("Maggofin")
//                .build());
//        Customer customer3 = customerRepository.save(Customer.builder()
//                .email("some3@gmail.com")
//                .firstName("John")
//                .lastName("Fitzpatrick")
//                .build());
//
//
//        // Create internet contracts run2
//        InternetContract ic1 = InternetContract.builder()
//                .downloadSpeed(123.2)
//                .internetPlan("XS 981")
//                .customer(customer1) // Set customer for each contract
//                .status(Status.ACTIVE)
//                .notes("Plan is in order")
//                .build();
//
//        InternetContract ic2 = InternetContract.builder()
//                .downloadSpeed(123.2)
//                .internetPlan("XS 981")
//                .customer(customer2) // Set customer for each contract
//                .status(Status.DISCONNECTED)
//                .notes("Access disconnected until late payments are solved")
//                .build();
//
//        InternetContract ic3 = InternetContract.builder()
//                .downloadSpeed(123.2)
//                .internetPlan("XS 981")
//                .customer(customer3) // Set customer for each contract
//                .status(Status.INACTIVE)
//                .notes("Contract terminated by the customer")
//                .build();
//
//        // Add contracts to their respective customers (optional for unidirectional)
//        customer1.setInternetContracts(Collections.singletonList(ic1));
//        customer2.setInternetContracts(Collections.singletonList(ic2)); // Single contract for customer2
//        customer3.setInternetContracts(Collections.singletonList(ic3)); // Single contract for customer3 (already assigned)
//
//        customerRepository.save(customer1);
//        customerRepository.save(customer2);
//        customerRepository.save(customer3);


    }


//    PS docker volume rm -f langchain4jtesting_postgres_data
//    Error response from daemon: remove langchain4jtesting_postgres_data: volume is in use - [12de963cb389b999b6e608f157d208c91ee7a03776c5880b8cf3e8e405aba8a6]
//    PS docker rm 12de963cb389b999b6e608f157d208c91ee7a03776c5880b8cf3e8e405aba8a6
//12de963cb389b999b6e608f157d208c91ee7a03776c5880b8cf3e8e405aba8a6
//    PS docker volume rm -f langchain4jtesting_postgres_data
//    langchain4jtesting_postgres_data
}

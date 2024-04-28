package com.tudux.langchain4jtesting.entity;

import com.tudux.langchain4jtesting.enums.ContractStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "internet_contracts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InternetContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @ToString.Exclude
    private Customer customer;

    @Column(nullable = false)
    private String internetPlan;

    @Column(nullable = false)
    private String notes;

    @Column(nullable = false)
    private Double downloadSpeed;

    @Enumerated(EnumType.STRING)  // Use this for storing enum values as strings
    private ContractStatus.Status status;

}


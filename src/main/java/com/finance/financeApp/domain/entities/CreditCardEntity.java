package com.finance.financeApp.domain.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "credit_cards")
public class CreditCardEntity extends CardEntity {
    private BigDecimal creditLimit;
    private BigDecimal interestRate;
    private int statementDay;
    private int paymentDueDay;

}

package com.finance.financeApp.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cards")
@Inheritance(strategy = InheritanceType.JOINED)
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Size(max = 4,min = 4)
    private String lastCardDigits;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}

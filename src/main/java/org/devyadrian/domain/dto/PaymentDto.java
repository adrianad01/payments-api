package org.devyadrian.domain.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDto {

    private UUID id;
    private String description;
    private String store;
    private BigDecimal amount;
    private LocalDateTime paymentDate;
    private Boolean installmentsPayment;
    private Integer paymentNumber;
}

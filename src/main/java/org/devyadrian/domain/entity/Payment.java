package org.devyadrian.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments", schema = "dbo")
public class Payment {

    @Id
    private UUID id;

    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "description")
    private String descriptionProduct;

    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "store")
    private String storeOfProduct;

    @NotNull
    @Column(name = "amount")
    private Float amount;

    @NotNull
    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "installments_payment")
    private Boolean installmentsPayment;

    @Column(name = "payment_number")
    private Integer paymentNumber;
}

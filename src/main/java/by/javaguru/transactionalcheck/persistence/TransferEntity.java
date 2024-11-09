package by.javaguru.transactionalcheck.persistence;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="transfers")
public class TransferEntity implements Serializable {

    private static final long serialVersionUID = -6202121587624962351L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long transferId;

    @Column(nullable = false)
    private String senderId;

    @Column(nullable = false)
    private String recepientId;

    @Column(nullable = false)
    private BigDecimal amount;

    public TransferEntity() {
    }

    public TransferEntity(Long transferId, String senderId, String recepientId, BigDecimal amount) {
        this.transferId = transferId;
        this.senderId = senderId;
        this.recepientId = recepientId;
        this.amount = amount;
    }


    public Long getTransferId() {
        return transferId;
    }

    public void setTransferId(Long transferId) {
        this.transferId = transferId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecepientId() {
        return recepientId;
    }

    public void setRecepientId(String recepientId) {
        this.recepientId = recepientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}


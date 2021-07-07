package com.jmhreif.sdnvenmosocial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.ZonedDateTime;

@Node
public class Payment {
    @Id
    private final String paymentId;

    private String type, status, action, note;
    private ZonedDateTime dateCreated, dateComplete;

    @Relationship("PAID_USING")
    @JsonIgnoreProperties("payments")
    Application application;

    @Relationship(value = "SENDS",direction = Relationship.Direction.INCOMING)
    @JsonIgnoreProperties({"moneySent", "moneyReceived"})
    User payingUser;

    @Relationship("PAID_TO")
    @JsonIgnoreProperties({"moneyReceived", "moneySent"})
    User paidUser;

    public Payment(String paymentId, String type, String status, String action, String note, ZonedDateTime dateCreated, ZonedDateTime dateComplete) {
        this.paymentId = paymentId;
        this.type = type;
        this.status = status;
        this.action = action;
        this.note = note;
        this.dateCreated = dateCreated;
        this.dateComplete = dateComplete;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getAction() {
        return action;
    }

    public String getNote() {
        return note;
    }

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    public ZonedDateTime getDateComplete() {
        return dateComplete;
    }

    public Application getApplication() {
        return application;
    }

    public User getPaidUser() {
        return paidUser;
    }

    public User getPayingUser() {
        return payingUser;
    }
}

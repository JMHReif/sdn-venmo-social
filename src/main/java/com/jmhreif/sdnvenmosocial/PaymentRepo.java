package com.jmhreif.sdnvenmosocial;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface PaymentRepo extends Neo4jRepository<Payment, String> {
    @Query("MATCH (p:Payment)-[r]-(other) WHERE p.status = 'pending' RETURN p, collect(r), collect(other);")
    Iterable<Payment> findPaymentsByStatus();
}

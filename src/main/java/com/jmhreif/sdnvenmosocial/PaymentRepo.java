package com.jmhreif.sdnvenmosocial;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface PaymentRepo extends Neo4jRepository<Payment, String> {

    @Query("MATCH (u1:User)-[r:SENDS]->(p:Payment)-[r2:PAID_TO]->(u2:User)" +
            "MATCH (p)-[r3:PAID_USING]->(a:Application) " +
            "RETURN p, collect(u1), collect(r), collect(u2), collect(r2), collect(r3), collect(a);")
    Iterable<Payment> findSomePayments();

}

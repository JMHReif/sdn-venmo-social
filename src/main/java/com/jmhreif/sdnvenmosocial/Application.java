package com.jmhreif.sdnvenmosocial;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Application {
    @Id
    private final String applicationId;

    private String description, name, imageURL;

    public Application(String applicationId, String description, String name, String imageURL) {
        this.applicationId = applicationId;
        this.description = description;
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }
}

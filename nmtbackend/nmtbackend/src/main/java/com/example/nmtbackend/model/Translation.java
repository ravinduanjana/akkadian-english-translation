package com.example.nmtbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "translations") // This names the table in MongoDB
public class Translation {
    @Id
    private String id;
    private String source;
    private String result;

    // Constructors
    public Translation() {}

    public Translation(String source, String result) {
        this.source = source;
        this.result = result;
    }

    // Getters and Setters (Important for Spring to read/write data)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}
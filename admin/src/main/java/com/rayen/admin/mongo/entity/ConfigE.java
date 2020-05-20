package com.rayen.admin.mongo.entity;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ConfigE {
    @Id
    private String id;
    
    private String name;
    private String type;
    private String value; 

    public ConfigE(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
}

package com.home.domain;

import org.springframework.stereotype.Component;

@Component
public enum Operation {

    IN("$in");

    private String value;

    Operation(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public String getWhere(String key, String[] args)
    {
        StringBuilder flattenedArgs = new StringBuilder();

        for( String s : args)
        {
            if (flattenedArgs.length() != 0)
            {
                flattenedArgs.append(" , ");
            }
            flattenedArgs.append(s);
        }
        switch (this)
        {
            case IN:
                String.format("{ %s: { %s: [ %s ] } } ", key, this.value,flattenedArgs);
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}

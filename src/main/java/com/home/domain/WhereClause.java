package com.home.domain;

public class WhereClause {
    String key;
    String value;
    String operation;

    public WhereClause() {}

    public WhereClause(String key, String value, String operation) {
        this.key = key;
        this.value = value;
        this.operation = operation;
    }


}

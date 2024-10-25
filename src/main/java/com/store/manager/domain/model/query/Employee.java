package com.store.manager.domain.model.query;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class Employee {
    private UUID uuid;
    private String typeOfDocument;
    private String idDocument;
    private String names;
    private String surnames;
    private String gender;
    private LocalDate dateOfBirth;
    private String position;
    private int salary;

    public Employee(UUID uuid) {
        this.uuid = uuid;
    }

    public Employee(String typeOfDocument, String idDocument,
                    String names, String surnames, String gender,
                    LocalDate dateOfBirth, String position, int salary) {
        this.uuid = uuid;
        this.typeOfDocument = typeOfDocument;
        this.idDocument = idDocument;
        this.names = names;
        this.surnames = surnames;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
    }
}

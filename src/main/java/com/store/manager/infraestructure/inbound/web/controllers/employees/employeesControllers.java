package com.store.manager.infraestructure.inbound.web.controllers.employees;

import com.store.manager.domain.model.query.Employee;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Data
@RequestMapping("/employees")
public class employeesControllers {

    @GetMapping("/list")
    public String list() {
        Employee employee = new Employee(UUID.randomUUID());
        employee.setNames("Omar Enrique");
        return "List of employees " + employee.getNames();
    }
}

package com.example.workhome25;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);
    Employee remove(Employee employee);
    Employee find(Employee employee);

    List print();
}

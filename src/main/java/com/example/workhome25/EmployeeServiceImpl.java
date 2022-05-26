package com.example.workhome25;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee add(Employee employee) {
        if (employees.size() > 3) {
            throw new EmployeeStorageIsFullException();
        } else if  (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
            employees.add(employee);
        return employee;
    }

    @Override
    public Employee remove(Employee employee) {
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        } else {

            employees.remove(employee);
        }

        return employee;
    }

    @Override
    public Employee find(Employee employee) {
        if (employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public List print() {
        return (List) employees;
    }
}

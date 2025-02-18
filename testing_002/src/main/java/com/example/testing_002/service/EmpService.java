package com.example.testing_002.service;

import java.util.ArrayList;
import com.example.testing_002.modal.Employee;
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}

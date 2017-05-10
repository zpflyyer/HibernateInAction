package com.pengfei.inheritence.Service;

import com.pengfei.inheritence.domain.Customer;
import com.pengfei.inheritence.domain.Employee;
import com.pengfei.inheritence.domain.Manager;
import com.pengfei.inheritence.domain.Person;

import java.security.spec.ECFieldF2m;
import java.util.List;

/**
 * Created by zhaopen on 4/30/2017.
 */
public interface PersonService {
    List<Person> getAll();
    List<Employee> getAllEmpl();
    List<Manager> getAllManag();
    List<Customer> getAllCustom();
}

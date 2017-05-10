package com.pengfei.inheritence.Dao;

import com.pengfei.inheritence.domain.Customer;
import com.pengfei.inheritence.domain.Employee;
import com.pengfei.inheritence.domain.Manager;
import com.pengfei.inheritence.domain.Person;

import java.util.List;

/**
 * Created by zhaopen on 4/30/2017.
 */
public interface PersonDao {
    List<Person> getAll();
    List<Employee> getAllEmpl();
    List<Manager> getAllManag();
    List<Customer> getAllCustom();
}

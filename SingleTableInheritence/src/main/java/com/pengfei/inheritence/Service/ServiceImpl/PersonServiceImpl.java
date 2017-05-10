package com.pengfei.inheritence.Service.ServiceImpl;

import com.pengfei.inheritence.Dao.PersonDao;
import com.pengfei.inheritence.Service.PersonService;
import com.pengfei.inheritence.domain.Customer;
import com.pengfei.inheritence.domain.Employee;
import com.pengfei.inheritence.domain.Manager;
import com.pengfei.inheritence.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaopen on 4/30/2017.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public List<Employee> getAllEmpl() {
        return personDao.getAllEmpl();
    }

    @Override
    public List<Manager> getAllManag() {
        return personDao.getAllManag();
    }

    @Override
    public List<Customer> getAllCustom() {
        return personDao.getAllCustom();
    }
}

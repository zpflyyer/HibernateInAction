package com.pengfei.inheritence.Dao.DaoImpl;

import com.pengfei.inheritence.Dao.PersonDao;
import com.pengfei.inheritence.domain.*;
import com.pengfei.inheritence.util.SessionUtil;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaopen on 4/25/2017.
 */
@Getter
@Setter
@Repository
public class PersonDaoImpl implements PersonDao {

//    public static void main(String[] args) {
//        PersonDaoImpl personDao = new PersonDaoImpl();
//        personDao.createAndSavePerson();
//        SessionUtil.sessionFactory.close();
//    }
    @Autowired
    private SessionFactory sessionFactory;

    public List<Person> getAll(){
        return (List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class).list();

//        Class<T> tClass;
//        Person person1 = new Person("刘潇","女",22);
//        person1.setId(person.getId());
//        person1.setAddress(address);
//        sessionFactory.getCurrentSession().saveOrUpdate(person1);
    }

    @Override
    public List<Employee> getAllEmpl() {
        return (List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }

    @Override
    public List<Manager> getAllManag() {
        return (List<Manager>) sessionFactory.getCurrentSession().createCriteria(Manager.class).list();
    }

    @Override
    public List<Customer> getAllCustom() {
        return (List<Customer>) sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
    }


//    private void createAndSavePerson(){
//        Session session = SessionUtil.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//
//        Person person = new Person("David","男",17);
//        Address address = new Address("陕西","西安");
//        person.setAddress(address);
//
//        Manager manager = new Manager("Jack","男",45);
//        Address address1 = new Address("江西","南昌");
//        manager.setAddress(address1);
//        manager.setDepartment("大数据部门");
//        manager.setTitle("研发总监");
//        manager.setSalary("350k");
//
//        Employee employee = new Employee("Karl","男",21);
//        Address address2 = new Address("湖北","武汉");
//        employee.setAddress(address2);
//        employee.setTitle("数据分析");
//        employee.setSalary("140k");
//        employee.setManager(manager);
//
//        Employee employee1 = new Employee("Sven","男",25);
//        Address address3 = new Address("河南","郑州");
//        employee1.setAddress(address3);
//        employee1.setTitle("数学家");
//        employee1.setSalary("300k");
//        employee1.setManager(manager);
//
//        Customer customer = new Customer("Kung,Lee","男",31);
//        Address address4 = new Address("Chicago","SouthTown");
//        customer.setAddress(address4);
//        customer.setComments("重要客户");
//        customer.setEmployee(employee);
//
//        Customer customer1 = new Customer("Sean","男",26);
//        Address address5 = new Address("England","unknown city");
//        customer1.setAddress(address5);
//        customer1.setComments("长期客户");
//        customer1.setEmployee(employee);
//
//        session.saveOrUpdate(person);
//        session.saveOrUpdate(manager);
//        session.saveOrUpdate(employee);
//        session.saveOrUpdate(employee1);
//        session.saveOrUpdate(customer);
//        session.saveOrUpdate(customer1);
//
//        tx.commit();
//        SessionUtil.closeCurrentSession();
//    }

//    public void queryPersons(){
//        Session session = SessionUtil.getCurrentSession();
//        Transaction tx = session.beginTransaction();
//
//        session.enableFilter("ageFilter").setParameter("AGE",30);
////
////        List pl =  session.createQuery("select p from Person as p " +
////                "where p.age >= " +
////                "(select max(p1.age) from Person as p1)").list();
//        List pl =  session.createQuery("select p from Person as p").list();
//        for (Object p:pl
//                ) {
//            Person person = (Person)p;
//            System.out.println(person);
//        }
//
//        tx.commit();
//        SessionUtil.closeCurrentSession();
//    }
}

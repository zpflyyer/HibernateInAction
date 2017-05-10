package com.pengfei.bidirectional;

import com.pengfei.bidirectional.domain.Address;
import com.pengfei.bidirectional.domain.Person;
import com.pengfei.bidirectional.domain.Teacher;
import com.pengfei.bidirectional.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/22/2017.
 */
public class Application
{
    public static void main(String[] args) {
        Application app = new Application();
        app.createAndSavePerson();
        SessionUtil.sessionFactory.close();
    }

    private void createAndSavePerson(){
        Session session = SessionUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person();
        person.setName("Lucy");
        person.setAge(19);

        session.saveOrUpdate(person);

        Person person1 = new Person();
        person1.setName("Karl");
        person1.setAge(18);

        session.saveOrUpdate(person1);

//        Address address = new Address();
//        address.setProvince("上海");
//        address.setCity("上海市");
//        address.setPerson(person);
//
//        session.saveOrUpdate(address);
//
//        Address address1 = new Address();
//        address1.setProvince("上海");
//        address1.setCity("上海市");
//        address1.setPerson(person);
//
//        session.saveOrUpdate(address1);

        Teacher teacher = new Teacher();
        teacher.setName("Peter");
        teacher.setAge(26);
        Set<Person> personSet = new HashSet<Person>();
        personSet.add(person);
        personSet.add(person1);
        teacher.setPersonSet(personSet);

        session.persist(teacher);

        Teacher teacher1 = new Teacher();
        teacher1.setName("Carl");
        teacher1.setAge(52);
        Set<Person> personSet1 = new HashSet<Person>();
        personSet1.add(person);
        personSet1.add(person1);
        teacher1.setPersonSet(personSet1);

        session.persist(teacher1);

        tx.commit();
        SessionUtil.closeCurrentSession();
    }
}

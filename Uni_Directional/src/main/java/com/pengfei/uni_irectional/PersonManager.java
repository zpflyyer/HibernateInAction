package com.pengfei.uni_irectional;

import com.pengfei.uni_irectional.domain.*;
import com.pengfei.uni_irectional.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaopen on 4/21/2017.
 */
public class PersonManager {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        personManager.createAndStore();
        SessionUtil.sessionFactory.close();
    }
    private void createAndStore(){
        Session session = SessionUtil.currentSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person();
        Name name = new Name();
        name.setFirst_name("saijun");
        name.setLast_name("Liang");
        person.setAge(22);
        person.setName(name);

        Address address = new Address();
        address.setProvince("陕西");
        address.setCity("西安");
        person.setAddress(address);
//
        IdentifyCard id_card = new IdentifyCard();
        id_card.setCountry("China");
        id_card.setValid_period(new Date(2022,12,6));
        id_card.setId_number("4803981996111169870");
        person.setId_card(id_card);
//
        Set<Toy> toySet = new HashSet<Toy>();
        Toy toy = new Toy();
        toy.setName("liuliu_ball");
        toy.setAge(10);
        Toy toy1 = new Toy();
        toy1.setName("bear");
        toy1.setAge(6);
        toySet.add(toy);
        toySet.add(toy1);
        person.setToys(toySet);

//        List<Person> personList = session.createCriteria(Person.class).list();
//        for (Person person :
//                personList) {
//            if(person != null && person.getName().equals(new Name("saijun","Liang"))){

//                Set<Toy> toySet = new HashSet<Toy>();
//                Toy toy = new Toy();
//                toy.setName("liuliu_ball");
//                toy.setAge(10);
//                Toy toy1 = new Toy();
//                toy1.setName("bear");
//                toy1.setAge(6);
//                toySet.add(toy);
//                toySet.add(toy1);
//                person.setToys(toySet);

                Set<Teacher> teacherSet = new HashSet<Teacher>();
                Teacher teacher = new Teacher(new Name("steven","Alex"),26);
                Teacher teacher1 = new Teacher(new Name("jack","John"),29);
                teacherSet.add(teacher);
                teacherSet.add(teacher1);
                person.setTeacherSet(teacherSet);
//
                session.saveOrUpdate(person);
//            }
//        }
        tx.commit();
        SessionUtil.closeSession();
    }
}

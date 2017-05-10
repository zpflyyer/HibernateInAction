package com.pengfei.hibernate.getstart;

import com.pengfei.hibernate.getstart.model.Course;
import com.pengfei.hibernate.getstart.model.Score;
import com.pengfei.hibernate.getstart.model.Season;
import com.pengfei.hibernate.getstart.model.Student;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.PrimaryKey;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by zhaopen on 3/13/2017.
 */
public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        Configuration conf = new Configuration().configure();
        ServiceRegistry svr = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(svr);

        Student stu2 = new Student();
        stu2.setSname("Lucy");
        stu2.setSno(10151680);
        stu2.setBir_season(Season.Autunm);

        Session session1 = sf.openSession();
        Transaction tx1 = session1.beginTransaction();
        session1.saveOrUpdate(stu2);

        Score score = new Score();
        score.setSno(10151680);
        score.setCno(1);
        score.setScore(88);
//        session1.persist(score);

        tx1.commit();
        session1.close();

        Course course = new Course();
        course.setCno(3);
        course.setCname("Chinese");

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(course);
        Student stu3 = (Student) session.load(Student.class,10151680);
        System.out.println(stu3.getStu_inf());

        tx.commit();
        session.close();

        sf.close();
    }
}

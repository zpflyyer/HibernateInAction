package com.pengfei.inheritence.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by zhaopen on 4/23/2017.
 */
public class SessionUtil {
    public static final SessionFactory sessionFactory;

    static {
        try{
            Configuration conf = new Configuration().configure();
            ServiceRegistry svc = new StandardServiceRegistryBuilder()
                    .applySettings(conf.getProperties())
                    .build();
            sessionFactory = conf.buildSessionFactory(svc);
        }
        catch (HibernateException ex){
            System.err.println("Initializing SessionFactory Failed!");
            throw ex;
        }
    }

    private static final ThreadLocal<Session> session  = new ThreadLocal<Session>();

    public static Session getCurrentSession(){
        Session sess = session.get();
        if(sess == null){
            sess = sessionFactory.openSession();
            session.set(sess);
        }
        return sess;
    }

    public static void closeCurrentSession(){
        Session sess = session.get();
        if(sess != null && sess.isOpen()){
            sess.close();
        }
        session.set(null);
    }
}

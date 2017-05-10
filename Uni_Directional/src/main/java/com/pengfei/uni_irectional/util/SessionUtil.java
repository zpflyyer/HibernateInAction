package com.pengfei.uni_irectional.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by zhaopen on 4/20/2017.
 */

public class SessionUtil {

    public static final SessionFactory sessionFactory;

    static {
        try {
            Configuration conf = new Configuration()
                    .configure();
            org.hibernate.service.ServiceRegistry svc = new StandardServiceRegistryBuilder()
                    .applySettings(conf.getProperties()).build();
            sessionFactory = conf.buildSessionFactory(svc);
        }
        catch (HibernateException excp){
            System.err.println("Initializing SessionFactory Fialed!");
            throw new ExceptionInInitializerError(excp);
        }
    }

    public static final ThreadLocal<Session> session = new ThreadLocal<Session>();

    public static Session currentSession() throws HibernateException{
        Session s = session.get();
        if(s ==  null){
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }

    public static void closeSession() throws HibernateException{
        Session s = session.get();
        if(s!=null){
            s.close();
        }
        session.set(null);
    }
}

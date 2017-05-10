package com.pengfei.HibernateQuery;

import com.pengfei.HibernateQuery.domain.Person;
import com.pengfei.HibernateQuery.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by zhaopen on 4/23/2017.
 */
public class Queryer {
    public static void main(String[] args) throws Exception{
        Queryer queryer = new Queryer();
        queryer.queryPersons();
        SessionUtil.closeCurrentSession();
    }

    private void queryPersons(){
        Session session = SessionUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();

        //HQL查询和SQL最大的不同在于，HQL查询不是针对数据表进行查询，而是针对持久化对象进行查询，因此与持久化对象相关的属性所在的表均会被涉及到
        List pl = session.createQuery("select distinct p from Person as p " +
                "where p.address.province = :provin")
                .setString("provin" , "陕西")
                .list();

        for (Object obj:pl
             ) {
            System.out.println(obj);
//            Person p = (Person)obj;
//            System.out.println(p.getAddress());
//            System.out.println(p.getName());
//            System.out.println(p.getAge());
//            System.out.println(p.getId_card());
//            //延迟加载：前面的输出都是在查询完成后一起输出，而集合属性则需要先查询再输出
//            System.out.println(p.getTeacherSet());
//            System.out.println(p.getToys());
        }

        tx.commit();
        SessionUtil.closeCurrentSession();
    }
}

package lee;

import org.hibernate.Transaction;
import org.hibernate.Session;

import java.util.*;

import org.crazyit.app.domain.*;

public class PersonManager
{
	public static void main(String[] args)
	{
		PersonManager mgr = new PersonManager();
		mgr.createAndStorePerson();
		SessionUtil.sessionFactory.close();
	}

private void createAndStorePerson()
{

	Session session = SessionUtil.currentSession();

	Transaction tx = session.beginTransaction();

//	Person person = new Person();
//
//	person.setAge(20);
//	person.setName("Pengfei");
//
//	List<String> rem_schs = new ArrayList<String>();
//	rem_schs.add("小学");
//	rem_schs.add("中国");
//	person.getSchools().removeAll(rem_schs);
//
//	List<String> add_schs = new ArrayList<String>();
//	add_schs.add("断泾小学");
//	add_schs.add("新堡子中学");
//	person.getSchools().addAll(add_schs);
//
//	session.saveOrUpdate(person);

	List<Person> personList = session.createCriteria(Person.class).list();
	for (Person person:personList
		 ) {
//		if (person.getName() != null && person.getName().equals("crazyit.org")){
//			person = (Person) session.load(Person.class,person.getId());
//			session.delete(person);
//		}
//		if (person.getName() !=null && person.getName().equals("Pengfei")){
//			person = (Person) session.load(Person.class,person.getId());
//			Map<String,String> addressMap = new HashMap<String, String>();
//			addressMap.put("email","pengfei.zhao@zpf.com");
//			addressMap.put("address","ShangHai");
//			person.setAddresses(addressMap);
//			session.saveOrUpdate(person);
//		}
//		if (person.getName() !=null && person.getName().equals("Pengfei")){
//			person = (Person) session.load(Person.class,person.getId());
//			Set<String> joyset = new HashSet<String>();
//			joyset.add("ping-pang");
//			person.setJoys(null);
//			person.setJoys(joyset);
//			joyset.add("Lucy");
//			person.setJoys(joyset);
//			session.saveOrUpdate(person);
//		}
//		if (person.getName() !=null && person.getName().equals("Pengfei")){
//			person = (Person) session.load(Person.class,person.getId());
//			Relativity relativity = new Relativity();
//			relativity.setName("Chris");
//			relativity.setAge(24);
//			Map<String,String> rela_infmap = new HashMap<String, String>();
//			rela_infmap.put("phone","2990607");
//			rela_infmap.put("address","newTown");
//			relativity.setRela_inf(rela_infmap);
//			person.setRelativity(relativity);
//			session.saveOrUpdate(person);
//		}
//		if (person.getName() !=null && person.getName().equals("Pengfei")){
//			person = (Person) session.load(Person.class,person.getId());
//
//			List<Relativity> relativityList = new ArrayList<Relativity>();
//
//			Relativity relativity1 = new Relativity();
//			relativity1.setName("spark");
//			relativity1.setAge(19);
//			Relativity relativity2 = new Relativity();
//			relativity2.setName("Jessy");
//			relativity2.setAge(31);
//
//			Map<String,String> rela_inf1 = new HashMap<String, String>();
//			rela_inf1.put("mail","spark@zpf.com");
//			rela_inf1.put("address","WashingTown");
//			Map<String,String> rela_inf2 = new HashMap<String, String>();
//			rela_inf2.put("mail","Jessy@zpf.com");
//			rela_inf2.put("address","NewYork");
//
//			relativity1.setRela_inf(rela_inf1);
////			relativity2.setRela_inf(rela_inf2);
//
//			relativityList.add(relativity1);
//			relativityList.add(relativity2);
//
////			person.setRelativityList(relativityList);
//			person.setRelativity(relativity1);
//			session.saveOrUpdate(person);
//		}
		if (person.getName() !=null && person.getName().equals("Pengfei")){
			person = (Person) session.load(Person.class,person.getId());
			Map<Fruit,Price> fruitPriceMap = new HashMap<Fruit, Price>();
			Fruit banana = new Fruit();
			banana.setName_ch("香蕉");banana.setName_en("Banana");
			Price bana_pri = new Price();
			bana_pri.setPrice_ch("15￥");bana_pri.setPrice_en("5$");
			Fruit apple = new Fruit();
			apple.setName_ch("苹果");apple.setName_en("Apple");
			Price apple_pri = new Price();
			apple_pri.setPrice_ch("30￥");apple_pri.setPrice_en("13$");
			fruitPriceMap.put(banana,bana_pri);
			fruitPriceMap.put(apple,apple_pri);
			person.setFruitsMap(fruitPriceMap);
			session.saveOrUpdate(person);
		}
	}

	tx.commit();
	SessionUtil.closeSession();
}
}
import jakarta.persistence.*;


public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        address ad = new address();
//        ad.setCity("Delhi");
//        ad.setPincode("400371");
//        ad.setState("uttar Pradesh");
//
//        address ad1 = new address();
//        ad1.setCity("Amritsar");
//        ad1.setPincode("478890");
//        ad1.setState("Punjab");
//
//        cust ob = new cust();
//        ob.setId(3);
//        ob.setName("Himanshu Samundre");
//
//        ob.getList_address().add(ad);
//        ob.getList_address().add(ad1);


//        emp ob=new emp();
//        ob.setName("vishal");
//        ob.setName("sagar");
//        ob.setName("paritosh");
//        ob.setName("kunal");
//        ob.setName("rajiv");
//
//        ob.setDt(new Date());
//        ob.setDt(new Date());
//        ob.setDt(new Date());
//        ob.setDt(new Date());
//        ob.setDt(new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-15"));     //parse the date format

        vehicle v = new vehicle();
        v.setVnum(1);
        v.setVehname("Nissan");

        vehicle v1 = new vehicle();
        v1.setVnum(2);
        v1.setVehname("mahindra");

        person pr = new person();
        pr.setSr(1);
        pr.setName("vishal");

        pr.getVehi().add(v);
        pr.getVehi().add(v1);


        entityManager.persist(pr);
//        entityManager.persist(v);
//        entityManager.persist(v1);


        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

}

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
        v.setVeh_id(1);
        v.setVeh_name("Dhanno");

        vehicle v1 = new vehicle();
        v1.setVeh_id(2);
        v1.setVeh_name("Billo");

        vehicle v2 = new vehicle();
        v2.setVeh_id(3);
        v2.setVeh_name("dugdug");

        user u = new user();
        u.setId(1);
        u.setName("Vishal");

        user u1 = new user();
        u1.setId(2);
        u1.setName("sagar");

        user u2 = new user();
        u2.setId(3);
        u2.setName("bharat");


        u.getVehi_list().add(v);u.getVehi_list().add(v1);u.getVehi_list().add(v2);
        v.getUser_list().add(u);v.getUser_list().add(u1);v.getUser_list().add(u2);
        u1.getVehi_list().add(v1);u1.getVehi_list().add(v);u1.getVehi_list().add(v2);
        v1.getUser_list().add(u1);v1.getUser_list().add(u);v1.getUser_list().add(u2);
        u2.getVehi_list().add(v2);u2.getVehi_list().add(v);u2.getVehi_list().add(v1);
        v2.getUser_list().add(u2);v2.getUser_list().add(u);v2.getUser_list().add(u1);



        entityManager.persist(u);
//        entityManager.persist(v);
        entityManager.persist(u1);
//        entityManager.persist(v1);
        entityManager.persist(u2);
//        entityManager.persist(v2);
//        entityManager.persist(v1);


        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

}

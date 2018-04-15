package pl.daro.psy;

//import com.j256.ormlite.dao.Dao;
//import com.j256.ormlite.dao.DaoManager;
//import com.j256.ormlite.jdbc.JdbcConnectionSource;
//import com.j256.ormlite.support.ConnectionSource;
//import com.j256.ormlite.table.TableUtils;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.daro.psy.domain.Dog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import javax.sql.DataSource;
import javax.transaction.Transactional;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.List;

@Repository
public class DogDAO {
    @PersistenceContext
    private EntityManager em;
//        private Dao<Dog, Integer> daoManager;
//    @Autowired
//    private DataSource dataSource;

//    public void conn() {
//        try {
//            String databaseUrl = "jdbc:mysql://localhost:3306/dogs?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
////            String databaseUrl = "jdbc:h2:./dogs";
//            ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl,"root","sara");
//            daoManager = DaoManager.createDao(connectionSource, Dog.class);
////            TableUtils.createTableIfNotExists(connectionSource, Dog.class);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public DogDAO() {
//        conn();
//        makeDogs();
    }

//    public void makeDogs() {
//        DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//        Dog dog = new Dog();
//        dog.setName("Sara");
//        dog.setKeeperName("Adarti");
//        dog.setWeight(25.2f);
//        try {
//            dog.setBirthDay(sdf.parse("02-12-2012"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        Dog dog1 = new Dog();
//        dog1.setName("Mara");
//        dog1.setKeeperName("Marti");
//        dog1.setWeight(35.2f);
//        try {
//            dog1.setBirthDay(sdf.parse("03-10-2013"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            daoManager.create(dog);
//            daoManager.create(dog1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    @Transactional
    public List getDogs() {
        return em.createQuery("SELECT d FROM  Dog d").getResultList();

//        for (Dog dog :
//                daoManager) {
//            dogs.add(dog);
//        }

//        String sql = "SELECT * FROM dogs WHERE id = ?";
//        Connection conn = null;
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1,1);
//            Dog dog = null;
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                dog = new Dog();
//                dog.setId(rs.getInt("id"));
//                dog.setName(rs.getString("name"));
//                dog.setKeeperName(rs.getString("keeper"));
//                dog.setWeight(rs.getFloat("weight"));
//                dog.setBirthDay(rs.getDate("birthDay").toLocalDate());
//
//                dogs.add(dog);
//            }
//
//            rs.close();
//            ps.close();
//            return dogs;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                }
//            }
//        }
    }
    @Transactional
    public Dog getDogByID(int id) {
//        try {
//            return daoManager.queryForId(id);
//        } catch (SQLException e) {
//            return null;
//        }
//        String sql = "SELECT * FROM dogs WHERE id = ?";
//        Connection conn = null;
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1,id);
//            Dog dog = null;
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                dog = new Dog();
//                dog.setId(rs.getInt("id"));
//                dog.setName(rs.getString("name"));
//                dog.setKeeperName(rs.getString("keeper"));
//                dog.setBirthDay(rs.getDate("birthDay").toLocalDate());
//                dog.setWeight(rs.getFloat("weight"));
//
//            }
//
//            rs.close();
//            ps.close();
//            return dog;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                }
//            }
//        }
        return em.find(Dog.class,id);

    }
    @Transactional
    public void addDog(Dog dog) {
//        try {
//            daoManager.create(dog);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    em.merge(dog);
    }
    @Transactional
    public void deleteDog(Dog dog){
        em.remove(em.contains(dog)?dog : em.merge(dog));
    }
}

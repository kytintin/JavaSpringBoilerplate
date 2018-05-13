package com.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.dao.UserDao;
import com.entities.Users;
 
@Repository
@Transactional
public class UsersImpl implements UserDao {
 
    @Autowired
    SessionFactory sessionFactory;
    
    private static final Logger log = LoggerFactory.getLogger(UsersImpl.class);

	public List<Users> userList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from users").list();
	}
	
	public void createUser(Users user)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}

	public boolean DeleteUsers(Users user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(user);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
	}

	public boolean saveOrupdate(Users user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	        return true;
	}
}
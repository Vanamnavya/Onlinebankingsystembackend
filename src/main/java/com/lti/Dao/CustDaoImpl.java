package com.lti.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.CustomerAccount;

/*@Component is the most generic Spring annotation.  * 
	 * A Java class decorated with @Component is found during classpath scanning 
	 * and registered in the context as a Spring bean. ... 
	 * @ComponentScan ensures that the classes decorated with
	 *  @Component are found and registered as Spring beans.
	 */
/*
 * @Component:
 * 		@Repository: It represents DAO Classes.
 * 		@Service:It represents Service classes.
 * 		@Cntroller: It represents Controller classes of Spring MVC
 * 		@RestController: It represents REST layer of Web Services.
 */
@Repository("custDao")
public class CustDaoImpl implements CustDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List<CustomerAccount> getCustList() {
		String sql = "SELECT c FROM CustomerAccount c"; // -- just to reduce display
		Query qry = entityManager.createQuery(sql);
		List<CustomerAccount> custList = qry.getResultList();
		return custList;
	}

	public CustomerAccount getCustById(int custno) {
		CustomerAccount cp = entityManager.find(CustomerAccount.class, custno);
		if (cp == null) {
			throw new EntityNotFoundException("Can't find Artist for ID " + custno);
		}
		return cp;

		// String sql = "SELECT e FROM empRec e where e.empno=?";
		// Query qry = entityManager.createQuery(sql);
		// List<Employee> empList =qry.getResultList(); // return empList;

	}
//		  public Customer saveCustomer(Customer cust) { entityManager.persist(cust);
//	  return cust; }
//	 
//	  @Override
//	  
//	  @Transactional public String updateCustomer(Customer cust) {
//	  
//	  entityManager.merge(cust); return "Record Updated"; }

	@Override
	@Transactional
	public int addCustomer(CustomerAccount c) {
		System.out.println("Dao method called ");
		System.out.println("cust in dao" + c);
		entityManager.persist(c);
//		System.out.println("Record added");
		// entityManager.getTransaction().commit();
		return c.getCustomerid();
	}

}



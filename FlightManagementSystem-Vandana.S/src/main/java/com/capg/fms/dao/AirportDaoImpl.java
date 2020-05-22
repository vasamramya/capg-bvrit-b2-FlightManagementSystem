package com.capg.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.capg.fms.entity.AirportBean;
@Repository
@Transactional
public class AirportDaoImpl implements IAirportDao {
	@PersistenceContext
	EntityManager entitymanager;
	 /**
	 * @author Vandana:
	 * This method viewAllAirport will
	 * retrieve the details(object) of AirportBean
	 */

	@Override
	public  List<AirportBean>viewAllAirport() {
		Query query=entitymanager.createQuery("from AirportBean");
		List<AirportBean> bean=query.getResultList();
		return bean;
		}
	/**
	 * @author Vandana:
	 * @param airportName
	 *This method display the details from AirportBean present in 
	 *particular airportName
	 */
	@Override
	public AirportBean viewAirport(String airportCode) {
		// TODO Auto-generated method stub
		String query="from AirportBean  where AIRPORT_CODE='"+airportCode+"'";
		AirportBean bean=entitymanager.createQuery(query,AirportBean.class).getSingleResult();
		return bean;
	}

	
	

	

	

	

	

	
	

	
	
	}



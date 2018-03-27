package com.caps.beta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.caps.beta.utils.HibernateUtils;

import associations.many_to_many.Students_Bidirectional;
import associations.many_to_many.Students_Unidirectional;
import associations.many_to_many.Teacher;
import associations.many_to_many.Teacher_Bidirectional;
import associations.one_to_many.Bucket_Bidirectional;
import associations.one_to_many.IceCube;
import associations.one_to_many.Pencil;
import associations.one_to_many.PencilBox_UniDirectional;
import associations.one_to_one.User_OneToOneBidirectional;
import associations.one_to_one.VoterCard;

public class TestHibenate {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = HibernateUtils.getEMF();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
//		em.persist(Entity);
		
		em.getTransaction().commit();
		em.close();
	}
}










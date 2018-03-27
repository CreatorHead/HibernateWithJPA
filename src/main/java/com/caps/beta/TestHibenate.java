package com.caps.beta;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.caps.beta.utils.HibernateUtils;

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
		
		Bucket_Bidirectional bucket = new Bucket_Bidirectional();
		bucket.setBucket_id(1);
		bucket.setName("IceHolder");
		
		List<IceCube> list = new ArrayList<IceCube>();

		IceCube i1 = new IceCube();
		i1.setIceCubeId(101);
		i1.setSize("3");
		
		IceCube i2 = new IceCube();
		i2.setIceCubeId(102);
		i2.setSize("3");
		
		list.add(i1);
		list.add(i2);
		
		bucket.setIceCube(list);
		
		em.getTransaction().begin();
		
		em.persist(bucket);
		
		em.getTransaction().commit();
		em.close();
	}
}










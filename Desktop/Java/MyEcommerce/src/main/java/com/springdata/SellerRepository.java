package com.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface SellerRepository  extends JpaRepository <SellerEntity, String>{
	
	public List<SellerEntity> findByEmail(String email);
	
	public List<SellerEntity> findByEmailAndPassword(String email,String password);

//	@Transactional
//	@Modifying
//	@Query("UPDATE UsersEntity u SET u.pwd=?2 WHERE u.uid= ?1")
//	public void update(String users,String password);



}


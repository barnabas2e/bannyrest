package com.bannyrest.bannyrest.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.bannyrest.bannyrest.domain.Client;

@Mapper
public interface ClientMapper {

	@Select("SELECT id as id, first_name as firstName, last_name as lastName FROM client WHERE id = #{id}")
	Client selectOne(Integer pId);
	
	@Select("SELECT id as id, first_name as firstName, last_name as lastName FROM client")
	List<Client> findAll();
	
	@Insert("INSERT INTO client (first_name, last_name) VALUES (#{firstName}, #{lastName})")
	@SelectKey(keyProperty = "id", keyColumn = "id", before = true,
	 statement = "SELECT client_seq.nextVal as id from dual", resultType = Integer.class)
	void insertClient(Client pClient);
	
	List<Client> findByFirstName(String firstName);
}

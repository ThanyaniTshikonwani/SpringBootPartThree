package com.thanyani;


import com.thanyani.dao.UsersDao;
import com.thanyani.users.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootpartthreeApplicationTests {

	private UsersDao usersDaoTest;

	@Test
	void testUserCrud() {
		UUID id = UUID.randomUUID();
		Users thanyani = new Users(id,"Thanyani","Tshikonwani");

		Collection<Users> users = usersDaoTest.getUsers();
		assertThat(users)
				.contains((Users) users);

//		assertThat(usersDaoTest.upadateUserById(thanyani)).isEqualTo(1);

	}

}

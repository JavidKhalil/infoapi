package com.example.demo;

import com.example.demo.beans.Message;
import com.example.demo.config.MongoDBConnector;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	MongoDBConnector mongoDBConnector;

	@BeforeEach
	void initData(){
		Message message = new Message();
		mongoDBConnector.insert(message);
	}

	@AfterEach
	void clearData(){
		mongoDBConnector.deleteAll();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void loadAllMessages(){
		Mockito.when(mongoDBConnector.findAll()).thenReturn(Arrays.asList(new Message(), new Message()));
		Assert.assertEquals(2, mongoDBConnector.findAll().size());
	}


}

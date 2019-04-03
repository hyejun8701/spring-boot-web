/*
 * package com.example.demo;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Map;
 * 
 * import org.junit.Ignore; import org.junit.Test; import
 * org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.web.client.TestRestTemplate; import
 * org.springframework.core.ParameterizedTypeReference; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.example.demo.model.User;
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @SpringBootTest(classes = SpringBootWebApplication.class, webEnvironment =
 * SpringBootTest.WebEnvironment.RANDOM_PORT) public class RestAPITest {
 * 
 * @Autowired private TestRestTemplate restTemplate;
 * 
 * @Test @Ignore public void testGetUserById() { String url =
 * "http://localhost:8080/user/0"; User user = restTemplate.getForObject(url,
 * User.class); System.out.println("�����:" + user.getRegDate() + "," +
 * user.getUserId() + "," + user.getUname()); }
 * 
 * @Test public void testGetUsers() { String url = "http://localhost:8080/user";
 * ResponseEntity<Map<String, List<User>>> result = restTemplate .exchange(url,
 * HttpMethod.GET, null, new ParameterizedTypeReference<Map<String,
 * List<User>>>() { }); Map<String, List<User>> tempMap = result.getBody();
 * 
 * ArrayList<User> resultArr = (ArrayList<User>) tempMap.get("result"); for(User
 * user : resultArr) { System.out.println(user.getUname()); } }
 * 
 * }
 */
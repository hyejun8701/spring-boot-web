/*
 * package com.example.demo.controller;
 * 
 * import java.util.ArrayList; import java.util.Date; import java.util.HashMap;
 * import java.util.List;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.model.User;
 * 
 * @RestController public class UserController { private static List<User>
 * userList = new ArrayList<User>();
 * 
 * { userList.add(new User(1, "boot01", "boot01@test.com", "remine", new
 * Date())); userList.add(new User(2, "boot02", "boot02@test.com", "restart",
 * new Date())); userList.add(new User(3, "boot03", "boot03@test.com", "nine",
 * new Date())); userList.add(new User(4, "boot04", "boot04@test.com", "namu",
 * new Date())); }
 * 
 * @RequestMapping("/user/{userNo}") public ResponseEntity<User>
 * getUserInfo(@PathVariable int userNo) { User user = userList.get(userNo);
 * return new ResponseEntity(user, HttpStatus.OK); }
 * 
 * @RequestMapping("/user") public ResponseEntity<List<User>> getUserList() {
 * HashMap<String, Object> resultList = new HashMap(); resultList.put("result",
 * userList); return new ResponseEntity(resultList, HttpStatus.OK); } }
 */
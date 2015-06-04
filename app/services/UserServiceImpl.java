package services;


import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user) {
        int updated = jdbcTemplate.update("INSERT INTO User (id, name) VALUES (?, ?)", user.getId(), user.getName());
        System.out.println("Lines updated: "+updated);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> result = new ArrayList<User>();
        List<Map<String, Object>> listResult = jdbcTemplate.queryForList("select * from User");
        System.out.println("Number of elements: "+listResult.size());
        for (Map<String, Object> stringObjectMap : listResult) {
            User user = new User();
            user.setId((String) stringObjectMap.get("id"));
            user.setName((String) stringObjectMap.get("name"));
            result.add(user);
        }
        return result;
    }

}
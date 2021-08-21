package com.example.hemosoft.Services;

import com.example.hemosoft.Model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {


    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Mert",
                        "mert@gmail.com",
                        LocalDate.of(1999,  06,27 ),
                        22
                ));
    }
}

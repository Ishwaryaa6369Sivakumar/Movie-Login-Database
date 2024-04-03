package com.example.login.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.login.Model.User;
import com.example.login.Repositary.UserRepo;
@Service
public class UserService {
    @Autowired
    UserRepo ur;
    public User create(User u)
    {
        return ur.save(u);
    }
    public List<User> getAllDetails()
    {
        return ur.findAll();
    }
    public User getMe(String id)
    {
        return ur.findById(id).orElse(null);
    }
    public  boolean updateDetails(String id,User u)
    {
        if(this.getMe(id)==null)
        {
            return false;
        }
        try{
            ur.save(u);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteUser(String id)
    {
        if(this.getMe(id)==null)
        {
            return false;
        }
        ur.deleteById(id);
        return true;
    }
}
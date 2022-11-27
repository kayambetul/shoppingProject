package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.UserService;
import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import com.example.shoppingDemo.business.request.users.DeleteUserRequest;
import com.example.shoppingDemo.business.request.users.UpdateUserRequest;
import com.example.shoppingDemo.business.response.users.GetAllUserResponse;
import com.example.shoppingDemo.business.response.users.GeyByUserResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    @Override
    public Result add(CreateUserRequest createUserRequest) {
        return null;
    }

    @Override
    public Result update(UpdateUserRequest updateUserRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteUserRequest deleteUserRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllUserResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GeyByUserResponse> getById(int id) {
        return null;
    }
}
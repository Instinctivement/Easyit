package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.User;
import com.francketsonia.easyit.service.user.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@Tag(name = "user")
public class UserController {

    private final CreateUserService createUserService;
    private final ReadUserService readUserService;
    private final GetUserByIdService getUserByIdService;
    private final UpdateUserService updateUserService;
    private final DeleteUserService deleteUserService;

    @Operation(summary = "Create a new user", description = "Create a new user")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public User create(@RequestBody User user){
        return createUserService.saveUser(user);
    }

    @Operation(summary = "Get user list", description = "Get all user")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<User> read(){
        return readUserService.getAllUsers();
    }

    @Operation(summary = "Get one user", description = "Get one user by id")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read/{id}")
    public User readById(@PathVariable Long id){
        return getUserByIdService.getUserById(id);
    }

    @Operation(summary = "Modify a user", description = "Modify a user")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public User update(@PathVariable Long id, @RequestBody User user){
        return updateUserService.updateUser(id, user);
    }

    @Operation(summary = "Delete a user", description = "Delete a user")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteUserService.deleteUser(id);
    }
}

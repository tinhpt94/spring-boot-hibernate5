package com.tinhpt.dao;

import com.tinhpt.entity.User;

import java.util.List;

/**
 * Created by septechuser on 26/12/2016.
 */
public interface UserDAO {
    List<User> findAll();
}
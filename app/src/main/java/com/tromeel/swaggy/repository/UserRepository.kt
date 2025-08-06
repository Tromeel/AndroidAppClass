package com.tromeel.swaggy.repository

import com.tromeel.swaggy.data.UserDao
import com.tromeel.swaggy.model.User


class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}
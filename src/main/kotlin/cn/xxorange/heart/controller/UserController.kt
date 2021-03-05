package cn.xxorange.heart.controller

import cn.xxorange.heart.pojo.User
import cn.xxorange.heart.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController(
    private val userService: UserService
) {
    @GetMapping
    fun findAll(): MutableIterable<User> = userService.findAll()
}
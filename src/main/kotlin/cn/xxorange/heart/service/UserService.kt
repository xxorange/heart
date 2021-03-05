package cn.xxorange.heart.service

import cn.xxorange.heart.enum.Role
import cn.xxorange.heart.pojo.User
import cn.xxorange.heart.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    @Bean
    fun init() {
        val logger = LoggerFactory.getLogger(UserService::class.java)
        listOf(
            User(id = 1, password = "1", role = Role.Admin),
            User(id = 2, password = "2", role = Role.User)
        ).forEach { addOne(it) }
        logger.info("所有User👇")
        findAll().forEach { logger.info(it.toString()) }
        logger.info("删除一个之后👇")
        deleteOneById(1)
        findAll().forEach { logger.info(it.toString()) }


    }

    fun findAll(): MutableIterable<User> = userRepository.findAll()
    fun findById(id: Long) = userRepository.findById(id)
    fun addOne(user: User) = userRepository.save(user)
    fun deleteOneById(id: Long) = userRepository.deleteById(id)

    // TODO: 实现修改对象方法
    fun modifyOneById(id: Long, newUser: User) {
//        val found = findById(id).get()
//        newUser.
    }
}
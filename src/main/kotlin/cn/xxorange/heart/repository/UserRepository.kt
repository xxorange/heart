package cn.xxorange.heart.repository

import cn.xxorange.heart.pojo.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Long> {
}
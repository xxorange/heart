package cn.xxorange.heart.dto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class TestDto(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String,
    var password: String
)


package cn.xxorange.heart.pojo

import cn.xxorange.heart.enum.Gender
import cn.xxorange.heart.enum.Role
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    var password: String,
    @Enumerated(EnumType.ORDINAL)
//    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    var role: Role,
    var nickname: String? = null,
    var birthday: LocalDate? = null,
//    @ManyToOne(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @Enumerated(EnumType.ORDINAL)
    var gender: Gender? = Gender.Unknown,
    var description: String? = null,
) : Serializable

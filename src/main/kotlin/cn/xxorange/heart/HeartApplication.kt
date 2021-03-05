package cn.xxorange.heart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HeartApplication

fun main(args: Array<String>) {
    runApplication<HeartApplication>(*args)
}

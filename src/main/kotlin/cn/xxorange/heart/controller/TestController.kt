package cn.xxorange.heart.controller

import cn.xxorange.heart.dto.TestDto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("test")
class TestController {
    @GetMapping()
    fun get(): Map<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["msg"] = "Hello world"
        return result
    }

    /**
     * @param testDto `@requestBody`代表从body里面读取json数据，而不是`x-www-form-urlencoded`
     */
    @PostMapping
    fun post(@RequestBody testDto: TestDto): Map<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["dto"] = testDto
        result["msg"] = "Hello world"
        return result
    }

    /**
     * @param id `@PathVariable`代表从uri里面读取数据, 其中注意我们在`@PutMapping`中使用`{id}`
     */
    @PutMapping("{id}")
    fun put(@RequestBody testDto: TestDto, @PathVariable id: String): MutableMap<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["id"] = id
        result["dto"] = testDto.toString()
        result["msg"] = "Hello world"
        return result
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): MutableMap<String, Any> {
        val result = mutableMapOf<String, Any>()
        result["id"] = id
        result["msg"] = "Hello world"
        return result
    }
}
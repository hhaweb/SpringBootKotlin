package com.hha.controller

import com.hha.model.Message
import com.hha.service.HomeService
import com.hha.service.IHomeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(var homeService: IHomeService) {
    @GetMapping("hello")
    fun getIndex() = homeService.getMessage()
}
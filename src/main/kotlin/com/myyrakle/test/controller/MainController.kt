package com.myyrakle.test.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController
{
    @GetMapping("/")
    @ResponseBody
    fun index(): String
        = "붐!!!"
}
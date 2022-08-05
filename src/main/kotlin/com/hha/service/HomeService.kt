package com.hha.service

import com.hha.model.Message
import org.springframework.stereotype.Service

@Service
class HomeService:IHomeService {
    override fun getMessage() = Message("Hello From Service",200)
}
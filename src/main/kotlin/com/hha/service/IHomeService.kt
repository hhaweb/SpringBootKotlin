package com.hha.service

import com.hha.model.Message
import org.springframework.stereotype.Service

interface IHomeService {
    fun getMessage(): Message
}
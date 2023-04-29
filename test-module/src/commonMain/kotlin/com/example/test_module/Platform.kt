package com.example.test_module

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
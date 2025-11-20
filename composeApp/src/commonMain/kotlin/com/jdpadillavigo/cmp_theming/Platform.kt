package com.jdpadillavigo.cmp_theming

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
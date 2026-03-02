package com.okhotsk.questrpg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
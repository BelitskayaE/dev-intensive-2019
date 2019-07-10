package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.models.User

object Builder {
    fun id(value: String): String {
        return value
    }

    fun build(): User {
        return User(
            id=id()
    }
}
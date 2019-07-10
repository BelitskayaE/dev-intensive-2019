package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        if (fullName == " " || fullName == "") {
            firstName = null
            lastName = null

        }
        return Pair(firstName, lastName)
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        if (firstName.isNullOrBlank()) {
            return null
        }
        if (lastName.isNullOrBlank()) {
            return "${firstName[0]}"
        }

        return "${firstName[0]}${lastName[0]}"

    }
}




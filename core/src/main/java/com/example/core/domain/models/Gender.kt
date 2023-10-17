package com.example.core.domain.models

import java.util.Locale

sealed class Gender(val name: String) {
    object Male: Gender("male")
    object Female: Gender("memale")

    companion object {
        fun fromString(name: String): Gender {
            return when(name) {
                "male" -> Male
                "female" -> Female
                else -> Female
            }
        }
    }
}

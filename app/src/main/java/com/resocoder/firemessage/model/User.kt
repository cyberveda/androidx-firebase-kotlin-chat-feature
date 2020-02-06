package com.resocoder.firemessage.model


data class User(val name: String,
                val bio: String,
                val profilePicturePath: String?, // because profile picture is not set by default.
                val registrationTokens: MutableList<String>) {


    // because firestore needs a parameter less constructor.

    constructor(): this("", "", null, mutableListOf())
}
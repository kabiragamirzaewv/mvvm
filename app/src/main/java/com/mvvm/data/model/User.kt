package com.mvvm.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val name: String,
    @SerializedName("avatar_url")
    val avatar: String,
)
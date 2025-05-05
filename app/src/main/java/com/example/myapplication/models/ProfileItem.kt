package com.example.myapplication.models

data class ProfileItem (
    val avatar : String? = null,
    val title : String,
    val details: String ?= null,
    val time: String?=null
)
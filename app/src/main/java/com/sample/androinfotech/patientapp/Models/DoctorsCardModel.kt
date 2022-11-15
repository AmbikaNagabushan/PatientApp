package com.sample.androinfotech.patientapp.Models


class DoctorsCardModel ( private var doctor_image: Int,private var name: String,private var bio: String,) {

    // Getter and Setter
    fun getName(): String {
        return name
    }

    fun setTitle(name: String) {
        this.name = name
    }

    fun getImage(): Int {
        return doctor_image
    }

    fun setImage(doctor_image: Int) {
        this.doctor_image = doctor_image
    }
    fun getBio(): String {
        return bio
    }

    fun setBio(bio: String) {
        this.bio = bio
    }
}

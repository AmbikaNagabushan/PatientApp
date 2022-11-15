package com.sample.androinfotech.patientapp.Models


class HeaderCardModel ( private var header_image: Int,private var title: String) {

    // Getter and Setter
    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }


    fun getImage(): Int {
        return header_image
    }

    fun setImage(header_image: Int) {
        this.header_image = header_image
    }
}

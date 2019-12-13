package com.example.mocomanga

class Komik {
    var id: Int
    var image: Int
    var judul: String
    var tanggal: String
    var deskripsi: String
    var chapter: String

    constructor(
        id: Int = 0,
        image: Int = 0,
        judul: String = "",
        tanggal: String = "",
        deskripsi: String = "",
        chapter: String = ""
    ) {
        this.id = id
        this.image = image
        this.judul= judul
        this.tanggal= tanggal
        this.deskripsi= deskripsi
        this.chapter= chapter
    }
}

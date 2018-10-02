package tech.blur.bookcrossing.features.core.books.model

import java.util.*


class Book  {
    var id : Int? = null
    var label : String? = null
    var author : String? = null
    var owner : Int? = null
    var receiver : Int? = null
    var dateRes : Date? = null
    var dateCreate : Date? = null
    var genres: Array<Int>? = null

    constructor(id: Int?, label: String?,
                author: String?, owner: Int?,
                receiver: Int?, dateRes: Date?,
                dateCreate: Date?, genres: Array<Int>?) {
        this.id = id
        this.label = label
        this.author = author
        this.owner = owner
        this.receiver = receiver
        this.dateRes = dateRes
        this.dateCreate = dateCreate
        this.genres = genres
    }
    constructor()
}
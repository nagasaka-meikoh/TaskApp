package jp.techacademy.nagasaka.yasushi.taskapp

import java.io.Serializable
import java.util.Date
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Task : RealmObject(), Serializable {

    var title: String = ""
    var contents: String = ""
    var date: Date = Date()
    var category: String = ""

    @PrimaryKey
    var id: Int = 0
}
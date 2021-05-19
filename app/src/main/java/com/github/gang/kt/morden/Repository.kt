package com.github.gang.kt.morden

class Repository(repositoryName : String, var repositoryOwner: String?, var numberOfStars: Int?
                 , var hasIssues: Boolean = false) {

    var repositoryName : String = ""
        set(value) {
            field = value
        }

}

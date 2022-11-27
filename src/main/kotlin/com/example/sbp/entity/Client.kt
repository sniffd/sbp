package com.example.sbp.entity

import javax.persistence.*

@Entity
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var lastname: String? = null
    var firstname: String? = null
    var middlename: String? = null
    var phone: String? = null
    var bankName: String? = null
}
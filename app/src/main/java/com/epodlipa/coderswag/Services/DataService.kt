package com.epodlipa.coderswag.Services

import com.epodlipa.coderswag.Model.Category
import com.epodlipa.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("Trička", "shirtimage"),
        Category("Mikiny", "hoodieimage"),
        Category("Čiapky", "hatimage"),
        Category("Digitalne vecičky", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Pekná čiapka 1", "25€", "hat01" ),
        Product("Pekná čiapka 2", "25€", "hat02" ),
        Product("Pekná čiapka 3", "25€", "hat03" ),
        Product("Pekná čiapka 4", "25€", "hat04" )
    )

    val hoodies = listOf(
        Product("Cool mikina 1", "42€", "hoodie 01"),
        Product("Cool mikina 2", "42€", "hoodie 02"),
        Product("Cool mikina 3", "42€", "hoodie 03"),
        Product("Cool mikina 4", "42€", "hoodie 04")
    )

    val shirts = listOf(
        Product("Moderné tričko 1", "16,90€", "shirt01"),
        Product("Moderné tričko 2", "16,90€", "shirt02"),
        Product("Moderné tričko 3", "16,90€", "shirt03"),
        Product("Moderné tričko 4", "16,90€", "shirt04")
    )
}
package com.example.ktln2_less1.data.repository

import com.example.ktln2_less1.data.model.FirstModel

class CatRepository {

    private var catModelList = mutableListOf<FirstModel>()

    fun getListOfCatHTTP(): MutableList<FirstModel> {
        catModelList.clear()
        catModelList.add(FirstModel("https://http.cat/499", "Client Closed Request"))
        catModelList.add(FirstModel("https://http.cat/500", "Internal Server Error"))
        catModelList.add(FirstModel("https://http.cat/501", "Not Implemented"))
        catModelList.add(FirstModel("https://http.cat/502", "Bad Gateway"))
        catModelList.add(FirstModel("https://http.cat/503", "Service Unavailable"))
        catModelList.add(FirstModel("https://http.cat/504", "Gateway Timeout"))
        catModelList.add(FirstModel("https://http.cat/506", "Variant Also Negotiates"))
        catModelList.add(FirstModel("https://http.cat/507", "Insufficient Storage"))
        catModelList.add(FirstModel("https://http.cat/508", "Loop Detected"))
        catModelList.add(FirstModel("https://http.cat/509", "Bandwidth Limit Exceeded"))
        catModelList.add(FirstModel("https://http.cat/510", "Not Extended"))
        catModelList.add(FirstModel("https://http.cat/511", "Network Authentication Required"))
        catModelList.add(FirstModel("https://http.cat/521", "Web Server Is Down"))
        catModelList.add(FirstModel("https://http.cat/522", "Connection Timeout Out"))
        catModelList.add(FirstModel("https://http.cat/523", "Origin Is Unreachable"))
        catModelList.add(FirstModel("https://http.cat/525", "SSL Handshake Failed"))
        catModelList.add(FirstModel("https://http.cat/599", "Network Connect Timeout Error"))
        return catModelList
    }
}
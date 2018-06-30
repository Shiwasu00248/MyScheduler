package com.example.takuyaarata.myscheduler

import android.app.Application
import io.realm.Realm

class MyScheduleApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}
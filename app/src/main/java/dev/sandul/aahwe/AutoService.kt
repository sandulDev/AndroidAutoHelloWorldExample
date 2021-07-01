package dev.sandul.aahwe

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import android.content.Intent

import androidx.car.app.Screen


class AutoService : CarAppService() {
    override fun createHostValidator(): HostValidator  = HostValidator.ALLOW_ALL_HOSTS_VALIDATOR

    override fun onCreateSession(): Session {
        return object : Session() {
            override fun onCreateScreen(intent: Intent): Screen {
                return AutoScreen(carContext)
            }
        }
    }
}
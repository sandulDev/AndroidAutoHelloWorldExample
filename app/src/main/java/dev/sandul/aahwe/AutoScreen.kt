package dev.sandul.aahwe

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*


class AutoScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {

        val row = Row.Builder()
            .setTitle("Row Title")
            .addText("Row Text")
            .build()

        val pane = Pane.Builder().setLoading(false).addRow(row).build()

        return PaneTemplate.Builder(pane)
            .setTitle("Pane Template Title")
            .setHeaderAction(Action.APP_ICON)
            .build()
    }
}

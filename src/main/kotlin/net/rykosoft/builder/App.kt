package net.rykosoft.builder

import javax.swing.*

class App(title: String): JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {
        setTitle(title)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(640, 480)

    }
}

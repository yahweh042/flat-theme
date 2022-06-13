package org.example.theme.ui

import com.intellij.ide.ui.laf.darcula.ui.DarculaButtonUI
import com.intellij.util.ui.GraphicsUtil
import com.intellij.util.ui.JBInsets
import com.intellij.util.ui.JBUI
import java.awt.Graphics2D
import java.awt.Rectangle
import javax.swing.JComponent

class FlatButtonUI : DarculaButtonUI() {

    override fun paintDecorations(g: Graphics2D, c: JComponent): Boolean {

        val width = c.width
        val height = c.height
        val background = g.background

        val r = Rectangle(c.size)
        JBInsets.removeFrom(r, c.insets)

        val graph = GraphicsUtil.setupAAPainting(g)
        g.fillRoundRect(0, 0, width, height, JBUI.scale(1), JBUI.scale(1))

        graph.restore()

        return true
    }


}

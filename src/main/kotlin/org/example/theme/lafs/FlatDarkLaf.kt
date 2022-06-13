package org.example.theme.lafs

import com.intellij.ide.ui.laf.darcula.DarculaLaf
import org.example.theme.ui.FlatButtonUI
import javax.swing.UIDefaults

class FlatDarkLaf : DarculaLaf() {

    override fun getDefaults(): UIDefaults {
        val defaults = super.getDefaults()
        defaults["Default.ButtonUI"] = FlatButtonUI::class.java.name
        return defaults
    }

}

package org.example.theme

import com.intellij.ide.AppLifecycleListener
import org.example.theme.lafs.FlatDarkLaf
import javax.swing.UIManager

class ThemeManager : AppLifecycleListener {

    override fun appFrameCreated(commandLineArgs: MutableList<String>) {
        println(commandLineArgs)
        UIManager.setLookAndFeel(FlatDarkLaf())
    }

}

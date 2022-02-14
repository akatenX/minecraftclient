package me.akatenx.redclient.features.module.command.commands;

import me.akatenx.redclient.RedClient;
import me.akatenx.redclient.features.module.Module;
import me.akatenx.redclient.features.module.command.Command;

import java.util.Locale;

public class Toggle extends Command {
    public Toggle() {
        super("Toggle");
    }

    @Override
    public void onCommand() {
        try {
            for (Module m : RedClient.module.modules) {
                if (m.name.toLowerCase().equals(getArg(1).toLowerCase())) {
                    m.toggle();
                    return;
                }
            }
            sendMessage("no such module");
        } catch (Exception ex) {
            sendMessage("error");
        }
    }
}
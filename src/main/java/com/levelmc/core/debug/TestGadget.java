package com.levelmc.core.debug;

import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.TextFormat;
import com.levelmc.core.Core;
import com.levelmc.core.api.gadgets.BaseGadget;
import com.levelmc.core.api.item.ItemBuilder;

public class TestGadget extends BaseGadget {
    private static TestGadget instance = null;

    public static TestGadget getInstance() {
        if (instance == null) {
            instance = new TestGadget();
        }

        return instance;
    }

    protected TestGadget() {
        super("testGadget", ItemBuilder.of(ItemID.STICK).name("&7Test Gadget").lore("&7Nefariously Boring").item());
    }

    @Override
    public void onInteractEvent(PlayerInteractEvent e) {
        e.getPlayer().sendActionBar(TextFormat.colorize("&7B e a u t i f u l"));
    }
}
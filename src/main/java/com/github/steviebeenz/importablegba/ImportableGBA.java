package com.github.steviebeenz.importablegba;

import org.bukkit.scheduler.BukkitRunnable;
import java.util.List;
import java.util.ArrayList;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.entity.EntityType; 
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.*;
import org.bukkit.Location;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.scheduler.BukkitScheduler;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import java.util.concurrent.TimeUnit;

public class ImportableGBA {
    public static Block getBlockAsync(Location loc) {
        if (Bukkit.isPrimaryThread()) {
            return loc.getBlock();
        } else {
            if (loc.getWorld().isChunkLoaded(loc.getBlockX() >> 4, loc.getBlockZ() >> 4)) {
                return loc.getBlock();
            }
        }
        return null;
    }
}
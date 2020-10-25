package me.caraffa.loottable;

import me.caraffa.loottable.loottable.LootTable;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    public static LootTable LootTable;
    public static main instance;
    @Override
    public void onEnable() {
        this.getCommand("getrandom").setExecutor(new usage());
        createLootTable();
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void createLootTable(){
        LootTable = new LootTable.LootTableBuilder()
                .add(new ItemStack(Material.STICK), 3) // 3+1 = 4, 3/4=75% so 75% for stick and 25% for Paper
                .add(new ItemStack(Material.PAPER), 1)
                .build();
    }

    public static main getInstance(){
        return instance;
    }

}

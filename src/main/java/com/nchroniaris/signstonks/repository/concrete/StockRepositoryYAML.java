package com.nchroniaris.signstonks.repository.concrete;

import com.nchroniaris.signstonks.repository.StockRepository;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * YAML-based repository for storing {@link com.nchroniaris.mcstonks.stock.Stock} objects
 */
public class StockRepositoryYAML extends ConfigurationRepositoryYAML implements StockRepository {

    /**
     * Main constructor for the Stock repository
     *
     * @param plugin An instance of the main plugin
     */
    public StockRepositoryYAML(@NotNull JavaPlugin plugin) {

        super(plugin, plugin.getDataFolder().toPath().resolve("stocks.yml"));

    }

}

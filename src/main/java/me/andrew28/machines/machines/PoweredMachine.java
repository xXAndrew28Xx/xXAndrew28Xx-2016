package me.andrew28.machines.machines;

import org.bukkit.block.Block;

/**
 * @author Andrew Tran
 */
public interface PoweredMachine extends Machine{
    void onEnergyChange(Integer level, Block block);
}

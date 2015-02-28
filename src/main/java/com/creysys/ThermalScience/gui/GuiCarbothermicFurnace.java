package com.creysys.ThermalScience.gui;

import com.creysys.ThermalScience.container.ContainerCarbothermicFurnace;
import com.creysys.ThermalScience.tileEntity.TileEntityMachine;
import net.minecraft.entity.player.InventoryPlayer;

/**
 * Created by Creysys on 1/31/2015.
 */
public class GuiCarbothermicFurnace extends GuiMachine {
    public GuiCarbothermicFurnace(InventoryPlayer inventory, TileEntityMachine tileEntity) {
        super(inventory, tileEntity, "carbothermicFurnace.png", new ContainerCarbothermicFurnace(inventory, tileEntity));

        arrowX = 90;
        arrowY = 29;
        arrowWidth = 23;
        arrowHeight = 16;

        xSize = 175;
        ySize = 150;

        energyX = 8;
        energyY = 12;
    }

    @Override
    public String getName() {
        return "Carbothermic Furnace";
    }
}
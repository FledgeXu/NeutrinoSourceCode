package com.tutorial.neutrino.first_cap;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.util.LazyOptional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObsidianUpBlockTileEntity extends TileEntity implements ITickableTileEntity {
    public ObsidianUpBlockTileEntity() {
        super(TileEntityTypeRegistry.obsidianUpTileEntity.get());
    }

    private static Logger logger = LogManager.getLogger();

    @Override
    public void tick() {
        if (!world.isRemote) {
            BlockPos pos = this.pos.down();
            TileEntity tileEntity = world.getTileEntity(pos);
            if (tileEntity != null) {
                LazyOptional<ISimpleCapability> simpleCapabilityLazyOptional = tileEntity.getCapability(ModCapability.SIMPLE_CAPABILITY);
                simpleCapabilityLazyOptional.ifPresent((s) -> {
                    String context = s.getString(this.pos);
                    logger.info(context);
                });
            }
        }

    }
}

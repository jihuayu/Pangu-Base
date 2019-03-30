package cn.mccraft.pangu.base.world.gen;

import cn.mccraft.pangu.base.init.PBasicBlocks;
import cn.mccraft.pangu.core.loader.Load;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;


public class WorldGenListener {

    private final WorldGenerator WORLD_GEN_COPPER_ORE = new PGWorldGenMinable(12, 64, 16, 8, PBasicBlocks.COPPER_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_TIN_ORE = new PGWorldGenMinable(8, 64, 16, 8, PBasicBlocks.TIN_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_SILVER_ORE = new PGWorldGenMinable(4, 32, 16, 4, PBasicBlocks.SILVER_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_CINNABAR_ORE = new PGWorldGenMinable(4,48,32,4,PBasicBlocks.CINNABAR_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_JADE_ORE = new PGWorldGenMinable(4,64,32,3,PBasicBlocks.JADE_ORE.getDefaultState());

    @Load
    public static void initWorldGenListener() {
        MinecraftForge.ORE_GEN_BUS.register(new WorldGenListener());
    }

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event) {
        if (event.getWorld().provider.getDimension() == 0) {
            generateOre(event,WORLD_GEN_COPPER_ORE,WORLD_GEN_CINNABAR_ORE,WORLD_GEN_SILVER_ORE,WORLD_GEN_TIN_ORE,WORLD_GEN_JADE_ORE);
        }
    }
    private void generateOre(OreGenEvent.Post event,WorldGenerator...gens){
        for(WorldGenerator gen :gens){
            gen.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }
}

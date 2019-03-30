package cn.mccraft.pangu.base.init;

import cn.mccraft.pangu.core.item.PGItem;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab(value = "panguBase", asTabIcon = true)
public interface PBasicItems {

    @RegItem(value = {"copper", "ingot"}, oreDict = {"ingotCopper"})
    Item COPPER_INGOT = new PGItem();

    @RegItem(value = {"tin", "ingot"}, oreDict = {"ingotTin"})
    Item TIN_INGOT = new PGItem();

    @RegItem(value = {"bronze", "ingot"}, oreDict = {"ingotBronze"})
    Item BRONZE_INGOT = new PGItem();

    @RegItem(value = {"silver", "ingot"}, oreDict = {"ingotSilver"})
    Item SILVER_INGOT = new PGItem();

    @RegItem(value = {"copper", "powder"}, oreDict = {"powderCopper"})
    Item COPPER_ = new PGItem();

    @RegItem(value = {"tin", "powder"}, oreDict = {"powderTin"})
    Item TIN_POWDER = new PGItem();

    @RegItem(value = {"bronze", "powder"}, oreDict = {"powderBronze"})
    Item BRONZE_POEDER = new PGItem();

    @RegItem(value = {"silver", "powder"}, oreDict = {"powderSilver"})
    Item SILVER_POWDER = new PGItem();

    @RegItem(value = {"cinnabar", "powder"}, oreDict = {"powderCinnabar"})
    Item CINNABAR_POWDER = new PGItem();


}

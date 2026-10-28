package com.purplenetwork.invictus.datagen;

import com.purplenetwork.invictus.Invictus;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider { // Juste ne TOUCHES PAS à la datagen, sinon ban
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Invictus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        /*tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CAVE_BLOCK.get());*/
    }
}
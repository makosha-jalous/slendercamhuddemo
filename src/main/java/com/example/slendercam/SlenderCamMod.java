package com.example.slenderman;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SlenderCamMod {
    public static final String ID = "slenderman";

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ID);

    public static final RegistryObject<Item> CAMERA = ITEMS.register("camera",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<SoundEvent> STATIC_FAR = SOUNDS.register("static_far",
            () -> new SoundEvent(new ResourceLocation(ID, "static_far")));
    public static final RegistryObject<SoundEvent> STATIC_MID = SOUNDS.register("static_mid",
            () -> new SoundEvent(new ResourceLocation(ID, "static_mid")));
    public static final RegistryObject<SoundEvent> STATIC_RAGE = SOUNDS.register("static_rage",
            () -> new SoundEvent(new ResourceLocation(ID, "static_rage")));
    public static final RegistryObject<SoundEvent> TELEPORT = SOUNDS.register("teleport",
            () -> new SoundEvent(new ResourceLocation(ID, "teleport")));
    public static final RegistryObject<SoundEvent> BREATHING = SOUNDS.register("breathing",
            () -> new SoundEvent(new ResourceLocation(ID, "breathing")));
}
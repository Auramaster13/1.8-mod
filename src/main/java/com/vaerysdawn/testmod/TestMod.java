package com.vaerysdawn.testmod;

import com.vaerysdawn.testmod.proxy.IProxy;
import com.vaerysdawn.testmod.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TestMod
{

	@Mod.Instance(Reference.MOD_ID)
	public static TestMod instance;

	@SidedProxy(clientSide = "com.vaerysdawn.testmod.proxy.ClientProxy", serverSide = "com.vaerysdawn.testmod.proxy.ServerProxy")
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}

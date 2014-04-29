package colorblocks;

import java.io.File;

import colorblocks.colors.CbColorBlock;
import colorblocks.colors.CbColorItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid="ColorBlocks", name="ColorBlocks", version="1.1")
public class ColorBlocks {

	//modid = ColorBlocks
	public static final String modid = "ColorBlocks";
	
        // The instance of your mod that Forge uses.
        @Instance("ColorBlocks")
        public static ColorBlocks instance;
       
        //Color Blocks     
        public static Block CbBlack;
        public static Block CbMultiColor;
        public static Block CbBlue;
        public static Block CbBrown;
        public static Block CbCyan;
        public static Block CbDarkGreen;
        public static Block CbGreen;
        public static Block CbGrey;
        public static Block CbLightBlue;
        public static Block CbLightBrown;
        public static Block CbLightGrey;
        public static Block CbLightPurple;
        public static Block CbLimeGreen;
        public static Block CbMagenta;
        public static Block CbOrange;
        public static Block CbPink;
        public static Block CbPurple;
        public static Block CbRed;
        public static Block CbWhite;
        public static Block CbWineRed;
        public static Block CbYellow;
        public static Block CbRedOrange;
        public static Block CbLightOrange;
        public static Block CbWhitePink;
        public static Block CbSharpPink;
        public static Block CbLightPurpleBlue;
        public static Block CbPurpleBlue;
        public static Block CbBlueishWhite;
        public static Block CbLightCyan;
        public static Block CbGreenishCyan;
        public static Block CbYellowishGreen;
        public static Block CbLightYellow;
        public static Block CbLightOrangeRed;
        public static Block CbWhitePurple;
        public static Block CbDarkYellow;
        public static Block CbDarkCyan;
        public static Block CbDarkPurple;
        public static Block CbDarkBlueishCyan;
        public static Block CbDarkBrownishRed;
        public static Block CbDarkCyanishGreen;
        public static Block CbDarkBlue;
        public static Block CbDarkGrey;
        //Items 1.2
        public static Item CbWhiteDust;
        public static Item CbWhiteIngot;

        //Creative tab
        public static CreativeTabs colorblockTab = new CreativeTabs("colorblockTab"){
    		public Item getTabIconItem() {
    			return Item.getItemFromBlock(CbMultiColor);
    		}
    		
    	};

        @SidedProxy(clientSide="colorblocks.client.ClientProxy", serverSide="colorblocks.CommonProxy")
        public static CommonProxy proxy;
 
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {   
        	
        	//Defines Blocks in Minecraft
        	CbBlack = new CbColorBlock("Black");
    		CbMultiColor = new CbColorBlock("MultiColor");
    		CbBlue = new CbColorBlock("Blue");
    		CbBrown = new CbColorBlock("Brown");
    		CbCyan = new CbColorBlock("Cyan");
    		CbDarkGreen = new CbColorBlock("DarkGreen");
    		CbGreen = new CbColorBlock("Green");
    		CbGrey = new CbColorBlock("Grey");
    		CbLightBlue = new CbColorBlock("LightBlue");
    		CbLightBrown = new CbColorBlock("LightBrown");
    		CbLightGrey = new CbColorBlock("LightGrey");
			CbLightPurple = new CbColorBlock("LightPurple");
    		CbLimeGreen = new CbColorBlock("LimeGreen");
    		CbMagenta = new CbColorBlock("Magenta");
    		CbOrange = new CbColorBlock("Orange");
    		CbPink = new CbColorBlock("Pink");
    		CbPurple = new CbColorBlock("Purple");
    		CbRed = new CbColorBlock("Red");
    		CbWhite = new CbColorBlock("White");
    		CbWineRed = new CbColorBlock("WineRed");
    		CbYellow = new CbColorBlock("Yellow");
    		CbRedOrange = new CbColorBlock("RedOrange");
    		CbLightOrange = new CbColorBlock("LightOrange");
    		CbWhitePink = new CbColorBlock("WhitePink");
    		CbSharpPink = new CbColorBlock("SharpPink");
    		CbLightPurpleBlue = new CbColorBlock("LightPurpleBlue");
    		CbPurpleBlue = new CbColorBlock("PurpleBlue");
    		CbBlueishWhite = new CbColorBlock("BlueishWhite");
    		CbLightCyan = new CbColorBlock("LightCyan");
    		CbGreenishCyan = new CbColorBlock("GreenishCyan");
    		CbYellowishGreen = new CbColorBlock("YellowishGreen");
    		CbLightYellow = new CbColorBlock("LightYellow");
    		CbLightOrangeRed = new CbColorBlock("LightOrangeRed");
    		CbWhitePurple = new CbColorBlock("WhitePurple");
    		CbDarkYellow = new CbColorBlock("DarkYellow");
    		CbDarkCyan = new CbColorBlock("DarkCyan");
    		CbDarkPurple = new CbColorBlock("DarkPurple");
    		CbDarkBlueishCyan = new CbColorBlock("DarkBlueishCyan");
    		CbDarkBrownishRed = new CbColorBlock("DarkBrownishRed");
    		CbDarkCyanishGreen = new CbColorBlock("DarkCyanishGreen");
    		CbDarkBlue = new CbColorBlock("DarkBlue");
    		CbDarkGrey = new CbColorBlock("DarkGrey");

    		//Defines items in minecraft
    		CbWhiteDust = new CbColorItem().setUnlocalizedName("WhiteDust").setCreativeTab(colorblockTab).setTextureName(modid + ":" + "WhiteDust");
    		CbWhiteIngot = new CbColorItem().setUnlocalizedName("WhiteIngot").setCreativeTab(colorblockTab).setTextureName(modid + ":" + "WhiteIngot");

        	//Registers the blocks in minecraft
    		GameRegistry.registerBlock(CbBlack, "Black");
    		GameRegistry.registerBlock(CbMultiColor, "MultiColor");
    		GameRegistry.registerBlock(CbBlue, "Blue");
    		GameRegistry.registerBlock(CbBrown, "Brown");
    		GameRegistry.registerBlock(CbCyan, "Cyan");
    		GameRegistry.registerBlock(CbDarkGreen, "DarkGreen"); 		
    		GameRegistry.registerBlock(CbGreen, "Green");
    		GameRegistry.registerBlock(CbGrey, "Grey");
    		GameRegistry.registerBlock(CbLightBlue, "LightBlue");
    		GameRegistry.registerBlock(CbLightBrown, "LightBrown");
    		GameRegistry.registerBlock(CbLightGrey, "LightGrey");
    		GameRegistry.registerBlock(CbLightPurple, "LightPurple");
    		GameRegistry.registerBlock(CbLimeGreen, "LimeGreen");
    		GameRegistry.registerBlock(CbMagenta, "Magenta");
    		GameRegistry.registerBlock(CbOrange, "Orange");
    		GameRegistry.registerBlock(CbPink, "Pink");
    		GameRegistry.registerBlock(CbPurple, "Purple");
    		GameRegistry.registerBlock(CbRed, "Red");
    		GameRegistry.registerBlock(CbWhite, "White");
    		GameRegistry.registerBlock(CbWineRed, "WineRed");
    		GameRegistry.registerBlock(CbYellow, "Yellow");
    		GameRegistry.registerBlock(CbRedOrange, "RedOrange");
    		GameRegistry.registerBlock(CbLightOrange, "LightOrange");
    		GameRegistry.registerBlock(CbWhitePink, "WhitePink");
    		GameRegistry.registerBlock(CbSharpPink, "SharpPink");
    		GameRegistry.registerBlock(CbLightPurpleBlue, "LightPurpleBlue");
    		GameRegistry.registerBlock(CbPurpleBlue, "PurpleBlue");
    		GameRegistry.registerBlock(CbBlueishWhite, "BlueishWhite");
    		GameRegistry.registerBlock(CbLightCyan, "LightCyan");
    		GameRegistry.registerBlock(CbGreenishCyan, "GreenishCyan");
    		GameRegistry.registerBlock(CbYellowishGreen, "YellowishGreen");
    		GameRegistry.registerBlock(CbLightYellow, "LightYellow");
    		GameRegistry.registerBlock(CbLightOrangeRed, "LightOrangeRed");
    		GameRegistry.registerBlock(CbWhitePurple, "WhitePurple");
    		GameRegistry.registerBlock(CbDarkYellow, "DarkYellow");
    		GameRegistry.registerBlock(CbDarkCyan, "DarkCyan");
    		GameRegistry.registerBlock(CbDarkPurple, "DarkPurple");
    		GameRegistry.registerBlock(CbDarkBlueishCyan, "DarkBlueishCyan");
    		GameRegistry.registerBlock(CbDarkBrownishRed, "DarkBrownishRed");
    		GameRegistry.registerBlock(CbDarkCyanishGreen, "DarkCyanishGreen"); 
    		GameRegistry.registerBlock(CbDarkBlue, "DarkBlue"); 
    		GameRegistry.registerBlock(CbDarkGrey, "DarkGrey"); 
        		
        		//Registers items in Minecraft
    		GameRegistry.registerItem(CbWhiteDust, "WhiteDust"); 
    		GameRegistry.registerItem(CbWhiteIngot, "WhiteIngot"); 
    			
    		//Smelting Recipes
    			GameRegistry.addSmelting(CbWhiteDust, new ItemStack(CbWhiteIngot, 2), 0.1F);

    		
        	//Crafting Recipes

        	GameRegistry.addShapedRecipe(new ItemStack(CbWhiteDust, 32), new Object[] { "IOI", "OGO", "IOI", 'I', Items.iron_ingot, 'O', Blocks.obsidian, 'G', Blocks.glowstone });
        	GameRegistry.addShapedRecipe(new ItemStack(CbWhite, 4), new Object[] { "WW", "WW", 'W', CbWhiteIngot});
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBlack, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 0)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbRed, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 1)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbGreen, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 2)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBrown, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 3)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbBlue, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 4)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbPurple, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 5)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbCyan, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 6)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbLightGrey, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 7)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbGrey, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 8)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbPink, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 9)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbLimeGreen, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 10)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbYellow, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 11)  });
       		GameRegistry.addShapelessRecipe(new ItemStack(CbLightBlue, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 12)  });
       		GameRegistry.addShapelessRecipe(new ItemStack(CbMagenta, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 13)  });
        	GameRegistry.addShapelessRecipe(new ItemStack(CbOrange, 1), new Object[] { CbWhite, new ItemStack(Items.dye, 0, 14)  });
	
        }
        

		@EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                

        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        

        

}


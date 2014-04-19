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
       
        //Color Blocks  in V.1.0      
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
        //Color Blocks in V.1.1
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
        	
        	//Blocks
        	CbBlack = new CbColorBlock().setBlockName("CbBlack").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Black");
    		GameRegistry.registerBlock(CbBlack, "CbBlack");
    		CbMultiColor = new CbColorBlock().setBlockName("CbMultiColor").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "MultiColor");
    		GameRegistry.registerBlock(CbMultiColor, "CbMultiColor");
    		CbBlue = new CbColorBlock().setBlockName("CbBlue").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Blue");
    		GameRegistry.registerBlock(CbBlue, "CbBlue");
    		CbBrown = new CbColorBlock().setBlockName("CbBrown").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Brown");
    		GameRegistry.registerBlock(CbBrown, "CbBrown");
    		CbCyan = new CbColorBlock().setBlockName("CbCyan").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Cyan");
    		GameRegistry.registerBlock(CbCyan, "CbCyan");
    		CbDarkGreen = new CbColorBlock().setBlockName("CbDarkGreen").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkGreen");
    		GameRegistry.registerBlock(CbDarkGreen, "CbDarkGreen"); 		
    		CbGreen = new CbColorBlock().setBlockName("CbGreen").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Green");
    		GameRegistry.registerBlock(CbGreen, "CbGreen");
    		CbGrey = new CbColorBlock().setBlockName("CbGrey").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Grey");
    		GameRegistry.registerBlock(CbGrey, "CbGrey");
    		CbLightBlue = new CbColorBlock().setBlockName("CbLightBlue").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightBlue");
    		GameRegistry.registerBlock(CbLightBlue, "CbLightBlue");
    		CbLightBrown = new CbColorBlock().setBlockName("CbLightBrown").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightBrown");
    		GameRegistry.registerBlock(CbLightBrown, "CbLightBrown");
    		CbLightGrey = new CbColorBlock().setBlockName("CbLightGrey").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightGrey");
    		GameRegistry.registerBlock(CbLightGrey, "CbLightGrey");
    		
			CbLightPurple = new CbColorBlock().setBlockName("CbLightPurple").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightPurple");
    		GameRegistry.registerBlock(CbLightPurple, "CbLightPurple");
    		CbLimeGreen = new CbColorBlock().setBlockName("CbLimeGreen").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LimeGreen");
    		GameRegistry.registerBlock(CbLimeGreen, "CbLimeGreen");
    		CbMagenta = new CbColorBlock().setBlockName("CbMagenta").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Magenta");
    		GameRegistry.registerBlock(CbMagenta, "CbMagenta");
    		CbOrange = new CbColorBlock().setBlockName("CbOrange").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Orange");
    		GameRegistry.registerBlock(CbOrange, "CbOrange");
    		CbPink = new CbColorBlock().setBlockName("CbPink").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Pink");
    		GameRegistry.registerBlock(CbPink, "CbPink");
    		CbPurple = new CbColorBlock().setBlockName("CbPurple").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Purple");
    		GameRegistry.registerBlock(CbPurple, "CbPurple");
    		CbRed = new CbColorBlock().setBlockName("CbRed").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Red");
    		GameRegistry.registerBlock(CbRed, "CbRed");
    		CbWhite = new CbColorBlock().setBlockName("CbWhite").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "White");
    		GameRegistry.registerBlock(CbWhite, "CbWhite");
    		CbWineRed = new CbColorBlock().setBlockName("CbWineRed").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "WineRed");
    		GameRegistry.registerBlock(CbWineRed, "CbWineRed");
    		CbYellow = new CbColorBlock().setBlockName("CbYellow").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "Yellow");
    		GameRegistry.registerBlock(CbYellow, "CbYellow");
    		CbRedOrange = new CbColorBlock().setBlockName("CbRedOrange").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "RedOrange");
    		GameRegistry.registerBlock(CbRedOrange, "CbRedOrange");
    		CbLightOrange = new CbColorBlock().setBlockName("CbLightOrange").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightOrange");
    		GameRegistry.registerBlock(CbLightOrange, "CbLightOrange");
    		CbWhitePink = new CbColorBlock().setBlockName("CbWhitePink").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "WhitePink");
    		GameRegistry.registerBlock(CbWhitePink, "CbWhitePink");
    		CbSharpPink = new CbColorBlock().setBlockName("CbSharpPink").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "SharpPink");
    		GameRegistry.registerBlock(CbSharpPink, "CbSharpPink");
    		CbLightPurpleBlue = new CbColorBlock().setBlockName("CbLightPurpleBlue").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightPurpleBlue");
    		GameRegistry.registerBlock(CbLightPurpleBlue, "CbLightPurpleBlue");
    		CbPurpleBlue = new CbColorBlock().setBlockName("CbPurpleBlue").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "PurpleBlue");
    		GameRegistry.registerBlock(CbPurpleBlue, "CbPurpleBlue");
    		CbBlueishWhite = new CbColorBlock().setBlockName("CbBlueishWhite").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "BlueishWhite");
    		GameRegistry.registerBlock(CbBlueishWhite, "CbBlueishWhite");
    		CbLightCyan = new CbColorBlock().setBlockName("CbLightCyan").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightCyan");
    		GameRegistry.registerBlock(CbLightCyan, "CbLightCyan");
    		CbGreenishCyan = new CbColorBlock().setBlockName("CbGreenishCyan").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "GreenishCyan");
    		GameRegistry.registerBlock(CbGreenishCyan, "CbGreenishCyan");
    		CbYellowishGreen = new CbColorBlock().setBlockName("CbYellowishGreen").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "YellowishGreen");
    		GameRegistry.registerBlock(CbYellowishGreen, "CbYellowishGreen");
    		CbLightYellow = new CbColorBlock().setBlockName("CbLightYellow").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightYellow");
    		GameRegistry.registerBlock(CbLightYellow, "CbLightYellow");
    		CbLightOrangeRed = new CbColorBlock().setBlockName("CbLightOrangeRed").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "LightOrangeRed");
    		GameRegistry.registerBlock(CbLightOrangeRed, "CbLightOrangeRed");
    		CbWhitePurple = new CbColorBlock().setBlockName("CbWhitePurple").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "WhitePurple");
    		GameRegistry.registerBlock(CbWhitePurple, "CbWhitePurple");
    		CbDarkYellow = new CbColorBlock().setBlockName("CbDarkYellow").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkYellow");
    		GameRegistry.registerBlock(CbDarkYellow, "CbDarkYellow");
    		CbDarkCyan = new CbColorBlock().setBlockName("CbDarkCyan").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkCyan");
    		GameRegistry.registerBlock(CbDarkCyan, "CbDarkCyan");
    		CbDarkPurple = new CbColorBlock().setBlockName("CbDarkPurple").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkPurple");
    		GameRegistry.registerBlock(CbDarkPurple, "CbDarkPurple");
    		CbDarkBlueishCyan = new CbColorBlock().setBlockName("CbDarkBlueishCyan").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkBlueishCyan");
    		GameRegistry.registerBlock(CbDarkBlueishCyan, "CbDarkBlueishCyan");
    		CbDarkBrownishRed = new CbColorBlock().setBlockName("CbDarkBrownishRed").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkBrownishRed");
    		GameRegistry.registerBlock(CbDarkBrownishRed, "CbDarkBrownishRed");
    		CbDarkCyanishGreen = new CbColorBlock().setBlockName("CbDarkCyanishGreen").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkCyanishGreen");
    		GameRegistry.registerBlock(CbDarkCyanishGreen, "CbDarkCyanishGreen"); 
    		CbDarkBlue = new CbColorBlock().setBlockName("CbDarkBlue").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkBlue");
    		GameRegistry.registerBlock(CbDarkBlue, "CbDarkBlue"); 
    		CbDarkGrey = new CbColorBlock().setBlockName("CbDarkGrey").setCreativeTab(colorblockTab).setBlockTextureName(modid + ":" + "DarkGrey");
    		GameRegistry.registerBlock(CbDarkGrey, "CbDarkGrey"); 
        		
        		//Items
    			CbWhiteDust = new CbColorItem().setUnlocalizedName("CbWhiteDust").setCreativeTab(colorblockTab).setTextureName(modid + ":" + "WhiteDust");
    			GameRegistry.registerItem(CbWhiteDust, "CbWhiteDust"); 
    			CbWhiteIngot = new CbColorItem().setUnlocalizedName("CbWhiteIngot").setCreativeTab(colorblockTab).setTextureName(modid + ":" + "WhiteIngot");
    			GameRegistry.registerItem(CbWhiteIngot, "CbWhiteIngot"); 

        		//Recipes

        		GameRegistry.addShapedRecipe(new ItemStack(CbWhiteDust, 32), new Object[] { "IOI", "OGO", "IOI", 'I', Items.iron_ingot, 'O', Blocks.obsidian, 'G', Blocks.glowstone });
        		GameRegistry.addSmelting(CbWhiteDust, new ItemStack(CbWhiteIngot, 2), 0.1F);
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


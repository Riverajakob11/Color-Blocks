package colorblocks.blocks;

import java.io.FileNotFoundException;

import colorblocks.ColorBlocks;
import coloredlightscore.src.api.CLApi;
import cpw.mods.fml.common.LoaderException;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class CbColorBlock extends Block
{

	private int color;


	public CbColorBlock(String string, CreativeTabs creative, int colorcode){
		super(Material.wood);
		color = colorcode;
		this.setLightLevel(1F);
		this.setCreativeTab(creative);
		this.setResistance(50F);
		this.setHardness(0.1F);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockName("Cb" + string);
		this.setBlockTextureName(ColorBlocks.modid + ":" + "White");
		}

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return color;
    }
    
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        return color;
    }
    
}




package colorblocks.blocks;

import colorblocks.ColorBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class CbColorBlock extends Block
{


	public CbColorBlock(String string, CreativeTabs creative) {
		super(Material.wood);
		setCreativeTab(creative);
		setResistance(50F);
		setHardness(0.1F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1F);
		setBlockName("Cb" + string);
		setBlockTextureName(ColorBlocks.modid + ":" + string);

		
	}


}

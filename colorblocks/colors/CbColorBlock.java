package colorblocks.colors;

import colorblocks.ColorBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class CbColorBlock extends Block 
{


	public CbColorBlock() {
		super(Material.wood);
		setResistance(50F);
		setHardness(0.1F);
		setStepSound(Block.soundTypeStone);
		setLightLevel(1F);

		
	}


}

package MTR;

import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockStationNameH extends BlockStationNameBase {

	private static final String name = "BlockStationNameWKS";

	protected BlockStationNameH() {
		super();
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
	}

	@Override
	public int damageDropped(IBlockState arg0) {
		return 7;
	}

	public static String getName() {
		return name;
	}
}
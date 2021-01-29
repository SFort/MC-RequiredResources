package tf.ssf.sfort.mixin;

import net.minecraft.resource.ResourcePackProfile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ResourcePackProfile.class)
public abstract class Resource {
    @Shadow
    private final boolean alwaysEnabled = true;
}

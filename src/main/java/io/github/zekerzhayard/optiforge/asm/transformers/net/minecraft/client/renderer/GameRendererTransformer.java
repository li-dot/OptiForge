package io.github.zekerzhayard.optiforge.asm.transformers.net.minecraft.client.renderer;

import io.github.zekerzhayard.optiforge.asm.transformers.ITransformer;
import io.github.zekerzhayard.optiforge.asm.utils.ASMUtils;
import org.objectweb.asm.tree.ClassNode;

public class GameRendererTransformer implements ITransformer {
    @Override
    public boolean isTargetClass(String className) {
        return className.equals("net.minecraft.client.renderer.GameRenderer");
    }

    @Override
    public ClassNode postTransform(ClassNode cn, String mixinClassName) {
        ASMUtils.replaceRedirectSurrogateMethod(cn, mixinClassName);
        return cn;
    }
}
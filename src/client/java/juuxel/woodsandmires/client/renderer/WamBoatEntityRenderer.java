package juuxel.woodsandmires.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import juuxel.woodsandmires.entity.WamBoat;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import java.util.Map;

public final class WamBoatEntityRenderer extends BoatEntityRenderer {
    public WamBoatEntityRenderer(EntityRendererFactory.Context context, boolean chest, WamBoat boatData) {
        super(context, null);
        var id = boatData.id();
        var texture = Identifier.of(id.getNamespace(), "textures/entity/" + (chest ? "chest_boat/" : "boat/") + id.getPath() + ".png");
        var rootPart = context.getPart(getModelLayer(boatData, chest));
    }

    public static EntityModelLayer getModelLayer(WamBoat boat, boolean chest) {
        var id = boat.id();
        return new EntityModelLayer(Identifier.of(id.getNamespace(), (chest ? "chest_boat/" : "boat/") + id.getPath()), "main");
    }
}

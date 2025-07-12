package net.fenrir.protoos.datagen;

import net.fenrir.protoos.ProtoOS;
import net.fenrir.protoos.item.ModGemstones;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLangProvider extends LanguageProvider
{
    public ModLangProvider(PackOutput output, String locale)
    {
        super(output, ProtoOS.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        addAllModItems();
    }

    public void addGemstone(Supplier<? extends Item> gemstoneItem, String displayName)
    {
        String translationKey = gemstoneItem.get().getDescriptionId();
        add(translationKey, displayName);
    }

    public void addAllModItems()
    {
        ForgeRegistries.ITEMS.getEntries().stream()
                .filter(entry -> entry.getKey().location().getNamespace().equals("protoos"))
                .forEach(entry ->
                {
                    Item item = entry.getValue();
                    String registryName = entry.getKey().location().getPath();
                    String displayName = formatDisplayName(registryName);
                    add(item.getDescriptionId(), displayName);
                });
    }

    private String formatDisplayName(String registryName)
    {
        return Arrays.stream(registryName.split("_"))
                .map(word ->
                {
                    String[] parts = word.split("(?=\\p{Upper})");
                    return Arrays.stream(parts)
                            .filter(part -> !part.isEmpty())
                            .map(part -> part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase())
                            .collect(Collectors.joining(" "));
                })
                .collect(Collectors.joining(" "));
    }
}

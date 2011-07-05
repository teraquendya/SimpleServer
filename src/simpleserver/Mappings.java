package simpleserver;

import java.util.Map;

public class Mappings {
	public static final Map<String, Integer> itemMap = new TreeMap<String, Integer>(){
        {
			put("air", 0 );
			put("stone", 1 );
			put("grass", 2 );
			put("dirt", 3 );
			put("cobblestone", 4 );
			put("wooden_plank", 5 );
			put("sapling", 6 );
			put("redwood_sapling", 6:1 );
			put("birch_sapling", 6:2 );
			put("bedrock", 7 );
			put("water", 8 );
			put("stationary_water", 9 );
			put("lava", 10 );
			put("stationary_lava", 11 );
			put("sand", 12 );
			put("gravel", 13 );
			put("gold_ore", 14 );
			put("iron_ore", 15 );
			put("coal_ore", 16 );
			put("wood", 17 );
			put("redwood", 17:1 );
			put("birchwood", 17:2 );
			put("leaves", 18 );
			put("redwood_leaves", 18:1 );
			put("birchwood_leaves", 18:2 );
			put("sponge", 19 );
			put("glass", 20 );
			put("lapis_lazuli_ore", 21 );
			put("lapis_lazuli_block", 22 );
			put("dispenser", 23 );
			put("sandstone", 24 );
			put("note_block", 25 );
			put("bed_block", 26 );
			put("powered_rail", 27 );
			put("detector_rail", 28 );
			put("sticky_piston", 29 );
			put("web", 30 );
			put("dead_shrub", 31 );
			put("tall_grass", 31:1 );
			put("live_shrub", 31:2 );
			put("dead_shrub", 32 );
			put("piston", 33 );
			put("piston_head", 34 );
			put("white_wool", 35 );
			put("orange_wool", 35:1 );
			put("magenta_wool", 35:2 );
			put("light_blue_wool", 35:3 );
			put("yellow_wool", 35:4 );
			put("light_green_wool", 35:5 );
			put("pink_wool", 35:6 );
			put("gray_wool", 35:7 );
			put("light_gray_wool", 35:8 );
			put("cyan_wool", 35:9 );
			put("purple_wool", 35:10 );
			put("blue_wool", 35:11 );
			put("brown_wool", 35:12 );
			put("dark_green_wool", 35:13 );
			put("red_wool", 35:14 );
			put("black_wool", 35:15 );
			put("yellow_flower", 37 );
			put("red_rose", 38 );
			put("brown_mushroom", 39 );
			put("red_mushroom", 40 );
			put("gold_block", 41 );
			put("iron_block", 42 );
			put("double_stone_slab", 43 );
			put("double_sandstone_slab", 43:1 );
			put("double_wooden_slab", 43:2 );
			put("double_cobblestone_slab", 43:3 );
			put("stone_slab", 44 );
			put("sandstone_slab", 44:1 );
			put("wooden_slab", 44:2 );
			put("cobblestone_slab", 44:3 );
			put("brick", 45 );
			put("tnt", 46 );
			put("bookshelf", 47 );
			put("mossy_cobblestone", 48 );
			put("obsidian", 49 );
			put("torch", 50 );
			put("fire", 51 );
			put("monster_spawner", 52 );
			put("wooden_stairs", 53 );
			put("chest", 54 );
			put("redstone_wire", 55 );
			put("diamond_ore", 56 );
			put("diamond_block", 57 );
			put("workbench", 58 );
			put("crops", 59 );
			put("soil", 60 );
			put("furnace", 61 );
			put("burning_furnace", 62 );
			put("sign_post", 63 );
			put("wooden_door", 64 );
			put("ladder", 65 );
			put("rails", 66 );
			put("cobblestone_stairs", 67 );
			put("wall_sign", 68 );
			put("lever", 69 );
			put("stone_pressure_plate", 70 );
			put("iron_door", 71 );
			put("wooden_pressure_plate", 72 );
			put("redstone_ore", 73 );
			put("glowing_redstone_ore", 74 );
			put("redstone_torch_(off)", 75 );
			put("redstone_torch_(on)", 76 );
			put("stone_button", 77 );
			put("snow", 78 );
			put("ice", 79 );
			put("snow_block", 80 );
			put("cactus", 81 );
			put("clay", 82 );
			put("sugar_cane", 83 );
			put("jukebox", 84 );
			put("fence", 85 );
			put("pumpkin", 86 );
			put("netherrack", 87 );
			put("soul_sand", 88 );
			put("glowstone", 89 );
			put("portal", 90 );
			put("jack-o-lantern", 91 );
			put("cake_block", 92 );
			put("redstone_repeater_block_(off)", 93 );
			put("redstone_repeater_block_(on)", 94 );
			put("locked_chest", 95 );
			put("trapdoor", 96 );
			put("iron_shovel", 256 );
			put("iron_pickaxe", 257 );
			put("iron_axe", 258 );
			put("flint_and_steel", 259 );
			put("apple", 260 );
			put("bow", 261 );
			put("arrow", 262 );
			put("coal", 263 );
			put("charcoal", 263:1 );
			put("diamond", 264 );
			put("iron_ingot", 265 );
			put("gold_ingot", 266 );
			put("iron_sword", 267 );
			put("wooden_sword", 268 );
			put("wooden_shovel", 269 );
			put("wooden_pickaxe", 270 );
			put("wooden_axe", 271 );
			put("stone_sword", 272 );
			put("stone_shovel", 273 );
			put("stone_pickaxe", 274 );
			put("stone_axe", 275 );
			put("diamond_sword", 276 );
			put("diamond_shovel", 277 );
			put("diamond_pickaxe", 278 );
			put("diamond_axe", 279 );
			put("stick", 280 );
			put("bowl", 281 );
			put("mushroom_soup", 282 );
			put("gold_sword", 283 );
			put("gold_shovel", 284 );
			put("gold_pickaxe", 285 );
			put("gold_axe", 286 );
			put("string", 287 );
			put("feather", 288 );
			put("sulphur", 289 );
			put("wooden_hoe", 290 );
			put("stone_hoe", 291 );
			put("iron_hoe", 292 );
			put("diamond_hoe", 293 );
			put("gold_hoe", 294 );
			put("seeds", 295 );
			put("wheat", 296 );
			put("bread", 297 );
			put("leather_helmet", 298 );
			put("leather_chestplate", 299 );
			put("leather_leggings", 300 );
			put("leather_boots", 301 );
			put("chainmail_helmet", 302 );
			put("chainmail_chestplate", 303 );
			put("chainmail_leggings", 304 );
			put("chainmail_boots", 305 );
			put("iron_helmet", 306 );
			put("iron_chestplate", 307 );
			put("iron_leggings", 308 );
			put("iron_boots", 309 );
			put("diamond_helmet", 310 );
			put("diamond_chestplate", 311 );
			put("diamond_leggings", 312 );
			put("diamond_boots", 313 );
			put("gold_helmet", 314 );
			put("gold_chestplate", 315 );
			put("gold_leggings", 316 );
			put("gold_boots", 317 );
			put("flint", 318 );
			put("raw_porkchop", 319 );
			put("cooked_porkchop", 320 );
			put("painting", 321 );
			put("golden_apple", 322 );
			put("sign", 323 );
			put("wooden_door", 324 );
			put("bucket", 325 );
			put("water_bucket", 326 );
			put("lava_bucket", 327 );
			put("minecart", 328 );
			put("saddle", 329 );
			put("iron_door", 330 );
			put("redstone", 331 );
			put("snowball", 332 );
			put("boat", 333 );
			put("leather", 334 );
			put("milk_bucket", 335 );
			put("clay_brick", 336 );
			put("clay_balls", 337 );
			put("sugarcane", 338 );
			put("paper", 339 );
			put("book", 340 );
			put("slimeball", 341 );
			put("storage_minecart", 342 );
			put("powered_minecart", 343 );
			put("egg", 344 );
			put("compass", 345 );
			put("fishing_rod", 346 );
			put("clock", 347 );
			put("glowstone_dust", 348 );
			put("raw_fish", 349 );
			put("cooked_fish", 350 );
			put("ink_sack", 351 );
			put("rose_red", 351:1 );
			put("cactus_green", 351:2 );
			put("coco_beans", 351:3 );
			put("lapis_lazuli", 351:4 );
			put("purple_dye", 351:5 );
			put("cyan_dye", 351:6 );
			put("light_gray_dye", 351:7 );
			put("gray_dye", 351:8 );
			put("pink_dye", 351:9 );
			put("lime_dye", 351:10 );
			put("dandelion_yellow", 351:11 );
			put("light_blue_dye", 351:12 );
			put("magenta_dye", 351:13 );
			put("orange_dye", 351:14 );
			put("bone_meal", 351:15 );
			put("bone", 352 );
			put("sugar", 353 );
			put("cake", 354 );
			put("bed", 355 );
			put("redstone_repeater", 356 );
			put("cookie", 357 );
			put("map", 358 );
			put("shears", 359 );
			put("gold_music_disc", 2256 );
			put("green_music_disc", 2257 );
        }
    };
}

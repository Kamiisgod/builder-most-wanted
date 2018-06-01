package builder.lang

object english extends Translation {
  override val mapping: Map[String, String] = Map(
    "ui.mastery" -> "屬性",
    "ui.battle" -> "戰鬥",
    "ui.secondary" -> "輔助",
    "ui.characteristics" -> "能力",
    "ui.appearance" -> "外觀",
    "ui.gear" -> "裝備",
    "ui.skills" -> "技能",
    "ui.spells" -> "咒語",
    "ui.item_name" -> "名稱",
    "ui.item_type" -> "種類",
    "ui.item_effects" -> "效果",
    "ui.item_rarity" -> "稀有度",
    "ui.item_level" -> "等級",
    "ui.search" -> "搜尋",
    "ui.loading" -> "載入中",
    "ui.equip" -> "裝備",
    "ui.equip_left" -> "裝備在左處",
    "ui.equip_right" -> "裝備在右處",
    "ui.update" -> "更新",
    "ui.unequip" -> "移除裝備",
    "ui.pick_elements" -> "選擇元素 !",
    "ui.second_relic" -> "無法裝備另一個遺物 !",
    "ui.second_epic" -> "無法裝備另一個史詩 !",
    "ui.level_short" -> "Lvl.",
    "ui.any" -> "任意",
    "ui.points_to_distribute" -> "待分配點數",
    "ui.add" -> "增加",
    "ui.custom_effects" -> "自定義點數",
    "ui.nation" -> "國家",
    "ui.hairstyle" -> "髮型",
    "ui.body" -> "身體種類",
    "ui.pick_hair_color" -> "頭髮",
    "ui.pick_skin_color" -> "皮膚",
    "ui.pick_pupil_color" -> "瞳孔",
    "ui.search_no_results" -> "查無項目 !",
    "ui.undefined_item" -> "未定義項目",
    "ui.undefined_rarity" -> "未定義稀有度",
    "ui.shift_tip" -> "按住 Shift 可一次增加 10",
    "ui.elemental_bonuses_tip" -> "依照等級，表格包含了任務的元素屬性加成",
    "ui.remove" -> "移除",
    "ui.generate_link" -> "產生連結",
    "ui.get_build_from_url" -> "從連結載入配裝",
    "ui.align_masteries" -> "同步屬性",
    "ui.align_resists" -> "同步抗性",
    "ui.intelligence" -> "智慧",
    "ui.strength" -> "力量",
    "ui.agility" -> "敏捷",
    "ui.chance" -> "幸運",
    "ui.major" -> "核心",
    "ui.allow_multiple" -> "可裝備多數遺物/史詩 (給幻魔使用)",
    "ui.pick_guild_color1" -> "公會 1",
    "ui.pick_guild_color2" -> "公會 2",
    "ui.apply_nation_bonus" -> "全部國家加成",
    "ui.apply_guild_bonus" -> "全部公會和領地加成",
    "ui.no_filter" -> "無過濾",
    "charac.no_filter" -> "無過濾",
    "ui.selected" -> "已選擇",
    "ui.options_selected" -> "選項已選擇",
    "ui.clear" -> "清除",
    "ui.normal" -> "正常",
    "ui.critical" -> "爆擊",
    "ui.conditions" -> "條件",
    "ui.base" -> "基本",
    "ui.preview" -> "預覽",
    "ui.preview_settings" -> "預覽設定",
    "ui.distance" -> "遠程",
    "ui.melee" -> "近戰",
    "ui.backstab" -> "背刺",
    "ui.berserk" -> "狂暴",
    "ui.resist" -> "抗性",
    "ui.active_skills" -> "主動技能",
    "ui.passive_skills" -> "被動技能",
    "ui.code_deck" -> "代碼組合",
    "ui.actives" -> "主動",
    "ui.passives" -> "被動",
    "ui.elemental_spells" -> "元素技能",
    "ui.support_spells" -> "支援技能",
    "ui.copied_deck_code" -> "已複製代碼",
    "ui.invalid_deck_code" -> "無效的代碼 !",
    "ui.applied_deck_code" -> "已套用代碼 !",
    "ui.on_equip" -> "裝備時",
    "ui.on_use" -> "使用時",
    "ui.use_per_turn" -> "次在一回合",
    "ui.use_per_target" -> "次使用在每個目標上",
    "ui.effect_warning" -> "這個技能的效果還沒完全實裝",
    "ui.include_beta" -> "包含 Beta 道具",
    "ui.only_best_craft" -> "只搜尋最高稀有度的裝備",
    "ui.back" -> "後退",
    "ui.insert" -> "插入",
    "ui.pick_a_slot" -> "選擇一個位置",
    "ui.use" -> "使用",
    "ui.deck" -> "頁面",
    "ui.none" -> "無",
    "ui.points" -> "點數",
    "ui.class" -> "職業",
    "ui.element_priority" -> "元素優先",
    "ui.sex" -> "性別",
    "ui.share" -> "分享",
    "sex.male" -> "男",
    "sex.female" -> "女",
    "element.fire" -> "火",
    "element.water" -> "水",
    "element.earth" -> "土",
    "element.air" -> "風",
    "nation.amakna" -> "阿瑪克納",
    "nation.bonta" -> "邦塔",
    "nation.brakmar" -> "布拉克瑪",
    "nation.sufokia" -> "薩弗基亞",
    "nation.riktus" -> "匪之國",
    "class.feca" -> "守護者",
    "class.osa" -> "唤獸師",
    "class.enu" -> "寶藏獵人",
    "class.sram" -> "刺客",
    "class.xelor" -> "時間法師",
    "class.eca" -> "幸運貓",
    "class.eni" -> "治癒者",
    "class.iop" -> "騎士",
    "class.cra" -> "弓箭手",
    "class.sadi" -> "植物術士",
    "class.sac" -> "狂戰士",
    "class.panda" -> "雄貓武僧",
    "class.rogue" -> "盜賊",
    "class.masq" -> "薩滿",
    "class.fog" -> "蒸汽行者",
    "class.elio" -> "異度旅者",
    "class.hupper" -> "元素法師",
    "class.ouginak" -> "犬族",
    "charac.hp" -> "生命",
    "charac.armor" -> "護甲",
    "charac.%_hp" -> "% 生命",
    "charac.ap" -> "行動力",
    "charac.minus_ap" -> "負向行動力",
    "charac.mp" -> "移動力",
    "charac.minus_mp" -> "負向移動力",
    "charac.wp" -> "創生",
    "charac.minus_wp" -> "負向創生",
    "charac.damage_dealt" -> "最終傷害.",
    "charac.heals_performed" -> "治療效果",
    "charac.range" -> "射程",
    "charac.minus_range" -> "負向射程",
    "charac.control" -> "統帥",
    "charac.minus_control" -> "負向統帥",
    "charac.block" -> "格擋",
    "charac.minus_block" -> "負向格擋",
    "charac.crit_chance" -> "爆擊",
    "charac.minus_crit_chance" -> "負向爆擊",
    "charac.crit_mastery" -> "爆擊傷害",
    "charac.rear_mastery" -> "背刺傷害",
    "charac.heal_mastery" -> "治療強度",
    "charac.area_mastery" -> "範圍傷害",
    "charac.st_mastery" -> "單體傷害",
    "charac.melee_mastery" -> "近戰傷害",
    "charac.distance_mastery" -> "遠程傷害",
    "charac.berserk_mastery" -> "狂爆傷害",
    "charac.damage_for_3" -> "3種隨機元素傷害",
    "charac.damage_for_2" -> "2種隨機元素傷害",
    "charac.damage_for_1" -> "1種隨機元素傷害",
    "charac.dodge" -> "閃避",
    "charac.lock" -> "鎖定",
    "charac.initiative" -> "先手",
    "charac.kit_skill" -> "裝備熟練",
    "charac.prospecting" -> "探勘",
    "charac.wisdom" -> "悟性",
    "charac.resist_for_3" -> "3種隨機元素抗性",
    "charac.resist_for_2" -> "2種隨機元素抗性",
    "charac.resist_for_1" -> "1種隨機元素抗性",
    "charac.crit_resist" -> "爆擊抗性",
    "charac.rear_resist" -> "背刺抗性",
    "charac.elemental_mastery" -> "元素傷害",
    "charac.elemental_resist" -> "元素抗性",
    "charac.earth_mastery" -> "土屬傷害",
    "charac.earth_resist" -> "土屬抗性.",
    "charac.fire_mastery" -> "火屬傷害",
    "charac.fire_resist" -> "火屬抗性",
    "charac.water_mastery" -> "水屬傷害",
    "charac.water_resist" -> "水屬抗性",
    "charac.air_mastery" -> "風屬傷害",
    "charac.air_resist" -> "風屬抗性",
    "rarity.common" -> "優良",
    "rarity.rare" -> "稀有",
    "rarity.mythical" -> "神秘",
    "rarity.legendary" -> "傳奇",
    "rarity.relic" -> "遺跡",
    "rarity.pvp" -> "PvP",
    "rarity.epic" -> "史詩",
    "rarity.admin" -> "管理員",
    "item.ring" -> "戒指",
    "item.dagger" -> "匕首",
    "item.boots" -> "靴子",
    "item.amulet" -> "項鍊",
    "item.cape" -> "披風",
    "item.belt" -> "腰帶",
    "item.helmet" -> "頭盔",
    "item.breastplate" -> "胸甲",
    "item.epaulettes" -> "肩甲",
    "item.shield" -> "盾牌",
    "item.pet" -> "寵物",
    "item.mount" -> "坐騎",
    "item.emblem" -> "徽章",
    "item.costume" -> "時裝",
    "item.any" -> "任何裝備",
    "item.one_hand_weapon" -> "單手武器",
    "item.two_hand_weapon" -> "雙手武器",
    "rune.damage" -> "攻擊符文",
    "rune.resistance" -> "抗性符文",
    "rune.vitality" -> "活力符文",
    "rune.initiative" -> "先手符文",
    "rune.lock" -> "鎖定符文",
    "rune.dodge" -> "反避符文",
    "rune.destruction" -> "毀滅符文",
    "rune.precision" -> "精準符文",
    "rune.distance" -> "遠程符文",
    "rune.fury" -> "狂暴符文",
    "rune.melee" -> "近戰符文",
    "rune.altruism" -> "治療強度符文",
    "rune.audacity" -> "無畏符文",
    "rune.sneakiness" -> "陰險符文",
    "rune.atrophy" -> "萎縮符文",
    "rune.determination" -> "決心符文",
    "rune.life" -> "生命符文",
    "rune.influence" -> "暴擊符文",
    "rune.robustness" -> "格檔符文",
    "rune.acuity" -> "射程符文",
    "rune.velocity" -> "移動力符文",
    "rune.vivacity" -> "行動力符文",
    "skill.%_health_points" -> "% 生命值",
    "skill.elemental_resist" -> "元素抗性",
    "skill.barrier" -> "屏障",
    "skill.%_heals_received" -> "% 治療獲得",
    "skill.%_armor_health_points" -> "% 生命護甲",
    "skill.elemental_mastery" -> "元素傷害",
    "skill.st_mastery" -> "單體傷害",
    "skill.area_mastery" -> "範圍傷害",
    "skill.cc_mastery" -> "近戰傷害",
    "skill.distance_mastery" -> "遠程傷害",
    "skill.health_points" -> "生命值",
    "skill.lock" -> "鎖定",
    "skill.dodge" -> "閃避",
    "skill.initiative" -> "先手",
    "skill.lock_and_dodge" -> "閃避與鎖定",
    "skill.%_ap_mp_removal" -> "% 行動力與移動力移除",
    "skill.%_ap_mp_resist" -> "% 行動力與移動力抵抗",
    "skill.%_crit_chance" -> "% 爆擊",
    "skill.%_block" -> "% 格檔",
    "skill.crit_mastery" -> "爆擊傷害",
    "skill.rear_mastery" -> "背刺傷害",
    "skill.berserk_mastery" -> "狂暴傷害",
    "skill.heal_mastery" -> "治療強度",
    "skill.rear_resist" -> "被刺抗性",
    "skill.crit_resist" -> "爆擊抗性",
    "skill.ap" -> "行動力",
    "skill.mp" -> "移動力與傷害",
    "skill.range" -> "射程與傷害",
    "skill.wp" -> "創生力",
    "skill.control" -> "統帥與傷害",
    "skill.%_damage_inflicted" -> "% 最終傷害",
    "skill.major_resist" -> "元素抗性"
  )
}

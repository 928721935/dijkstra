package com.jida.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.jida.entity.Direction;
import com.jida.entity.Place;

public class MapUtil {
	public static final String DESCRIPTION_SEPARATOR = "fgf";
	public static List<Place> maps = new ArrayList<Place>();
	public static Map<String,Place> PLACENAME_MAP = new HashMap<>();
	public static Map<String,Place> DESCRIPTION_MAP = new HashMap<>();

	@SuppressWarnings("serial")
	public static void initMap(){
		Place place = new Place("新手村广场",new ArrayList<Direction>(){{
			add(new Direction("镜湖(挣钱)","北：镜湖(挣钱)↑"));
			add(new Direction("江湖聚义厅","西：江湖聚义厅←"));
			//add(new Direction("武馆(学艺)","东：武馆(学艺)→"));
			//add(new Direction("夺宝擂台(PK场)","南：夺宝擂台(PK场)↓"));
			}});
		maps.add(place);
		
		place = new Place("镜湖(挣钱)",new ArrayList<Direction>(){{
			//add(new Direction("当铺(存物品)","北：当铺(存物品)↑"));
			add(new Direction("商店(买东西)","西：商店(买东西)←"));
			add(new Direction("钱庄(存取钱)","东：钱庄(存取钱)→"));
			add(new Direction("新手村广场","南：新手村广场↓"));
			}});
		maps.add(place);
		
		place = new Place("商店(买东西)",new ArrayList<Direction>(){{
			add(new Direction("镜湖(挣钱)","东：镜湖(挣钱)→"));
			}});
		maps.add(place);
		
		place = new Place("钱庄(存取钱)",new ArrayList<Direction>(){{
			add(new Direction("镜湖(挣钱)","西：镜湖(挣钱)←"));
			}});
		maps.add(place);
		
		place = new Place("江湖聚义厅",new ArrayList<Direction>(){{
			//add(new Direction("夺宝风云馆","北：夺宝风云馆↑"));
			add(new Direction("长安客栈（江湖起点）","西：长安客栈（江湖起点）←"));
			add(new Direction("新手村广场","东：新手村广场→"));
			add(new Direction("冥思房","南：冥思房↓"));
			}});
		maps.add(place);

		place = new Place("冥思房",new ArrayList<Direction>(){{
			add(new Direction("江湖聚义厅","北：江湖聚义厅↑"));
		}});
		maps.add(place);
		
		place = new Place("长安客栈（江湖起点）",new ArrayList<Direction>(){{
			add(new Direction("洞房","北：洞房↑"));
			add(new Direction("朱雀大街","西：朱雀大街←"));
			add(new Direction("江湖聚义厅","东：江湖聚义厅→"));
			}});
		maps.add(place);
		
		place = new Place("洞房",new ArrayList<Direction>(){{
			add(new Direction("长安客栈（江湖起点）","南：长安客栈（江湖起点）↓"));
			}});
		maps.add(place);
		
		place = new Place("朱雀大街",new ArrayList<Direction>(){{
			add(new Direction("长安城广场","北：长安城广场↑"));
			add(new Direction("长安客栈（江湖起点）","东：长安客栈（江湖起点）→"));
			add(new Direction("朱雀南街","南：朱雀南街↓"));
			}});
		maps.add(place);
		
		place = new Place("长安城广场",new ArrayList<Direction>(){{
			add(new Direction("玄武大街","北：玄武大街↑"));
			add(new Direction("白虎大街","西：白虎大街←"));
			add(new Direction("青龙大街","东：青龙大街→"));
			add(new Direction("朱雀大街","南：朱雀大街↓"));
			}});
		maps.add(place);
		
		place = new Place("玄武大街",new ArrayList<Direction>(){{
			add(new Direction("练武场","北：练武场↑"));
			add(new Direction("茅草屋","西：茅草屋←"));
			add(new Direction("烟雨楼","东：烟雨楼→"));
			add(new Direction("长安城广场","南：长安城广场↓"));
			}});
		place.setDescription("玄武大街fgf北：练武场↑fgf西：茅草屋←fgf东：烟雨楼→fgf南：长安城广场↓fgf这里的路相当的宽，能容好几匹马车并行，长长的道路通向北方。fgf");
		maps.add(place);
		
		place = new Place("烟雨楼",new ArrayList<Direction>(){{
			add(new Direction("奇珍斋","北：奇珍斋↑"));
			add(new Direction("玄武大街","西：玄武大街←"));
			}});
		maps.add(place);
		
		place = new Place("奇珍斋",new ArrayList<Direction>(){{
			add(new Direction("烟雨楼","南：烟雨楼↓"));
			}});
		maps.add(place);
		
		place = new Place("茅草屋",new ArrayList<Direction>(){{
			add(new Direction("时空隧道","西：时空隧道←"));
			add(new Direction("玄武大街","东：玄武大街→"));
			//add(new Direction("江湖名人堂","南：江湖名人堂↓"));
			}});
		maps.add(place);
		
		place = new Place("时空隧道",new ArrayList<Direction>(){{
			add(new Direction("集气门","北：集气门↑"));
			add(new Direction("茅草屋","东：茅草屋→"));
			}});
		maps.add(place);
		
		place = new Place("集气门",new ArrayList<Direction>(){{
			add(new Direction("夺宝神殿","北：夺宝神殿↑"));
			add(new Direction("时空隧道","南：时空隧道↓"));
			}});
		maps.add(place);

		place = new Place("夺宝神殿",new ArrayList<Direction>(){{
			add(new Direction("集气门","南：集气门↓"));
		}});
		maps.add(place);
		
		place = new Place("练武场",new ArrayList<Direction>(){{
			add(new Direction("玄武门","北：玄武门↑"));
			add(new Direction("百草堂","西：百草堂←"));
			add(new Direction("打铁铺","东：打铁铺→"));
			add(new Direction("玄武大街","南：玄武大街↓"));
			}});
		place.setDescription("练武场fgf北：玄武门↑fgf西：百草堂←fgf东：打铁铺→fgf南：玄武大街↓fgf这里是长安守军的操练的地方，一对官兵正在操练，两旁放置这一些剑，刀之类的武器，中间的空地上放置着好多的木人。fgf");
		maps.add(place);

		place = new Place("玄武门",new ArrayList<Direction>(){{
			add(new Direction("驿道(玄武1)","北：驿道↑"));
			add(new Direction("练武场","南：练武场↓"));
		}});
		place.setDescription("玄武门fgf北：驿道↑fgf南：练武场↓fgf城墙以条石砌基，巨砖砌身，城砖用优质粘土和白瓷土烧成，非常坚固。虽经年月的风吹雨打，至今还完好无损地保存下来。fgf");
		maps.add(place);

		place = new Place("驿道(玄武1)",new ArrayList<Direction>(){{
			add(new Direction("渭水南岸","北：渭水南岸↑"));
			add(new Direction("树林","东：树林→"));
			add(new Direction("玄武门","南：玄武门↓"));
		}});
		place.setDescription("驿道fgf北：渭水南岸↑fgf东：树林→fgf南：玄武门↓fgf一条青石铺就的驿道由南向北延伸，顺着驿道往北就离开长安城了。fgf");
		maps.add(place);

		place = new Place("渭水南岸",new ArrayList<Direction>(){{
			add(new Direction("驿道(玄武1)","南：驿道↓"));
		}});
		place.setDescription("渭水南岸fgf南：驿道↓fgf这里是渭水南岸,河面上来来往往的船只很多fgf");
		maps.add(place);

		place = new Place("树林",new ArrayList<Direction>(){{
			add(new Direction("树林深处","北：树林深处↑"));
			add(new Direction("驿道(玄武1)","西：驿道←"));
		}});
		place.setDescription("树林fgf北：树林深处↑fgf西：驿道←fgf这一片阴森的树林。,林子里很少有灌木从,全是高耸入云的千年古树.树木的枝梢交错着,伸展开来的繁盛的枝叶如碧绿的云,把蓝天遮了个严严实实。fgf");
		maps.add(place);

		place = new Place("树林深处",new ArrayList<Direction>(){{
			add(new Direction("树林","南：树林↓"));
		}});
		place.setDescription("树林深处fgf南：树林↓fgf这里是树林深处，一株株巨大的树木突现在眼前,微风过去,树叶发出簌簌的响声,远处传来几声狼嗷。 fgf");
		maps.add(place);
		
		place = new Place("打铁铺",new ArrayList<Direction>(){{
			add(new Direction("练武场","西：练武场←"));
			}});
		place.setDescription("打铁铺fgf西：练武场←fgf你刚走进来，就感到这里热气腾腾，四周的墙上挂着铁器，大部分都是已经打好的铁锤，长剑，菜刀，匕首等物。中间摆着个旺盛的火炉，一个铁匠正在火炉旁卖力的敲打着。fgf");
		maps.add(place);
		
		place = new Place("百草堂",new ArrayList<Direction>(){{
			add(new Direction("练武场","东：练武场→"));
			}});
		place.setDescription("百草堂fgf东：练武场→fgf一进门，你就看到对门的墙上挂着“百草堂”三个字的镶金牌匾。旁边放着一个熬用的炉子，四周散发着浓郁的药味，右边挂了一个牌子。fgf");
		maps.add(place);
		
		place = new Place("白虎大街",new ArrayList<Direction>(){{
			add(new Direction("相记钱庄","北：相记钱庄↑"));
			add(new Direction("白虎门","西：白虎门←"));
			add(new Direction("长安城广场","东：长安城广场→"));
			add(new Direction("阿绣当铺","南：阿绣当铺↓"));
			}});
		maps.add(place);
		
		place = new Place("阿绣当铺",new ArrayList<Direction>(){{
			add(new Direction("白虎大街","北：白虎大街↑"));
			}});
		maps.add(place);
		
		place = new Place("相记钱庄",new ArrayList<Direction>(){{
			add(new Direction("白虎大街","南：白虎大街↓"));
			}});
		maps.add(place);
		
		place = new Place("白虎门",new ArrayList<Direction>(){{
			add(new Direction("驿道(白虎1)","西：驿道←"));
			add(new Direction("白虎大街","东：白虎大街→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(白虎1)",new ArrayList<Direction>(){{
			add(new Direction("咸阳","西：咸阳←"));
			add(new Direction("白虎门","东：白虎门→"));
			//add(new Direction("山路(白虎1)","南：山路↓"));
			}});
		maps.add(place);
		
		place = new Place("咸阳",new ArrayList<Direction>(){{
			add(new Direction("驿道(咸阳1)","西：驿道←"));
			add(new Direction("驿道(白虎1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("青龙大街",new ArrayList<Direction>(){{
			add(new Direction("化生寺","北：化生寺↑"));
			add(new Direction("长安城广场","西：长安城广场←"));
			add(new Direction("青龙门","东：青龙门→"));
			add(new Direction("朱云商店","南：朱云商店↓"));
			}});
		maps.add(place);
		
		place = new Place("朱云商店",new ArrayList<Direction>(){{
			add(new Direction("青龙大街","北：青龙大街↑"));
			}});
		maps.add(place);
		
		place = new Place("化生寺",new ArrayList<Direction>(){{
			add(new Direction("青龙大街","南：青龙大街↓"));
			}});
		maps.add(place);
		
		place = new Place("青龙门",new ArrayList<Direction>(){{
			add(new Direction("青龙大街","西：青龙大街←"));
			add(new Direction("驿道(青龙1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(青龙1)",new ArrayList<Direction>(){{
			//todo
			//add(new Direction("黄土路","北：黄土路↑"));
			add(new Direction("青龙门","西：青龙门←"));
			add(new Direction("华山脚下","东：华山脚下→"));
			}});
		maps.add(place);
		
		place = new Place("华山脚下",new ArrayList<Direction>(){{
			add(new Direction("驿道(青龙1)","西：驿道←"));
			add(new Direction("潼关","东：潼关→"));
			add(new Direction("华山","南：华山↓"));
			}});
		maps.add(place);
		
		place = new Place("潼关",new ArrayList<Direction>(){{
			add(new Direction("华山脚下","西：华山脚下←"));
			add(new Direction("驿道(洛阳1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("朱雀南街",new ArrayList<Direction>(){{
			add(new Direction("朱雀大街","北：朱雀大街↑"));
			add(new Direction("江湖论坛","西：江湖论坛←"));
			add(new Direction("时间之门","东：时间之门→"));
			add(new Direction("朱雀门","南：朱雀门↓"));
			}});
		maps.add(place);

		place = new Place("时间之门",new ArrayList<Direction>(){{
			add(new Direction("朱雀南街","西：朱雀南街←"));
			add(new Direction("隧道1","东：隧道→"));
		}});
		maps.add(place);

		place = new Place("隧道1",new ArrayList<Direction>(){{
			add(new Direction("时间之门","西：时间之门←"));
			add(new Direction("隧道2","东：隧道→"));
		}});
		maps.add(place);

		place = new Place("隧道2",new ArrayList<Direction>(){{
			add(new Direction("隧道1","西：隧道←"));
			add(new Direction("王城","南：王城↓"));
		}});
		maps.add(place);

		place = new Place("王城",new ArrayList<Direction>(){{
			add(new Direction("隧道2","北：隧道↑"));
			add(new Direction("后宫","南：后宫↓"));
		}});
		maps.add(place);

		place = new Place("后宫",new ArrayList<Direction>(){{
			add(new Direction("王城","北：王城↑"));
		}});
		maps.add(place);
		
		place = new Place("江湖论坛",new ArrayList<Direction>(){{
			add(new Direction("江湖黑市","北：江湖黑市↑"));
			add(new Direction("朱雀南街","东：朱雀南街→"));
			add(new Direction("静修斋","南：静修斋↓"));
			}});
		maps.add(place);
		
		place = new Place("静修斋",new ArrayList<Direction>(){{
			add(new Direction("江湖论坛","南：江湖论坛↓"));
			}});
		maps.add(place);
		
		place = new Place("江湖黑市",new ArrayList<Direction>(){{
			add(new Direction("江湖论坛","北：江湖论坛↑"));
			}});
		maps.add(place);
		
		place = new Place("朱雀门",new ArrayList<Direction>(){{
			add(new Direction("朱雀南街","北：朱雀南街↑"));
			add(new Direction("驿道(朱雀1)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(朱雀1)",new ArrayList<Direction>(){{
			add(new Direction("朱雀门","北：朱雀门↑"));
			add(new Direction("荒野(朱雀4)","西：荒野←"));
			add(new Direction("荒野(朱雀2)","东：荒野→"));
			add(new Direction("秦岭","南：秦岭↓"));
			}});
		maps.add(place);
		
		place = new Place("荒野(朱雀4)",new ArrayList<Direction>(){{
			add(new Direction("驿道(朱雀1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("荒野(朱雀2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(朱雀1)","西：驿道←"));
			add(new Direction("荒野(朱雀3)","东：荒野→"));
			}});
		maps.add(place);

		place = new Place("荒野(朱雀3)",new ArrayList<Direction>(){{
			add(new Direction("荒野(朱雀2)","西：荒野←"));
			}});
		maps.add(place);
		
		place = new Place("秦岭",new ArrayList<Direction>(){{
			add(new Direction("驿道(朱雀1)","北：驿道↑"));
			add(new Direction("驿道(成都5)","南：驿道↓"));
			}});
		maps.add(place);
		
		//+++++++++++++++华山+++++++++++++++++++++++++++++++++++++
		place = new Place("华山",new ArrayList<Direction>(){{
			add(new Direction("华山脚下","北：华山脚下↑"));
			add(new Direction("莎萝坪","南：莎萝坪↓"));
			}});
		maps.add(place);
		
		place = new Place("莎萝坪",new ArrayList<Direction>(){{
			add(new Direction("华山","北：华山↑"));
			//add(new Direction("村口","东：村口→"));
			add(new Direction("云门","南：云门↓"));
			}});
		maps.add(place);
		
		place = new Place("云门",new ArrayList<Direction>(){{
			add(new Direction("莎萝坪","北：莎萝坪↑"));
			add(new Direction("青柯坪","南：青柯坪↓"));
			}});
		maps.add(place);
		
		place = new Place("青柯坪",new ArrayList<Direction>(){{
			add(new Direction("云门","北：云门↑"));
			add(new Direction("老君沟","东：老君沟→"));
			}});
		maps.add(place);
		
		place = new Place("老君沟",new ArrayList<Direction>(){{
			add(new Direction("青柯坪","北：青柯坪↑"));
			add(new Direction("镇岳宫","南：镇岳宫↓"));
			}});
		maps.add(place);
		
		place = new Place("镇岳宫",new ArrayList<Direction>(){{
			add(new Direction("老君沟","北：老君沟↑"));
			add(new Direction("玉女峰","东：玉女峰→"));
			}});
		maps.add(place);
		
		place = new Place("玉女峰",new ArrayList<Direction>(){{
			add(new Direction("练武场(华山1)","北：练武场↑"));
			add(new Direction("镇岳宫","西：镇岳宫←"));
			add(new Direction("舍身崖","东：舍身崖→"));
			add(new Direction("思过崖","南：思过崖↓"));
			}});
		maps.add(place);
		
		place = new Place("思过崖",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,0)","跳崖"));
			add(new Direction("玉女峰","北：玉女峰↑"));
			}});
		maps.add(place);
		
		place = new Place("练武场(华山1)",new ArrayList<Direction>(){{
			add(new Direction("群仙观","北：群仙观↑"));
			add(new Direction("兵器房","西：兵器房←"));
			//add(new Direction("小路","东：小路→"));
			//todo
			add(new Direction("玉女峰","南：玉女峰↓"));
			}});
		maps.add(place);
		
		place = new Place("群仙观",new ArrayList<Direction>(){{
			add(new Direction("有所不为轩","北：有所不为轩↑"));
			add(new Direction("华山休息室","东：华山休息室→"));
			add(new Direction("练武场(华山1)","南：练武场↓"));
			}});
		maps.add(place);
		
		place = new Place("华山休息室",new ArrayList<Direction>(){{
			add(new Direction("群仙观","西：群仙观←"));
			}});
		maps.add(place);
		
		place = new Place("有所不为轩",new ArrayList<Direction>(){{
			add(new Direction("群仙观","南：群仙观↓"));
			}});
		maps.add(place);
		
		place = new Place("兵器房",new ArrayList<Direction>(){{
			add(new Direction("练武场(华山1)","东：练武场→"));
			}});
		maps.add(place);
		
		place = new Place("小路(华山1)",new ArrayList<Direction>(){{
			add(new Direction("练武场(华山1)","西：练武场←"));
			add(new Direction("小路(华山2)","东：小路→"));
			}});
		maps.add(place);
		
		place = new Place("小路(华山2)",new ArrayList<Direction>(){{
			add(new Direction("小路(华山1)","西：练武场←"));
			add(new Direction("朝阳峰","东：朝阳峰→"));
			}});
		maps.add(place);
		
		place = new Place("舍身崖",new ArrayList<Direction>(){{
			add(new Direction("苍龙岭","北：苍龙岭↑"));
			add(new Direction("玉女峰","西：玉女峰←"));
			add(new Direction("上天梯","东：上天梯→"));
			add(new Direction("玉女祠","南：玉女祠↓"));
			}});
		maps.add(place);
		
		place = new Place("苍龙岭",new ArrayList<Direction>(){{
			add(new Direction("舍身崖","南：舍身崖↓"));
			}});
		maps.add(place);
		
		place = new Place("玉女祠",new ArrayList<Direction>(){{
			add(new Direction("舍身崖","北：舍身崖↑"));
			}});
		maps.add(place);
		
		place = new Place("上天梯",new ArrayList<Direction>(){{
			add(new Direction("紫气台","北：紫气台↑"));
			add(new Direction("舍身崖","西：舍身崖←"));
			add(new Direction("朝阳峰","东：朝阳峰→"));
			add(new Direction("落雁峰","南：落雁峰↓"));
			}});
		maps.add(place);

		place = new Place("落雁峰",new ArrayList<Direction>(){{
			add(new Direction("上天梯","北：上天梯↑"));
			add(new Direction("华山之巅","南：华山之巅↓"));
		}});
		maps.add(place);

		place = new Place("华山之巅",new ArrayList<Direction>(){{
			add(new Direction("落雁峰","北：落雁峰↑"));
		}});
		maps.add(place);
		
		place = new Place("紫气台",new ArrayList<Direction>(){{
			add(new Direction("上天梯","南：上天梯↓"));
			}});
		maps.add(place);
		
		place = new Place("朝阳峰",new ArrayList<Direction>(){{
			add(new Direction("上天梯","西：上天梯←"));
			}});
		maps.add(place);
		
		//+++++++++++++++++++++++圆月山庄+++++++++++++++++++++++++++++++==
		place = new Place("圆月山庄(0,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,1)","北：圆月山庄(0,1)↑"));
			add(new Direction("圆月山庄(1,0)","东：圆月山庄(1,0)→"));
			}});
		place.setDescription("圆月山庄(0,0)fgf北：圆月山庄(0,1)↑fgf东：圆月山庄(1,0)→fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,2)","北：圆月山庄(0,2)↑"));
			add(new Direction("圆月山庄(1,1)","东：圆月山庄(1,1)→"));
			add(new Direction("圆月山庄(0,0)","南：圆月山庄(0,0)↓"));
			}});
		place.setDescription("圆月山庄(0,1)fgf北：圆月山庄(0,2)↑fgf东：圆月山庄(1,1)→fgf南：圆月山庄(0,0)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,3)","北：圆月山庄(0,3)↑"));
			add(new Direction("圆月山庄(1,2)","东：圆月山庄(1,2)→"));
			add(new Direction("圆月山庄(0,1)","南：圆月山庄(0,1)↓"));
			}});
		place.setDescription("圆月山庄(0,2)fgf北：圆月山庄(0,3)↑fgf东：圆月山庄(1,2)→fgf南：圆月山庄(0,1)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,4)","北：圆月山庄(0,4)↑"));
			add(new Direction("圆月山庄(1,3)","东：圆月山庄(1,3)→"));
			add(new Direction("圆月山庄(0,2)","南：圆月山庄(0,2)↓"));
			}});
		place.setDescription("圆月山庄(0,3)fgf北：圆月山庄(0,4)↑fgf东：圆月山庄(1,3)→fgf南：圆月山庄(0,2)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,5)","北：圆月山庄(0,5)↑"));
			add(new Direction("圆月山庄(1,4)","东：圆月山庄(1,4)→"));
			add(new Direction("圆月山庄(0,3)","南：圆月山庄(0,3)↓"));
			}});
		place.setDescription("圆月山庄(0,4)fgf北：圆月山庄(0,5)↑fgf东：圆月山庄(1,4)→fgf南：圆月山庄(0,3)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,6)","北：圆月山庄(0,6)↑"));
			add(new Direction("圆月山庄(1,5)","东：圆月山庄(1,5)→"));
			add(new Direction("圆月山庄(0,4)","南：圆月山庄(0,4)↓"));
			}});
		place.setDescription("圆月山庄(0,5)fgf北：圆月山庄(0,6)↑fgf东：圆月山庄(1,5)→fgf南：圆月山庄(0,4)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,7)","北：圆月山庄(0,7)↑"));
			add(new Direction("圆月山庄(1,6)","东：圆月山庄(1,6)→"));
			add(new Direction("圆月山庄(0,5)","南：圆月山庄(0,5)↓"));
			}});
		place.setDescription("圆月山庄(0,6)fgf北：圆月山庄(0,7)↑fgf东：圆月山庄(1,6)→fgf南：圆月山庄(0,5)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,8)","北：圆月山庄(0,8)↑"));
			add(new Direction("圆月山庄(1,7)","东：圆月山庄(1,7)→"));
			add(new Direction("圆月山庄(0,6)","南：圆月山庄(0,6)↓"));
			}});
		place.setDescription("圆月山庄(0,7)fgf北：圆月山庄(0,8)↑fgf东：圆月山庄(1,7)→fgf南：圆月山庄(0,6)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(0,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,8)","东：圆月山庄(1,8)→"));
			add(new Direction("圆月山庄(0,7)","南：圆月山庄(0,7)↓"));
			}});
		place.setDescription("圆月山庄(0,8)fgf东：圆月山庄(1,8)→fgf南：圆月山庄(0,7)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		/////////1//////////
		place = new Place("圆月山庄(1,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,1)","北：圆月山庄(1,1)↑"));
			add(new Direction("圆月山庄(0,0)","西：圆月山庄(0,0)←"));
			add(new Direction("圆月山庄(2,0)","东：圆月山庄(2,0)→"));
			}});
		place.setDescription("圆月山庄(1,0)fgf北：圆月山庄(1,1)↑fgf西：圆月山庄(0,0)←fgf东：圆月山庄(2,0)→fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,2)","北：圆月山庄(1,2)↑"));
			add(new Direction("圆月山庄(0,1)","西：圆月山庄(0,1)←"));
			add(new Direction("圆月山庄(2,1)","东：圆月山庄(2,1)→"));
			add(new Direction("圆月山庄(1,0)","南：圆月山庄(1,0)↓"));
			}});
		place.setDescription("圆月山庄(1,1)fgf北：圆月山庄(1,2)↑fgf西：圆月山庄(0,1)←fgf东：圆月山庄(2,1)→fgf南：圆月山庄(1,0)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,3)","北：圆月山庄(1,3)↑"));
			add(new Direction("圆月山庄(0,2)","西：圆月山庄(0,2)←"));
			add(new Direction("圆月山庄(2,2)","东：圆月山庄(2,2)→"));
			add(new Direction("圆月山庄(1,1)","南：圆月山庄(1,1)↓"));
			}});
		place.setDescription("圆月山庄(1,2)fgf北：圆月山庄(1,3)↑fgf西：圆月山庄(0,2)←fgf东：圆月山庄(2,2)→fgf南：圆月山庄(1,1)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,4)","北：圆月山庄(1,4)↑"));
			add(new Direction("圆月山庄(0,3)","西：圆月山庄(0,3)←"));
			add(new Direction("圆月山庄(2,3)","东：圆月山庄(2,3)→"));
			add(new Direction("圆月山庄(1,2)","南：圆月山庄(1,2)↓"));
			}});
		place.setDescription("圆月山庄(1,3)fgf北：圆月山庄(1,4)↑fgf西：圆月山庄(0,3)←fgf东：圆月山庄(2,3)→fgf南：圆月山庄(1,2)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,5)","北：圆月山庄(1,5)↑"));
			add(new Direction("圆月山庄(0,4)","西：圆月山庄(0,4)←"));
			add(new Direction("圆月山庄(2,4)","东：圆月山庄(2,4)→"));
			add(new Direction("圆月山庄(1,3)","南：圆月山庄(1,3)↓"));
			}});
		place.setDescription("圆月山庄(1,4)fgf北：圆月山庄(1,5)↑fgf西：圆月山庄(0,4)←fgf东：圆月山庄(2,4)→fgf南：圆月山庄(1,3)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,6)","北：圆月山庄(1,6)↑"));
			add(new Direction("圆月山庄(0,5)","西：圆月山庄(0,5)←"));
			add(new Direction("圆月山庄(2,5)","东：圆月山庄(2,5)→"));
			add(new Direction("圆月山庄(1,4)","南：圆月山庄(1,4)↓"));
			}});
		place.setDescription("圆月山庄(1,5)fgf北：圆月山庄(1,6)↑fgf西：圆月山庄(0,5)←fgf东：圆月山庄(2,5)→fgf南：圆月山庄(1,4)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,7)","北：圆月山庄(1,7)↑"));
			add(new Direction("圆月山庄(0,6)","西：圆月山庄(0,6)←"));
			add(new Direction("圆月山庄(2,6)","东：圆月山庄(2,6)→"));
			add(new Direction("圆月山庄(1,5)","南：圆月山庄(1,5)↓"));
			}});
		place.setDescription("圆月山庄(1,6)fgf北：圆月山庄(1,7)↑fgf西：圆月山庄(0,6)←fgf东：圆月山庄(2,6)→fgf南：圆月山庄(1,5)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,8)","北：圆月山庄(1,8)↑"));
			add(new Direction("圆月山庄(0,7)","西：圆月山庄(0,7)←"));
			add(new Direction("圆月山庄(2,7)","东：圆月山庄(2,7)→"));
			add(new Direction("圆月山庄(1,6)","南：圆月山庄(1,6)↓"));
			}});
		place.setDescription("圆月山庄(1,7)fgf北：圆月山庄(1,8)↑fgf西：圆月山庄(0,7)←fgf东：圆月山庄(2,7)→fgf南：圆月山庄(1,6)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(1,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(0,8)","西：圆月山庄(0,8)←"));
			add(new Direction("圆月山庄(2,8)","东：圆月山庄(2,8)→"));
			add(new Direction("圆月山庄(1,7)","南：圆月山庄(1,7)↓"));
			}});
		place.setDescription("圆月山庄(1,8)fgf西：圆月山庄(0,8)←fgf东：圆月山庄(2,8)→fgf南：圆月山庄(1,7)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		//+++++++++++++++++++2++++++++++++++++++++++++++
		place = new Place("圆月山庄(2,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,1)","北：圆月山庄(2,1)↑"));
			add(new Direction("圆月山庄(1,0)","西：圆月山庄(1,0)←"));
			add(new Direction("圆月山庄(3,0)","东：圆月山庄(3,0)→"));
			}});
		place.setDescription("圆月山庄(2,0)fgf北：圆月山庄(2,1)↑fgf西：圆月山庄(1,0)←fgf东：圆月山庄(3,0)→fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,2)","北：圆月山庄(2,2)↑"));
			add(new Direction("圆月山庄(1,1)","西：圆月山庄(1,1)←"));
			add(new Direction("圆月山庄(3,1)","东：圆月山庄(3,1)→"));
			add(new Direction("圆月山庄(2,0)","南：圆月山庄(2,0)↓"));
			}});
		place.setDescription("圆月山庄(2,1)fgf北：圆月山庄(2,2)↑fgf西：圆月山庄(1,1)←fgf东：圆月山庄(3,1)→fgf南：圆月山庄(2,0)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,3)","北：圆月山庄(2,3)↑"));
			add(new Direction("圆月山庄(1,2)","西：圆月山庄(1,2)←"));
			add(new Direction("圆月山庄(3,2)","东：圆月山庄(3,2)→"));
			add(new Direction("圆月山庄(2,1)","南：圆月山庄(2,1)↓"));
			}});
		place.setDescription("圆月山庄(2,2)fgf北：圆月山庄(2,3)↑fgf西：圆月山庄(1,2)←fgf东：圆月山庄(3,2)→fgf南：圆月山庄(2,1)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,4)","北：圆月山庄(2,4)↑"));
			add(new Direction("圆月山庄(1,3)","西：圆月山庄(1,3)←"));
			add(new Direction("圆月山庄(3,3)","东：圆月山庄(3,3)→"));
			add(new Direction("圆月山庄(2,2)","南：圆月山庄(2,2)↓"));
			}});
		place.setDescription("圆月山庄(2,3)fgf北：圆月山庄(2,4)↑fgf西：圆月山庄(1,3)←fgf东：圆月山庄(3,3)→fgf南：圆月山庄(2,2)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,5)","北：圆月山庄(2,5)↑"));
			add(new Direction("圆月山庄(1,4)","西：圆月山庄(1,4)←"));
			add(new Direction("圆月山庄(3,4)","东：圆月山庄(3,4)→"));
			add(new Direction("圆月山庄(2,3)","南：圆月山庄(2,3)↓"));
			}});
		place.setDescription("圆月山庄(2,4)fgf北：圆月山庄(2,5)↑fgf西：圆月山庄(1,4)←fgf东：圆月山庄(3,4)→fgf南：圆月山庄(2,3)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,6)","北：圆月山庄(2,6)↑"));
			add(new Direction("圆月山庄(1,5)","西：圆月山庄(1,5)←"));
			add(new Direction("圆月山庄(3,5)","东：圆月山庄(3,5)→"));
			add(new Direction("圆月山庄(2,4)","南：圆月山庄(2,4)↓"));
			}});
		place.setDescription("圆月山庄(2,5)fgf北：圆月山庄(2,6)↑fgf西：圆月山庄(1,5)←fgf东：圆月山庄(3,5)→fgf南：圆月山庄(2,4)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,7)","北：圆月山庄(2,7)↑"));
			add(new Direction("圆月山庄(1,6)","西：圆月山庄(1,6)←"));
			add(new Direction("圆月山庄(3,6)","东：圆月山庄(3,6)→"));
			add(new Direction("圆月山庄(2,5)","南：圆月山庄(2,5)↓"));
			}});
		place.setDescription("圆月山庄(2,6)fgf北：圆月山庄(2,7)↑fgf西：圆月山庄(1,6)←fgf东：圆月山庄(3,6)→fgf南：圆月山庄(2,5)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,8)","北：圆月山庄(2,8)↑"));
			add(new Direction("圆月山庄(1,7)","西：圆月山庄(1,7)←"));
			add(new Direction("圆月山庄(3,7)","东：圆月山庄(3,7)→"));
			add(new Direction("圆月山庄(2,6)","南：圆月山庄(2,6)↓"));
			}});
		place.setDescription("圆月山庄(2,7)fgf北：圆月山庄(2,8)↑fgf西：圆月山庄(1,7)←fgf东：圆月山庄(3,7)→fgf南：圆月山庄(2,6)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(2,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(1,8)","西：圆月山庄(1,8)←"));
			add(new Direction("圆月山庄(3,8)","东：圆月山庄(3,8)→"));
			add(new Direction("圆月山庄(2,7)","南：圆月山庄(2,7)↓"));
			}});
		place.setDescription("圆月山庄(2,8)fgf西：圆月山庄(1,8)←fgf东：圆月山庄(3,8)→fgf南：圆月山庄(2,7)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		//+++++++++++++++++++++3++++++++++++++++++++++++++++
		place = new Place("圆月山庄(3,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,1)","北：圆月山庄(3,1)↑"));
			add(new Direction("圆月山庄(2,0)","西：圆月山庄(2,0)←"));
			add(new Direction("圆月山庄(4,0)","东：圆月山庄(4,0)→"));
			}});
		place.setDescription("圆月山庄(3,0)fgf北：圆月山庄(3,1)↑fgf西：圆月山庄(2,0)←fgf东：圆月山庄(4,0)→fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(3,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,2)","北：圆月山庄(3,2)↑"));
			add(new Direction("圆月山庄(2,1)","西：圆月山庄(2,1)←"));
			add(new Direction("圆月山庄(4,1)","东：圆月山庄(4,1)→"));
			add(new Direction("圆月山庄(3,0)","南：圆月山庄(3,0)↓"));
			}});
		place.setDescription("圆月山庄(3,1)fgf北：圆月山庄(3,2)↑fgf西：圆月山庄(2,1)←fgf东：圆月山庄(4,1)→fgf南：圆月山庄(3,0)↓fgf一个神秘的山庄！fgf");
		maps.add(place);
		
		place = new Place("圆月山庄(3,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,3)","北：圆月山庄(3,3)↑"));
			add(new Direction("圆月山庄(2,2)","西：圆月山庄(2,2)←"));
			add(new Direction("圆月山庄(4,2)","东：圆月山庄(4,2)→"));
			add(new Direction("圆月山庄(3,1)","南：圆月山庄(3,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,4)","北：圆月山庄(3,4)↑"));
			add(new Direction("圆月山庄(2,3)","西：圆月山庄(2,3)←"));
			add(new Direction("圆月山庄(4,3)","东：圆月山庄(4,3)→"));
			add(new Direction("圆月山庄(3,2)","南：圆月山庄(3,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,5)","北：圆月山庄(3,5)↑"));
			add(new Direction("圆月山庄(2,4)","西：圆月山庄(2,4)←"));
			add(new Direction("圆月山庄(4,4)","东：圆月山庄(4,4)→"));
			add(new Direction("圆月山庄(3,3)","南：圆月山庄(3,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,6)","北：圆月山庄(3,6)↑"));
			add(new Direction("圆月山庄(2,5)","西：圆月山庄(2,5)←"));
			add(new Direction("圆月山庄(4,5)","东：圆月山庄(4,5)→"));
			add(new Direction("圆月山庄(3,4)","南：圆月山庄(3,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,7)","北：圆月山庄(3,7)↑"));
			add(new Direction("圆月山庄(2,6)","西：圆月山庄(2,6)←"));
			add(new Direction("圆月山庄(4,6)","东：圆月山庄(4,6)→"));
			add(new Direction("圆月山庄(3,5)","南：圆月山庄(3,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,8)","北：圆月山庄(3,8)↑"));
			add(new Direction("圆月山庄(2,7)","西：圆月山庄(2,7)←"));
			add(new Direction("圆月山庄(4,7)","东：圆月山庄(4,7)→"));
			add(new Direction("圆月山庄(3,6)","南：圆月山庄(3,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(3,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(2,8)","西：圆月山庄(2,8)←"));
			add(new Direction("圆月山庄(4,8)","东：圆月山庄(4,8)→"));
			add(new Direction("圆月山庄(3,7)","南：圆月山庄(3,7)↓"));
			}});
		maps.add(place);
		//++++++++++++++++++++++++++4++++++++++++++++++++++
		place = new Place("圆月山庄(4,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,1)","北：圆月山庄(4,1)↑"));
			add(new Direction("圆月山庄(3,0)","西：圆月山庄(3,0)←"));
			add(new Direction("圆月山庄(5,0)","东：圆月山庄(5,0)→"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,2)","北：圆月山庄(4,2)↑"));
			add(new Direction("圆月山庄(3,1)","西：圆月山庄(3,1)←"));
			add(new Direction("圆月山庄(5,1)","东：圆月山庄(5,1)→"));
			add(new Direction("圆月山庄(4,0)","南：圆月山庄(4,0)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,3)","北：圆月山庄(4,3)↑"));
			add(new Direction("圆月山庄(3,2)","西：圆月山庄(3,2)←"));
			add(new Direction("圆月山庄(5,2)","东：圆月山庄(5,2)→"));
			add(new Direction("圆月山庄(4,1)","南：圆月山庄(4,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,4)","北：圆月山庄(4,4)↑"));
			add(new Direction("圆月山庄(3,3)","西：圆月山庄(3,3)←"));
			add(new Direction("圆月山庄(5,3)","东：圆月山庄(5,3)→"));
			add(new Direction("圆月山庄(4,2)","南：圆月山庄(4,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,5)","北：圆月山庄(4,5)↑"));
			add(new Direction("圆月山庄(3,4)","西：圆月山庄(3,4)←"));
			add(new Direction("圆月山庄(5,4)","东：圆月山庄(5,4)→"));
			add(new Direction("圆月山庄(4,3)","南：圆月山庄(4,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,6)","北：圆月山庄(4,6)↑"));
			add(new Direction("圆月山庄(3,5)","西：圆月山庄(3,5)←"));
			add(new Direction("圆月山庄(5,5)","东：圆月山庄(5,5)→"));
			add(new Direction("圆月山庄(4,4)","南：圆月山庄(4,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,7)","北：圆月山庄(4,7)↑"));
			add(new Direction("圆月山庄(3,6)","西：圆月山庄(3,6)←"));
			add(new Direction("圆月山庄(5,6)","东：圆月山庄(5,6)→"));
			add(new Direction("圆月山庄(4,5)","南：圆月山庄(4,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,8)","北：圆月山庄(4,8)↑"));
			add(new Direction("圆月山庄(3,7)","西：圆月山庄(3,7)←"));
			add(new Direction("圆月山庄(5,7)","东：圆月山庄(5,7)→"));
			add(new Direction("圆月山庄(4,6)","南：圆月山庄(4,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(4,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(3,8)","西：圆月山庄(3,8)←"));
			add(new Direction("圆月山庄(5,8)","东：圆月山庄(5,8)→"));
			add(new Direction("圆月山庄(4,7)","南：圆月山庄(4,7)↓"));
			}});
		maps.add(place);
		/**
		 * 5
		 */
		place = new Place("圆月山庄(5,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,1)","北：圆月山庄(5,1)↑"));
			add(new Direction("圆月山庄(4,0)","西：圆月山庄(4,0)←"));
			add(new Direction("圆月山庄(6,0)","东：圆月山庄(6,0)→"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,2)","北：圆月山庄(5,2)↑"));
			add(new Direction("圆月山庄(4,1)","西：圆月山庄(4,1)←"));
			add(new Direction("圆月山庄(6,1)","东：圆月山庄(6,1)→"));
			add(new Direction("圆月山庄(5,0)","南：圆月山庄(5,0)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,3)","北：圆月山庄(5,3)↑"));
			add(new Direction("圆月山庄(4,2)","西：圆月山庄(4,2)←"));
			add(new Direction("圆月山庄(6,2)","东：圆月山庄(6,2)→"));
			add(new Direction("圆月山庄(5,1)","南：圆月山庄(5,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,4)","北：圆月山庄(5,4)↑"));
			add(new Direction("圆月山庄(4,3)","西：圆月山庄(4,3)←"));
			add(new Direction("圆月山庄(6,3)","东：圆月山庄(6,3)→"));
			add(new Direction("圆月山庄(5,2)","南：圆月山庄(5,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,5)","北：圆月山庄(5,5)↑"));
			add(new Direction("圆月山庄(4,4)","西：圆月山庄(4,4)←"));
			add(new Direction("圆月山庄(6,4)","东：圆月山庄(6,4)→"));
			add(new Direction("圆月山庄(5,3)","南：圆月山庄(5,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,6)","北：圆月山庄(5,6)↑"));
			add(new Direction("圆月山庄(4,5)","西：圆月山庄(4,5)←"));
			add(new Direction("圆月山庄(6,5)","东：圆月山庄(6,5)→"));
			add(new Direction("圆月山庄(5,4)","南：圆月山庄(5,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,7)","北：圆月山庄(5,7)↑"));
			add(new Direction("圆月山庄(4,6)","西：圆月山庄(4,6)←"));
			add(new Direction("圆月山庄(6,6)","东：圆月山庄(6,6)→"));
			add(new Direction("圆月山庄(5,5)","南：圆月山庄(5,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,8)","北：圆月山庄(5,8)↑"));
			add(new Direction("圆月山庄(4,7)","西：圆月山庄(4,7)←"));
			add(new Direction("圆月山庄(6,7)","东：圆月山庄(6,7)→"));
			add(new Direction("圆月山庄(5,6)","南：圆月山庄(5,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(5,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(4,8)","西：圆月山庄(4,8)←"));
			add(new Direction("圆月山庄(6,8)","东：圆月山庄(6,8)→"));
			add(new Direction("圆月山庄(5,7)","南：圆月山庄(5,7)↓"));
			}});
		maps.add(place);
		/**
		 * 6
		 */
		place = new Place("圆月山庄(6,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,1)","北：圆月山庄(6,1)↑"));
			add(new Direction("圆月山庄(5,0)","西：圆月山庄(5,0)←"));
			add(new Direction("圆月山庄(7,0)","东：圆月山庄(7,0)→"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,2)","北：圆月山庄(6,2)↑"));
			add(new Direction("圆月山庄(5,1)","西：圆月山庄(5,1)←"));
			add(new Direction("圆月山庄(7,1)","东：圆月山庄(7,1)→"));
			add(new Direction("圆月山庄(6,0)","南：圆月山庄(6,0)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,3)","北：圆月山庄(6,3)↑"));
			add(new Direction("圆月山庄(5,2)","西：圆月山庄(5,2)←"));
			add(new Direction("圆月山庄(7,2)","东：圆月山庄(7,2)→"));
			add(new Direction("圆月山庄(6,1)","南：圆月山庄(6,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,4)","北：圆月山庄(6,4)↑"));
			add(new Direction("圆月山庄(5,3)","西：圆月山庄(5,3)←"));
			add(new Direction("圆月山庄(7,3)","东：圆月山庄(7,3)→"));
			add(new Direction("圆月山庄(6,2)","南：圆月山庄(6,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,5)","北：圆月山庄(6,5)↑"));
			add(new Direction("圆月山庄(5,4)","西：圆月山庄(5,4)←"));
			add(new Direction("圆月山庄(7,4)","东：圆月山庄(7,4)→"));
			add(new Direction("圆月山庄(6,3)","南：圆月山庄(6,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,6)","北：圆月山庄(6,6)↑"));
			add(new Direction("圆月山庄(5,5)","西：圆月山庄(5,5)←"));
			add(new Direction("圆月山庄(7,5)","东：圆月山庄(7,5)→"));
			add(new Direction("圆月山庄(6,4)","南：圆月山庄(6,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,7)","北：圆月山庄(6,7)↑"));
			add(new Direction("圆月山庄(5,6)","西：圆月山庄(5,6)←"));
			add(new Direction("圆月山庄(7,6)","东：圆月山庄(7,6)→"));
			add(new Direction("圆月山庄(6,5)","南：圆月山庄(6,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,8)","北：圆月山庄(6,8)↑"));
			add(new Direction("圆月山庄(5,7)","西：圆月山庄(5,7)←"));
			add(new Direction("圆月山庄(7,7)","东：圆月山庄(7,7)→"));
			add(new Direction("圆月山庄(6,6)","南：圆月山庄(6,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(6,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(5,8)","西：圆月山庄(5,8)←"));
			add(new Direction("圆月山庄(7,8)","东：圆月山庄(7,8)→"));
			add(new Direction("圆月山庄(6,7)","南：圆月山庄(6,7)↓"));
			}});
		maps.add(place);
		/**
		 * 7
		 */
		place = new Place("圆月山庄(7,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,1)","北：圆月山庄(7,1)↑"));
			add(new Direction("圆月山庄(6,0)","西：圆月山庄(6,0)←"));
			add(new Direction("圆月山庄(8,0)","东：圆月山庄(8,0)→"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,2)","北：圆月山庄(7,2)↑"));
			add(new Direction("圆月山庄(6,1)","西：圆月山庄(6,1)←"));
			add(new Direction("圆月山庄(8,1)","东：圆月山庄(8,1)→"));
			add(new Direction("圆月山庄(7,0)","南：圆月山庄(7,0)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,3)","北：圆月山庄(7,3)↑"));
			add(new Direction("圆月山庄(6,2)","西：圆月山庄(6,2)←"));
			add(new Direction("圆月山庄(8,2)","东：圆月山庄(8,2)→"));
			add(new Direction("圆月山庄(7,1)","南：圆月山庄(7,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,4)","北：圆月山庄(7,4)↑"));
			add(new Direction("圆月山庄(6,3)","西：圆月山庄(6,3)←"));
			add(new Direction("圆月山庄(8,3)","东：圆月山庄(8,3)→"));
			add(new Direction("圆月山庄(7,2)","南：圆月山庄(7,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,5)","北：圆月山庄(7,5)↑"));
			add(new Direction("圆月山庄(6,4)","西：圆月山庄(6,4)←"));
			add(new Direction("圆月山庄(8,4)","东：圆月山庄(8,4)→"));
			add(new Direction("圆月山庄(7,3)","南：圆月山庄(7,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,6)","北：圆月山庄(7,6)↑"));
			add(new Direction("圆月山庄(6,5)","西：圆月山庄(6,5)←"));
			add(new Direction("圆月山庄(8,5)","东：圆月山庄(8,5)→"));
			add(new Direction("圆月山庄(7,4)","南：圆月山庄(7,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,7)","北：圆月山庄(7,7)↑"));
			add(new Direction("圆月山庄(6,6)","西：圆月山庄(6,6)←"));
			add(new Direction("圆月山庄(8,6)","东：圆月山庄(8,6)→"));
			add(new Direction("圆月山庄(7,5)","南：圆月山庄(7,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,8)","北：圆月山庄(7,8)↑"));
			add(new Direction("圆月山庄(6,7)","西：圆月山庄(6,7)←"));
			add(new Direction("圆月山庄(8,7)","东：圆月山庄(8,7)→"));
			add(new Direction("圆月山庄(7,6)","南：圆月山庄(7,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(7,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(6,8)","西：圆月山庄(6,8)←"));
			add(new Direction("圆月山庄(8,8)","东：圆月山庄(8,8)→"));
			add(new Direction("圆月山庄(7,7)","南：圆月山庄(7,7)↓"));
			}});
		maps.add(place);
		/**
		 * 8
		 */
		place = new Place("圆月山庄(8,0)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,1)","北：圆月山庄(8,1)↑"));
			add(new Direction("圆月山庄(7,0)","西：圆月山庄(7,0)←"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,1)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,2)","北：圆月山庄(8,2)↑"));
			add(new Direction("圆月山庄(7,1)","西：圆月山庄(7,1)←"));
			add(new Direction("圆月山庄(8,0)","南：圆月山庄(8,0)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,2)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,3)","北：圆月山庄(8,3)↑"));
			add(new Direction("圆月山庄(7,2)","西：圆月山庄(7,2)←"));
			add(new Direction("圆月山庄(8,1)","南：圆月山庄(8,1)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,3)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,4)","北：圆月山庄(8,4)↑"));
			add(new Direction("圆月山庄(7,3)","西：圆月山庄(7,3)←"));
			add(new Direction("圆月山庄(8,2)","南：圆月山庄(8,2)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,4)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,5)","北：圆月山庄(8,5)↑"));
			add(new Direction("圆月山庄(7,4)","西：圆月山庄(7,4)←"));
			add(new Direction("圆月山庄(8,3)","南：圆月山庄(8,3)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,5)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,6)","北：圆月山庄(8,6)↑"));
			add(new Direction("圆月山庄(7,5)","西：圆月山庄(7,5)←"));
			add(new Direction("圆月山庄(8,4)","南：圆月山庄(8,4)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,6)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,7)","北：圆月山庄(8,7)↑"));
			add(new Direction("圆月山庄(7,6)","西：圆月山庄(7,6)←"));
			add(new Direction("圆月山庄(8,5)","南：圆月山庄(8,5)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,7)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(8,8)","北：圆月山庄(8,8)↑"));
			add(new Direction("圆月山庄(7,7)","西：圆月山庄(7,7)←"));
			add(new Direction("圆月山庄(8,6)","南：圆月山庄(8,6)↓"));
			}});
		maps.add(place);
		
		place = new Place("圆月山庄(8,8)",new ArrayList<Direction>(){{
			add(new Direction("圆月山庄(7,8)","西：圆月山庄(7,8)←"));
			add(new Direction("圆月山庄(8,7)","南：圆月山庄(8,7)↓"));
			}});
		maps.add(place);
		//+++++++++++++++兰州+++++++++++++++++++++++++++++++++++++
		place = new Place("驿道(咸阳1)",new ArrayList<Direction>(){{
			add(new Direction("驿道(咸阳2)","西：驿道←"));
			add(new Direction("咸阳","东：咸阳→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(咸阳2)",new ArrayList<Direction>(){{
			add(new Direction("兰州街道(兰州1)","西：兰州街道←"));
			add(new Direction("驿道(咸阳1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("兰州街道(兰州1)",new ArrayList<Direction>(){{
			//add(new Direction("怡红院","北：怡红院↑"));
			add(new Direction("十字路口","西：十字路口←"));
			add(new Direction("驿道(咸阳2)","东：驿道→"));
			add(new Direction("钱庄(兰州1)","南：钱庄↓"));
			}});
		maps.add(place);
		
		place = new Place("钱庄(兰州1)",new ArrayList<Direction>(){{
			add(new Direction("兰州街道(兰州1)","北：兰州街道↑"));
			}});
		maps.add(place);
		
		place = new Place("十字路口",new ArrayList<Direction>(){{
			add(new Direction("北市场","北：北市场↑"));
			add(new Direction("街道","西：街道←"));
			add(new Direction("兰州街道(兰州1)","东：兰州街道→"));
			add(new Direction("兰州街道(兰州2)","南：兰州街道↓"));
			}});
		maps.add(place);
		
		place = new Place("兰州街道(兰州2)",new ArrayList<Direction>(){{
			add(new Direction("十字路口","北：十字路口↑"));
			add(new Direction("民宅","东：民宅→"));
			}});
		maps.add(place);
		
		place = new Place("民宅",new ArrayList<Direction>(){{
			add(new Direction("兰州街道(兰州2)","西：兰州街道←"));
			}});
		maps.add(place);
		
		place = new Place("北市场",new ArrayList<Direction>(){{
			add(new Direction("杂货铺","西：杂货铺←"));
			add(new Direction("十字路口","南：十字路口↓"));
			}});
		maps.add(place);
		
		place = new Place("杂货铺",new ArrayList<Direction>(){{
			add(new Direction("北市场","东：北市场→"));
			}});
		maps.add(place);
		
		place = new Place("街道",new ArrayList<Direction>(){{
			add(new Direction("兰州药铺","北：兰州药铺↑"));
			add(new Direction("兰州街道(兰州3)","西：兰州街道←"));
			add(new Direction("十字路口","东：十字路口→"));
			//add(new Direction("龙门客栈","南：龙门客栈↓"));
			}});
		maps.add(place);
		
		place = new Place("兰州药铺",new ArrayList<Direction>(){{
			add(new Direction("街道","南：街道↓"));
			}});
		maps.add(place);
		
		place = new Place("兰州街道(兰州3)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州1)","西：驿道←"));
			add(new Direction("街道","东：街道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州1)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州2)","西：驿道←"));
			add(new Direction("兰州街道(兰州3)","东：兰州街道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州3)","西：驿道←"));
			add(new Direction("驿道(兰州1)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州3)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州4)","西：驿道←"));
			add(new Direction("驿道(兰州2)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州4)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州5)","西：驿道←"));
			add(new Direction("驿道(兰州3)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州5)",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州6)","西：驿道←"));
			add(new Direction("驿道(兰州4)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(兰州6)",new ArrayList<Direction>(){{
			add(new Direction("楼兰","西：楼兰←"));
			add(new Direction("驿道(兰州4)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("楼兰",new ArrayList<Direction>(){{
			add(new Direction("驿道(兰州6)","东：驿道→"));
			add(new Direction("羊肠小道","南：羊肠小道↓"));
			}});
		maps.add(place);
		
		place = new Place("羊肠小道",new ArrayList<Direction>(){{
			add(new Direction("楼兰","北：楼兰↑"));
			add(new Direction("楼兰小道","西：楼兰小道←"));
			}});
		maps.add(place);
		
		place = new Place("楼兰小道",new ArrayList<Direction>(){{
			add(new Direction("铁门","北：铁门↑"));
			add(new Direction("羊肠小道","东：羊肠小道→"));
			}});
		maps.add(place);
		
		place = new Place("铁门",new ArrayList<Direction>(){{
			add(new Direction("青石大道(魔教1)","北：青石大道↑"));
			add(new Direction("楼兰小道","南：楼兰小道↓"));
			}});
		maps.add(place);
		
		place = new Place("青石大道(魔教1)",new ArrayList<Direction>(){{
			add(new Direction("护教居","北：护教居↑"));
			add(new Direction("铁门","南：铁门↓"));
			}});
		maps.add(place);
		
		place = new Place("护教居",new ArrayList<Direction>(){{
			add(new Direction("大石门","北：大石门↑"));
			add(new Direction("休息室(魔教1)","东：休息室→"));
			add(new Direction("青石大道(魔教1)","南：青石大道↓"));
			}});
		maps.add(place);
		
		place = new Place("休息室(魔教1)",new ArrayList<Direction>(){{
			add(new Direction("护教居","西：护教居←"));
			}});
		maps.add(place);
		
		place = new Place("大石门",new ArrayList<Direction>(){{
			add(new Direction("护法居","北：护法居↑"));
			add(new Direction("护教居","南：护教居↓"));
			}});
		maps.add(place);
		
		place = new Place("护法居",new ArrayList<Direction>(){{
			add(new Direction("议事厅","北：议事厅↑"));
			add(new Direction("大石门","南：大石门↓"));
			}});
		maps.add(place);
		
		place = new Place("议事厅",new ArrayList<Direction>(){{
			add(new Direction("白玉牌楼","北：白玉牌楼↑"));
			add(new Direction("护法居","南：护法居↓"));
			}});
		maps.add(place);
		
		place = new Place("白玉牌楼",new ArrayList<Direction>(){{
			add(new Direction("十长老殿","北：十长老殿↑"));
			add(new Direction("议事厅","南：议事厅↓"));
			}});
		maps.add(place);
		
		place = new Place("十长老殿",new ArrayList<Direction>(){{
			add(new Direction("九长老殿","北：九长老殿↑"));
			add(new Direction("白玉牌楼","南：白玉牌楼↓"));
			}});
		maps.add(place);
		
		place = new Place("九长老殿",new ArrayList<Direction>(){{
			add(new Direction("八长老殿","北：八长老殿↑"));
			add(new Direction("十长老殿","南：十长老殿↓"));
			}});
		maps.add(place);
		
		place = new Place("八长老殿",new ArrayList<Direction>(){{
			add(new Direction("七长老殿","北：七长老殿↑"));
			add(new Direction("九长老殿","南：九长老殿↓"));
			}});
		maps.add(place);
		
		place = new Place("七长老殿",new ArrayList<Direction>(){{
			add(new Direction("六长老殿","北：六长老殿↑"));
			add(new Direction("八长老殿","南：八长老殿↓"));
			}});
		maps.add(place);
		
		place = new Place("六长老殿",new ArrayList<Direction>(){{
			add(new Direction("神殿","北：神殿↑"));
			add(new Direction("七长老殿","南：七长老殿↓"));
			}});
		maps.add(place);
		
		place = new Place("神殿",new ArrayList<Direction>(){{
			//todo
			//add(new Direction("山顶小屋","北：山顶小屋↑"));
			add(new Direction("后山(魔教1)","西：后山←"));
			add(new Direction("六长老殿","南：六长老殿↓"));
			}});
		maps.add(place);
		
		place = new Place("后山(魔教1)",new ArrayList<Direction>(){{
			add(new Direction("神殿","东：神殿→"));
			}});
		maps.add(place);
		
		//++++++++++++++++++++++++洛阳++++++++++++++++++++++++++++++++++++++++=

		place = new Place("驿道(洛阳1)",new ArrayList<Direction>(){{
			add(new Direction("潼关","西：潼关←"));
			add(new Direction("驿道(洛阳2)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(洛阳2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳1)","西：驿道←"));
			add(new Direction("洛阳","东：洛阳→"));
			}});
		maps.add(place);
		
		place = new Place("洛阳",new ArrayList<Direction>(){{
			//add(new Direction("驿道(洛阳3)","北：驿道↑"));
			//todo
			add(new Direction("驿道(洛阳2)","西：驿道←"));
			add(new Direction("驿道(洛阳4)","东：驿道→"));
			add(new Direction("驿道(洛阳5)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(洛阳5)",new ArrayList<Direction>(){{
			add(new Direction("洛阳","北：洛阳↑"));
			add(new Direction("驿道(洛阳6)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(洛阳6)",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳5)","北：驿道↑"));
			//add(new Direction("木屋","西：木屋←"));
			//todo
			add(new Direction("天龙门","东：天龙门→"));
			add(new Direction("驿道(洛阳7)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("天龙门",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳6)","西：驿道←"));
			add(new Direction("走廊(天龙1)","东：走廊→"));
			}});
		maps.add(place);
		
		place = new Place("走廊(天龙1)",new ArrayList<Direction>(){{
			add(new Direction("天龙门","西：天龙门←"));
			add(new Direction("走廊(天龙2)","东：走廊→"));
			}});
		maps.add(place);
		
		place = new Place("走廊(天龙2)",new ArrayList<Direction>(){{
			add(new Direction("走廊(天龙1)","西：走廊←"));
			add(new Direction("养生门","东：养生门→"));
			}});
		maps.add(place);
		
		place = new Place("养生门",new ArrayList<Direction>(){{
			add(new Direction("走廊(天龙2)","西：走廊←"));
			add(new Direction("中央花园","东：中央花园→"));
			}});
		maps.add(place);
		
		place = new Place("中央花园",new ArrayList<Direction>(){{
			add(new Direction("地户门","北：地户门↑"));
			add(new Direction("养生门","西：养生门←"));
			add(new Direction("生死门","东：生死门→"));
			add(new Direction("天齐门","南：天齐门↓"));
			}});
		maps.add(place);
		
		place = new Place("地户门",new ArrayList<Direction>(){{
			add(new Direction("清幽小道(天龙北1)","北：清幽小道↑"));
			add(new Direction("中央花园","南：中央花园↓"));
			}});
		maps.add(place);
		
		place = new Place("清幽小道(天龙北1)",new ArrayList<Direction>(){{
			add(new Direction("地户门","南：地户门↓"));
			}});
		maps.add(place);
		
		place = new Place("生死门",new ArrayList<Direction>(){{
			add(new Direction("中央花园","西：中央花园←"));
			add(new Direction("八部殿","东：八部殿→"));
			}});
		maps.add(place);
		
		place = new Place("八部殿",new ArrayList<Direction>(){{
			add(new Direction("摩呼罗迦处","北：摩呼罗迦处↑"));
			add(new Direction("生死门","西：生死门←"));
			add(new Direction("八部后殿","东：八部后殿→"));
			}});
		maps.add(place);
		
		place = new Place("摩呼罗迦处",new ArrayList<Direction>(){{
			add(new Direction("夜叉所","北：夜叉所↑"));
			add(new Direction("八部殿","南：八部殿↓"));
			}});
		maps.add(place);
		
		place = new Place("夜叉所",new ArrayList<Direction>(){{
			add(new Direction("龙栖息地","北：龙栖息地↑"));
			add(new Direction("摩呼罗迦处","南：摩呼罗迦处↓"));
			}});
		maps.add(place);
		
		place = new Place("龙栖息地",new ArrayList<Direction>(){{
			add(new Direction("夜叉所","南：夜叉所↓"));
			}});
		maps.add(place);
		
		place = new Place("八部后殿",new ArrayList<Direction>(){{
			add(new Direction("八部殿","西：八部殿←"));
			add(new Direction("圣地","东：圣地→"));
			}});
		maps.add(place);
		
		place = new Place("圣地",new ArrayList<Direction>(){{
			add(new Direction("八部后殿","西：八部后殿←"));
			add(new Direction("圣地中心","东：圣地中心→"));
			}});
		maps.add(place);
		
		place = new Place("圣地中心",new ArrayList<Direction>(){{
			add(new Direction("圣地","西：圣地←"));
			}});
		maps.add(place);
		
		place = new Place("天齐门",new ArrayList<Direction>(){{
			add(new Direction("中央花园","北：中央花园↑"));
			add(new Direction("隐居小道(天龙南1)","南：隐居小道↓"));
			}});
		maps.add(place);
		
		place = new Place("隐居小道(天龙南1)",new ArrayList<Direction>(){{
			add(new Direction("天齐门","北：天齐门↑"));
			add(new Direction("隐居小道(天龙南2)","南：隐居小道↓"));
			}});
		maps.add(place);
		
		place = new Place("隐居小道(天龙南2)",new ArrayList<Direction>(){{
			add(new Direction("隐居小道(天龙南1)","北：隐居小道↑"));
			add(new Direction("小径(天龙西1)","西：小径←"));
			add(new Direction("小径(天龙东1)","东：小径→"));
			add(new Direction("隐居小道(天龙南3)","南：隐居小道↓"));
			}});
		maps.add(place);
		
		place = new Place("小径(天龙西1)",new ArrayList<Direction>(){{
			add(new Direction("乾达婆居处","西：乾达婆居处←"));
			add(new Direction("隐居小道(天龙南2)","东：隐居小道→"));
			}});
		maps.add(place);
		
		place = new Place("乾达婆居处",new ArrayList<Direction>(){{
			add(new Direction("小径(天龙西1)","东：小径→"));
			}});
		maps.add(place);
		
		place = new Place("小径(天龙东1)",new ArrayList<Direction>(){{
			add(new Direction("隐居小道(天龙南2)","西：隐居小道←"));
			add(new Direction("迦楼罗居处","东：迦楼罗居处→"));
			}});
		maps.add(place);
		
		place = new Place("迦楼罗居处",new ArrayList<Direction>(){{
			add(new Direction("小径(天龙东1)","西：小径←"));
			}});
		maps.add(place);
		
		place = new Place("隐居小道(天龙南3)",new ArrayList<Direction>(){{
			add(new Direction("隐居小道(天龙南2)","北：隐居小道↑"));
			add(new Direction("小径(天龙西2)","西：小径←"));
			add(new Direction("小径(天龙东2)","东：小径→"));
			}});
		maps.add(place);
		
		place = new Place("小径(天龙西2)",new ArrayList<Direction>(){{
			add(new Direction("紧那罗居处","西：紧那罗居处←"));
			add(new Direction("隐居小道(天龙南3)","东：隐居小道→"));
			}});
		maps.add(place);
		
		place = new Place("紧那罗居处",new ArrayList<Direction>(){{
			add(new Direction("小径(天龙西2)","东：小径→"));
			}});
		maps.add(place);
		
		place = new Place("小径(天龙东2)",new ArrayList<Direction>(){{
			add(new Direction("隐居小道(天龙南3)","西：隐居小道←"));
			add(new Direction("阿修罗处","东：阿修罗处→"));
			}});
		maps.add(place);
		
		place = new Place("阿修罗处",new ArrayList<Direction>(){{
			add(new Direction("小径(天龙东2)","西：小径←"));
			}});
		maps.add(place);
		
		//++++++++++++++++天龙+++++++++++++++++++++=
		
		place = new Place("驿道(洛阳7)",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳6)","北：驿道↑"));
			add(new Direction("驿道(洛阳8)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(洛阳8)",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳7)","北：驿道↑"));
			add(new Direction("武汉","南：武汉↓"));
			}});
		maps.add(place);
		
		
		
		place = new Place("武汉",new ArrayList<Direction>(){{
			add(new Direction("驿道(洛阳8)","北：驿道↑"));
			add(new Direction("驿道(成都1)","西：驿道←"));
			//add(new Direction("驿道(上海1)","东：驿道→"));
			//todo
			add(new Direction("驿道(广州1)","南：驿道↓"));
			}});
		maps.add(place);
		
		//+++++++++++++++++++++五岳+++++++++++++++++++++++++++++++
		place = new Place("驿道(广州1)",new ArrayList<Direction>(){{
			add(new Direction("武汉","北：武汉↑"));
			add(new Direction("驿道(广州2)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(广州2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(广州1)","北：驿道↑"));
			add(new Direction("山脚","东：山脚→"));
			//add(new Direction("驿道(广州3)","南：驿道↓"));
			//todo
			}});
		maps.add(place);
		
		place = new Place("山脚",new ArrayList<Direction>(){{
			add(new Direction("驿道(广州2)","西：驿道←"));
			add(new Direction("小亭","南：小亭↓"));
			}});
		maps.add(place);
		
		place = new Place("小亭",new ArrayList<Direction>(){{
			add(new Direction("山脚","北：山脚↑"));
			add(new Direction("瀑布","南：瀑布↓"));
			}});
		maps.add(place);
		
		place = new Place("瀑布",new ArrayList<Direction>(){{
			add(new Direction("小亭","北：小亭↑"));
			add(new Direction("晚月庄","东：晚月庄→"));
			add(new Direction("山腰","南：山腰↓"));
			}});
		maps.add(place);
		
		place = new Place("晚月庄",new ArrayList<Direction>(){{
			add(new Direction("瀑布","西：瀑布←"));
			}});
		maps.add(place);
		
		place = new Place("山腰",new ArrayList<Direction>(){{
			add(new Direction("瀑布","北：瀑布↑"));
			add(new Direction("练剑池","东：练剑池→"));
			add(new Direction("松林","南：松林↓"));
			}});
		maps.add(place);
		
		place = new Place("练剑池",new ArrayList<Direction>(){{
			add(new Direction("山腰","西：山腰←"));
			}});
		maps.add(place);
		
		place = new Place("松林",new ArrayList<Direction>(){{
			add(new Direction("山腰","北：山腰↑"));
			add(new Direction("石屋(五岳1)","南：石屋↓"));
			}});
		maps.add(place);
		
		place = new Place("石屋(五岳1)",new ArrayList<Direction>(){{
			add(new Direction("松林","北：松林↑"));
			add(new Direction("石屋(五岳2)","南：石屋↓"));
			}});
		maps.add(place);
		
		place = new Place("石屋(五岳2)",new ArrayList<Direction>(){{
			add(new Direction("石屋(五岳1)","北：石屋↑"));
			add(new Direction("石屋(五岳3)","南：石屋↓"));
			}});
		maps.add(place);
		
		place = new Place("石屋(五岳3)",new ArrayList<Direction>(){{
			add(new Direction("石屋(五岳2)","北：石屋↑"));
			add(new Direction("石屋(五岳4)","南：石屋↓"));
			}});
		maps.add(place);
		
		place = new Place("石屋(五岳4)",new ArrayList<Direction>(){{
			add(new Direction("石屋(五岳3)","北：石屋↑"));
			add(new Direction("休息室(五岳1)","东：休息室→"));
			add(new Direction("剑气居","南：剑气居↓"));
			}});
		maps.add(place);
		
		place = new Place("休息室(五岳1)",new ArrayList<Direction>(){{
			add(new Direction("石屋(五岳4)","西：石屋←"));
			}});
		maps.add(place);
		
		place = new Place("剑气居",new ArrayList<Direction>(){{
			add(new Direction("石屋(五岳4)","北：石屋↑"));
			add(new Direction("修为斋","南：修为斋↓"));
			}});
		maps.add(place);
		
		place = new Place("修为斋",new ArrayList<Direction>(){{
			add(new Direction("剑气居","北：剑气居↑"));
			}});
		maps.add(place);
		
		//+++++++++++++++++++++少林+++++++++++++++++++++++++++++++
		place = new Place("驿道(洛阳4)",new ArrayList<Direction>(){{
			add(new Direction("洛阳","西：洛阳←"));
			add(new Direction("驿道(少林1)","东：驿道→"));
			}});
		maps.add(place);	
		
		place = new Place("驿道(少林1)",new ArrayList<Direction>(){{
			add(new Direction("石阶","北：石阶↑"));
			add(new Direction("驿道(洛阳4)","西：驿道←"));
			add(new Direction("驿道(少林2)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(少林2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(少林1)","西：驿道←"));
			add(new Direction("济南","东：济南→"));
			}});
		maps.add(place);
		
		place = new Place("济南",new ArrayList<Direction>(){{
			add(new Direction("驿道(少林2)","西：驿道←"));
			}});
		maps.add(place);
		
		place = new Place("石阶",new ArrayList<Direction>(){{
			add(new Direction("广场(少林1)","北：广场↑"));
			add(new Direction("驿道(少林1)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("广场(少林1)",new ArrayList<Direction>(){{
			add(new Direction("山门殿","北：山门殿↑"));
			add(new Direction("松树林(少林1)","西：松树林←"));
			add(new Direction("松树林(少林2)","东：松树林→"));
			add(new Direction("石阶","南：石阶↓"));
			}});
		maps.add(place);
		
		place = new Place("松树林(少林1)",new ArrayList<Direction>(){{
			add(new Direction("广场(少林1)","东：广场→"));
			}});
		maps.add(place);
		
		place = new Place("松树林(少林2)",new ArrayList<Direction>(){{
			add(new Direction("广场(少林1)","西：广场←"));
			}});
		maps.add(place);
		
		place = new Place("山门殿",new ArrayList<Direction>(){{
			add(new Direction("台阶","北：台阶↑"));
			add(new Direction("广场(少林1)","南：广场↓"));
			}});
		maps.add(place);
		
		place = new Place("台阶",new ArrayList<Direction>(){{
			add(new Direction("天王殿","北：天王殿↑"));
			add(new Direction("山门殿","南：山门殿↓"));
			}});
		maps.add(place);
		
		place = new Place("天王殿",new ArrayList<Direction>(){{
			add(new Direction("大雄宝殿","北：大雄宝殿↑"));
			add(new Direction("习武场(少林1)","西：习武场←"));
			add(new Direction("习武场(少林2)","东：习武场→"));
			add(new Direction("台阶","南：台阶↓"));
			}});
		maps.add(place);
		
		place = new Place("习武场(少林1)",new ArrayList<Direction>(){{
			add(new Direction("天王殿","东：天王殿→"));
			}});
		maps.add(place);
		
		place = new Place("习武场(少林2)",new ArrayList<Direction>(){{
			add(new Direction("天王殿","西：天王殿←"));
			}});
		maps.add(place);
		
		place = new Place("大雄宝殿",new ArrayList<Direction>(){{
			add(new Direction("后殿(少林1)","北：后殿↑"));
			add(new Direction("练功长廊","西：练功长廊←"));
			add(new Direction("休息室(少林1)","东：休息室→"));
			add(new Direction("天王殿","南：天王殿↓"));
			}});
		maps.add(place);
		
		place = new Place("休息室(少林1)",new ArrayList<Direction>(){{
			add(new Direction("大雄宝殿","西：大雄宝殿←"));
			}});
		maps.add(place);
		
		place = new Place("练功长廊",new ArrayList<Direction>(){{
			add(new Direction("大雄宝殿","东：大雄宝殿→"));
			}});
		maps.add(place);
		
		place = new Place("后殿(少林1)",new ArrayList<Direction>(){{
			add(new Direction("方丈室","北：方丈室↑"));
			add(new Direction("般若堂","西：般若堂←"));
			add(new Direction("罗汉堂","东：罗汉堂→"));
			add(new Direction("大雄宝殿","南：大雄宝殿↓"));
			}});
		maps.add(place);
		
		place = new Place("般若堂",new ArrayList<Direction>(){{
			add(new Direction("后殿(少林1)","东：后殿→"));
			}});
		maps.add(place);
		
		place = new Place("罗汉堂",new ArrayList<Direction>(){{
			add(new Direction("后殿(少林1)","西：后殿←"));
			}});
		maps.add(place);
		
		place = new Place("方丈室",new ArrayList<Direction>(){{
			add(new Direction("达摩院","北：达摩院↑"));
			add(new Direction("藏经阁","西：藏经阁←"));
			add(new Direction("武器库","武器库"));
			add(new Direction("后殿(少林1)","南：后殿↓"));
			}});
		maps.add(place);
		
		place = new Place("藏经阁",new ArrayList<Direction>(){{
			add(new Direction("方丈室","东：方丈室→"));
			}});
		maps.add(place);
		
		place = new Place("武器库",new ArrayList<Direction>(){{
			add(new Direction("方丈室","西：方丈室←"));
			}});
		maps.add(place);
		
		place = new Place("达摩院",new ArrayList<Direction>(){{
			add(new Direction("竹林(少林1)","北：竹林↑"));
			//add(new Direction("后山","西：后山←"));
			// todo
			//add(new Direction("林中精舍","东：林中精舍→"));
			add(new Direction("方丈室","南：方丈室↓"));
			}});
		maps.add(place);
		
		place = new Place("竹林(少林1)",new ArrayList<Direction>(){{
			add(new Direction("竹林(少林2)","北：竹林↑"));
			//add(new Direction("竹林(少林2)","西：竹林←"));
			//add(new Direction("竹林(少林2)","东：竹林→"));
			add(new Direction("达摩院","南：达摩院↓"));
			}});
		maps.add(place);
		
		place = new Place("竹林(少林2)",new ArrayList<Direction>(){{
			add(new Direction("竹林(少林3)","北：竹林↑"));
			//add(new Direction("竹林(少林2)","西：竹林←"));
			//add(new Direction("竹林(少林2)","东：竹林→"));
			add(new Direction("竹林(少林1)","南：竹林↓"));
			}});
		maps.add(place);
		
		place = new Place("竹林(少林3)",new ArrayList<Direction>(){{
			add(new Direction("达摩洞","北：达摩洞↑"));
			//add(new Direction("竹林(少林2)","西：竹林←"));
			//add(new Direction("竹林(少林2)","东：竹林→"));
			add(new Direction("竹林(少林2)","南：竹林↓"));
			}});
		maps.add(place);
		
		place = new Place("达摩洞",new ArrayList<Direction>(){{
			//add(new Direction("竹林(少林3)","北：竹林↑"));
			//add(new Direction("竹林(少林3)","西：竹林←"));
			//add(new Direction("竹林(少林3)","东：竹林→"));
			add(new Direction("竹林(少林3)","南：竹林↓"));
			}});
		maps.add(place);
				
		//++++++++++++++++++++成都++++++++++++++++++++++++++++===
		
		place = new Place("驿道(成都1)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都2)","西：驿道←"));
			add(new Direction("武汉","东：武汉→"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都3)","西：驿道←"));
			add(new Direction("驿道(成都1)","东：驿道→"));
			add(new Direction("乱石岗","南：乱石岗↓"));
			}});
		maps.add(place);
		
		place = new Place("乱石岗",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都2)","北：驿道↑"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都3)",new ArrayList<Direction>(){{
			add(new Direction("成都东门","西：成都东门←"));
			add(new Direction("驿道(成都2)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("成都东门",new ArrayList<Direction>(){{
			add(new Direction("东大街(成都1)","西：东大街←"));
			add(new Direction("驿道(成都3)","东：驿道→"));
			}});
		maps.add(place);
		
		place = new Place("东大街(成都1)",new ArrayList<Direction>(){{
			add(new Direction("成都药铺","北：成都药铺↑"));
			add(new Direction("东大街(成都2)","西：东大街←"));
			add(new Direction("成都东门","东：成都东门→"));
			//add(new Direction("唐记当铺","南：唐记当铺↓"));
			//todo
			}});
		maps.add(place);
		
		place = new Place("成都药铺",new ArrayList<Direction>(){{
			add(new Direction("东大街(成都1)","南：东大街↓"));
			}});
		maps.add(place);
		
		place = new Place("东大街(成都2)",new ArrayList<Direction>(){{
			add(new Direction("散花楼","北：散花楼↑"));
			add(new Direction("市中心(成都1)","西：市中心←"));
			add(new Direction("东大街(成都1)","东：东大街→"));
			//add(new Direction("天府钱庄","南：天府钱庄↓"));
			//todo
			}});
		maps.add(place);
		
		place = new Place("市中心(成都1)",new ArrayList<Direction>(){{
			add(new Direction("北大街(成都1)","北：北大街↑"));
			add(new Direction("西大街(成都1)","西：西大街←"));
			//todo
			add(new Direction("东大街(成都2)","东：东大街→"));
			add(new Direction("南大街(成都1)","南：南大街↓"));
			}});
		maps.add(place);

		place = new Place("西大街(成都1)",new ArrayList<Direction>(){{
			add(new Direction("成都西门","西：成都西门←"));
			add(new Direction("市中心(成都1)","东：市中心→"));
			add(new Direction("唐门","南：唐门↓"));
		}});
		maps.add(place);

		place = new Place("唐门",new ArrayList<Direction>(){{
			add(new Direction("西大街(成都1)","北：西大街↑"));
		}});
		maps.add(place);

		place = new Place("成都西门",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都6)","西：驿道←"));
			add(new Direction("西大街(成都1)","东：西大街→"));
		}});
		maps.add(place);

		place = new Place("驿道(成都6)",new ArrayList<Direction>(){{
			add(new Direction("青城山","北：青城山↑"));
			add(new Direction("驿道(成都7)","西：驿道←"));
			add(new Direction("成都西门","东：成都西门→"));
//			add(new Direction("峨嵋山","南：峨嵋山↓"));
			//todo
		}});
		maps.add(place);

		place = new Place("青城山",new ArrayList<Direction>(){{
			add(new Direction("建福宫","北：建福宫↑"));
			add(new Direction("驿道(成都6)","南：驿道↓"));
		}});
		maps.add(place);

		place = new Place("建福宫",new ArrayList<Direction>(){{
			add(new Direction("盘山磴道","北：盘山磴道↑"));
			add(new Direction("青城山","南：青城山↓"));
		}});
		maps.add(place);

		place = new Place("盘山磴道",new ArrayList<Direction>(){{
			add(new Direction("天然图画","北：天然图画↑"));
			add(new Direction("飞仙亭","西：飞仙亭←"));
			add(new Direction("山神庙","东：山神庙→"));
			add(new Direction("建福宫","南：建福宫↓"));
		}});
		maps.add(place);

		place = new Place("飞仙亭",new ArrayList<Direction>(){{
			add(new Direction("盘山磴道","东：盘山磴道→"));
		}});
		maps.add(place);

		place = new Place("山神庙",new ArrayList<Direction>(){{
			add(new Direction("盘山磴道","西：盘山磴道←"));
		}});
		maps.add(place);

		place = new Place("天然图画",new ArrayList<Direction>(){{
			add(new Direction("龙隐栈道","北：龙隐栈道↑"));
			add(new Direction("八卦台","西：八卦台←"));
			add(new Direction("鬼城山","东：鬼城山→"));
			add(new Direction("盘山磴道","南：盘山磴道↓"));
		}});
		maps.add(place);

		place = new Place("八卦台",new ArrayList<Direction>(){{
			add(new Direction("天然图画","东：天然图画→"));
		}});
		maps.add(place);

		place = new Place("鬼城山",new ArrayList<Direction>(){{
			add(new Direction("天然图画","西：天然图画←"));
		}});
		maps.add(place);

		place = new Place("龙隐栈道",new ArrayList<Direction>(){{
			add(new Direction("天师洞","北：天师洞↑"));
			add(new Direction("五龙沟","西：五龙沟←"));
			add(new Direction("丈人峰","东：丈人峰→"));
			add(new Direction("天然图画","南：天然图画↓"));
		}});
		maps.add(place);

		place = new Place("五龙沟",new ArrayList<Direction>(){{
			add(new Direction("龙隐栈道","东：龙隐栈道→"));
		}});
		maps.add(place);

		place = new Place("丈人峰",new ArrayList<Direction>(){{
			add(new Direction("龙隐栈道","西：龙隐栈道←"));
		}});
		maps.add(place);

		place = new Place("天师洞",new ArrayList<Direction>(){{
			add(new Direction("飞泉沟","北：飞泉沟↑"));
			add(new Direction("古银杏树","西：古银杏树←"));
			add(new Direction("三岛石","东：三岛石→"));
			add(new Direction("龙隐栈道","南：龙隐栈道↓"));
		}});
		maps.add(place);

		place = new Place("古银杏树",new ArrayList<Direction>(){{
			add(new Direction("天师洞","东：天师洞→"));
		}});
		maps.add(place);

		place = new Place("三岛石",new ArrayList<Direction>(){{
			add(new Direction("天师洞","西：天师洞←"));
		}});
		maps.add(place);

		place = new Place("飞泉沟",new ArrayList<Direction>(){{
			add(new Direction("观日亭","北：观日亭↑"));
			add(new Direction("熊耳山","西：熊耳山←"));
			add(new Direction("四望台","东：四望台→"));
			add(new Direction("天师洞","南：天师洞↓"));
		}});
		maps.add(place);

		place = new Place("熊耳山",new ArrayList<Direction>(){{
			add(new Direction("飞泉沟","东：飞泉沟→"));
		}});
		maps.add(place);

		place = new Place("四望台",new ArrayList<Direction>(){{
			add(new Direction("飞泉沟","西：飞泉沟←"));
		}});
		maps.add(place);

		place = new Place("观日亭",new ArrayList<Direction>(){{
			add(new Direction("上清宫","北：上清宫↑"));
			add(new Direction("百丈桥","西：百丈桥←"));
			add(new Direction("云海亭","东：云海亭→"));
			add(new Direction("飞泉沟","南：飞泉沟↓"));
		}});
		maps.add(place);

		place = new Place("百丈桥",new ArrayList<Direction>(){{
			add(new Direction("观日亭","东：观日亭→"));
		}});
		maps.add(place);

		place = new Place("云海亭",new ArrayList<Direction>(){{
			add(new Direction("观日亭","西：观日亭←"));
		}});
		maps.add(place);

		place = new Place("上清宫",new ArrayList<Direction>(){{
			add(new Direction("呼应亭","北：呼应亭↑"));
			add(new Direction("鸳鸯井","西：鸳鸯井←"));
			add(new Direction("松风观","东：松风观→"));
			add(new Direction("观日亭","南：观日亭↓"));
		}});
		maps.add(place);

		place = new Place("鸳鸯井",new ArrayList<Direction>(){{
			add(new Direction("上清宫","东：上清宫→"));
		}});
		maps.add(place);

		place = new Place("松风观",new ArrayList<Direction>(){{
			add(new Direction("上清宫","西：上清宫←"));
		}});
		maps.add(place);

		place = new Place("呼应亭",new ArrayList<Direction>(){{
			add(new Direction("朝阳洞","西：朝阳洞←"));
			add(new Direction("悬崖底","东：悬崖底→"));
			add(new Direction("上清宫","南：上清宫↓"));
		}});
		maps.add(place);

		place = new Place("驿道(成都7)",new ArrayList<Direction>(){{
//			add(new Direction("百花谷","北：百花谷↑"));
			add(new Direction("驿道(成都8)","西：驿道←"));
			add(new Direction("驿道(成都6)","东：驿道→"));
		}});
		maps.add(place);

		place = new Place("驿道(成都8)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都9)","西：驿道←"));
			add(new Direction("驿道(成都7)","东：驿道→"));
		}});
		maps.add(place);

		place = new Place("驿道(成都9)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都10)","西：驿道←"));
			add(new Direction("驿道(成都8)","东：驿道→"));
		}});
		maps.add(place);

		place = new Place("驿道(成都10)",new ArrayList<Direction>(){{
			add(new Direction("拉萨","西：拉萨←"));
			add(new Direction("驿道(成都9)","东：驿道→"));
		}});
		maps.add(place);

		place = new Place("拉萨",new ArrayList<Direction>(){{
			add(new Direction("戈壁","北：戈壁↑"));
			add(new Direction("驿道(成都10)","东：驿道→"));
		}});
		maps.add(place);
		
		place = new Place("南大街(成都1)",new ArrayList<Direction>(){{
			add(new Direction("市中心(成都1)","北：市中心↑"));
			add(new Direction("成都南门","南：成都南门↓"));
			}});
		maps.add(place);
		
		place = new Place("成都南门",new ArrayList<Direction>(){{
			add(new Direction("南大街(成都1)","北：南大街↑"));
			add(new Direction("驿道(成都南1)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都南1)",new ArrayList<Direction>(){{
			add(new Direction("成都南门","北：成都南门↑"));
			//add(new Direction("大雪山山路","西：大雪山山路←"));
			add(new Direction("驿道(成都南2)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都南2)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都南1)","北：驿道↑"));
			add(new Direction("驿道(成都南3)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都南3)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都南1)","北：驿道↑"));
			add(new Direction("苍山","西：苍山←"));
			//add(new Direction("德化碑","东：德化碑→"));
			add(new Direction("大理北门","南：大理北门↓"));
			}});
		maps.add(place);
		
		place = new Place("苍山",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔","北：宏圣寺塔↑"));
			add(new Direction("川西山路","西：川西山路←"));
			add(new Direction("驿道(成都南3)","东：驿道→"));
			//add(new Direction("路南石林","南：路南石林↓"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔",new ArrayList<Direction>(){{
			add(new Direction("苍山","南：苍山↓"));
			add(new Direction("宏圣寺塔(中)","向上一跃"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔(中)",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔(北)","北：宏圣寺塔↑"));
			add(new Direction("宏圣寺塔(西)","西：宏圣寺塔←"));
			add(new Direction("宏圣寺塔(东)","东：宏圣寺塔→"));
			add(new Direction("宏圣寺塔(南)","南：宏圣寺塔↓"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔(东)",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔(中)","西：宏圣寺塔←"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔(南)",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔(中)","北：宏圣寺塔↑"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔(西)",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔(中)","东：宏圣寺塔→"));
			}});
		maps.add(place);
		
		place = new Place("宏圣寺塔(北)",new ArrayList<Direction>(){{
			add(new Direction("宏圣寺塔(中)","南：宏圣寺塔↓"));
			}});
		maps.add(place);
		
		place = new Place("川西山路",new ArrayList<Direction>(){{
			add(new Direction("大渡河边","西：大渡河边←"));
			add(new Direction("苍山","东：苍山→"));
			}});
		maps.add(place);
		
		place = new Place("大渡河边",new ArrayList<Direction>(){{
			add(new Direction("川西山路","东：川西山路→"));
			}});
		maps.add(place);
		
		place = new Place("大理北门",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都南3)","北：驿道↑"));
			add(new Direction("大和北街","南：大和北街↓"));
			}});
		maps.add(place);
		
		place = new Place("大和北街",new ArrayList<Direction>(){{
			add(new Direction("大理北门","北：大理北门↑"));
			//add(new Direction("御街","西：御街←"));
			//todo
			add(new Direction("王府路","东：王府路→"));
			add(new Direction("中心广场","南：中心广场↓"));
			}});
		maps.add(place);
		
		place = new Place("王府路",new ArrayList<Direction>(){{
			add(new Direction("王府大门","北：王府大门↑"));
			add(new Direction("大和北街","西：大和北街←"));
			}});
		maps.add(place);
		
		place = new Place("王府大门",new ArrayList<Direction>(){{
			add(new Direction("王府大厅","北：王府大厅↑"));
			add(new Direction("王府路","南：王府路↓"));
			}});
		maps.add(place);
		
		place = new Place("王府大厅",new ArrayList<Direction>(){{
			add(new Direction("总理处","北：总理处↑"));
			add(new Direction("帐房","西：帐房←"));
			add(new Direction("庭院","东：庭院→"));
			add(new Direction("王府大门","南：王府大门↓"));
			}});
		maps.add(place);
		
		place = new Place("帐房",new ArrayList<Direction>(){{
			add(new Direction("王府大厅","东：王府大厅→"));
			}});
		maps.add(place);
		
		place = new Place("总理处",new ArrayList<Direction>(){{
			add(new Direction("王府大厅","南：王府大厅↓"));
			}});
		maps.add(place);
		
		place = new Place("庭院",new ArrayList<Direction>(){{
			add(new Direction("厢房","北：厢房↑"));
			add(new Direction("王府大厅","西：王府大厅←"));
			add(new Direction("茶花园","东：茶花园→"));
			}});
		maps.add(place);
		
		place = new Place("茶花园",new ArrayList<Direction>(){{
			add(new Direction("庭院","西：庭院←"));
			}});
		maps.add(place);
		
		place = new Place("厢房",new ArrayList<Direction>(){{
			add(new Direction("庭院","南：庭院↓"));
			}});
		maps.add(place);
		
		place = new Place("中心广场",new ArrayList<Direction>(){{
			add(new Direction("大和北街","北：大和北街↑"));
			add(new Direction("太和西街","西：太和西街←"));
			add(new Direction("太和东街","东：太和东街→"));
			add(new Direction("大和南街","南：大和南街↓"));
			}});
		maps.add(place);
		
		place = new Place("太和西街",new ArrayList<Direction>(){{
			//add(new Direction("大理钱庄","北：大理钱庄↑"));
			//todo
			add(new Direction("大理西门","西：大理西门←"));
			add(new Direction("中心广场","东：中心广场→"));
			//add(new Direction("大理当铺","南：大理当铺↓"));
			}});
		maps.add(place);
		
		place = new Place("大理西门",new ArrayList<Direction>(){{
			add(new Direction("绿玉溪沿岸","西：绿玉溪沿岸←"));
			add(new Direction("太和西街","东：太和西街→"));
			}});
		maps.add(place);
		
		place = new Place("绿玉溪沿岸",new ArrayList<Direction>(){{
			//add(new Direction("古道","北：古道↑"));
			add(new Direction("山路(大理1)","西：山路←"));
			add(new Direction("大理西门","东：大理西门→"));
			}});
		maps.add(place);
		
		place = new Place("山路(大理1)",new ArrayList<Direction>(){{
			add(new Direction("拈花寺门","北：拈花寺门↑"));
			add(new Direction("碧罗雪山","西：碧罗雪山←"));
			add(new Direction("绿玉溪沿岸","东：绿玉溪沿岸→"));
			}});
		maps.add(place);
		
		place = new Place("拈花寺门",new ArrayList<Direction>(){{
			add(new Direction("拈花寺","北：拈花寺↑"));
			add(new Direction("山路(大理1)","南：山路↓"));
			}});
		maps.add(place);
		
		place = new Place("拈花寺",new ArrayList<Direction>(){{
			add(new Direction("拈花寺门","南：拈花寺门↓"));
			add(new Direction("观棋","棋盘"));
			}});
		maps.add(place);
		
		place = new Place("观棋",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,2)","观棋"));
			}});
		maps.add(place);
		//有怪
		place = new Place("碧罗雪山",new ArrayList<Direction>(){{
			add(new Direction("泸水沿岸","西：泸水沿岸←"));
			add(new Direction("山路(大理1)","东：山路→"));
			//add(new Direction("碧罗山下","南：碧罗山下↓"));
			}});
		maps.add(place);
		//有怪
		place = new Place("泸水沿岸",new ArrayList<Direction>(){{
			add(new Direction("碧罗雪山","东：碧罗雪山→"));
			}});
		maps.add(place);
		
		place = new Place("太和东街",new ArrayList<Direction>(){{
			//add(new Direction("太和居","北：太和居↑"));
			add(new Direction("中心广场","西：中心广场←"));
			add(new Direction("大理东门","东：大理东门→"));
			//add(new Direction("大理药铺","南：大理药铺↓"));
			}});
		maps.add(place);
		
		place = new Place("大理东门",new ArrayList<Direction>(){{
			add(new Direction("太和东街","西：太和东街←"));
			add(new Direction("茶花山","东：茶花山→"));
			}});
		maps.add(place);
		
		place = new Place("茶花山",new ArrayList<Direction>(){{
			//add(new Direction("蝴蝶泉","北：蝴蝶泉↑"));
			add(new Direction("大理东门","西：大理东门←"));
			add(new Direction("大叠水瀑布","东：大叠水瀑布→"));
			}});
		maps.add(place);
		
		place = new Place("大叠水瀑布",new ArrayList<Direction>(){{
			add(new Direction("茶花山","西：茶花山←"));
			add(new Direction("金汁河畔","东：金汁河畔→"));
			//add(new Direction("黑龙岭","南：黑龙岭↓"));
			}});
		maps.add(place);
		
		place = new Place("金汁河畔",new ArrayList<Direction>(){{
			//add(new Direction("地藏寺","北：地藏寺↑"));
			add(new Direction("大叠水瀑布","西：大叠水瀑布←"));
			add(new Direction("沿池堤岸","东：沿池堤岸→"));
			}});
		maps.add(place);
		
		place = new Place("沿池堤岸",new ArrayList<Direction>(){{
			add(new Direction("滇池","北：滇池↑"));
			add(new Direction("金汁河畔","西：金汁河畔←"));
			add(new Direction("星云湖畔","东：星云湖畔→"));
			}});
		maps.add(place);
		//有怪
		place = new Place("星云湖畔",new ArrayList<Direction>(){{
			add(new Direction("沿池堤岸","西：沿池堤岸←"));
			//add(new Direction("玉霞山","南：玉霞山↓"));
			}});
		maps.add(place);
		
		place = new Place("滇池",new ArrayList<Direction>(){{
			add(new Direction("黑森林","北：黑森林↑"));
			add(new Direction("沿池堤岸","南：沿池堤岸↓"));
			}});
		maps.add(place);
		//有怪
		place = new Place("黑森林",new ArrayList<Direction>(){{
			add(new Direction("滇池","南：滇池↓"));
			}});
		maps.add(place);
		
		place = new Place("大和南街",new ArrayList<Direction>(){{
			add(new Direction("中心广场","北：中心广场↑"));
			//add(new Direction("土司府","西：土司府←"));
			//add(new Direction("兵营大门","东：兵营大门→"));
			add(new Direction("大理南门","南：大理南门↓"));
			}});
		maps.add(place);
		
		place = new Place("大理南门",new ArrayList<Direction>(){{
			add(new Direction("大和南街","北：大和南街↑"));
			add(new Direction("驿道(大理1)","南：驿道↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(大理1)",new ArrayList<Direction>(){{
			add(new Direction("大理南门","北：大理南门↑"));
			add(new Direction("妃丽湖畔","南：妃丽湖畔↓"));
			}});
		maps.add(place);
		//有怪
		place = new Place("妃丽湖畔",new ArrayList<Direction>(){{
			add(new Direction("驿道(大理1)","北：驿道↑"));
			add(new Direction("黄果树瀑布","南：黄果树瀑布↓"));
			}});
		maps.add(place);
		//有怪
		place = new Place("黄果树瀑布",new ArrayList<Direction>(){{
			add(new Direction("妃丽湖畔","北：妃丽湖畔↑"));
			}});
		maps.add(place);
		
		//+++++++2++++++++++++++++
		place = new Place("棋局(2,2)",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,3)","北：棋局↑"));
			add(new Direction("棋局(1,2)","西：棋局←"));
			add(new Direction("棋局(3,2)","东：棋局→"));
			add(new Direction("棋局(2,1)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(1,2)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,3)","北：棋局↑"));
			add(new Direction("棋局(0,2)","西：棋局←"));
			add(new Direction("棋局(2,2)","东：棋局→"));
			add(new Direction("棋局(1,1)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(0,2)",new ArrayList<Direction>(){{
			add(new Direction("棋局(0,3)","北：棋局↑"));
			add(new Direction("棋局(1,2)","东：棋局→"));
			add(new Direction("棋局(0,1)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(3,2)",new ArrayList<Direction>(){{
			add(new Direction("棋局(3,3)","北：棋局↑"));
			add(new Direction("棋局(2,2)","西：棋局←"));
			add(new Direction("棋局(4,2)","东：棋局→"));
			add(new Direction("棋局(3,1)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(4,2)",new ArrayList<Direction>(){{
			add(new Direction("棋局(4,3)","北：棋局↑"));
			add(new Direction("棋局(3,2)","西：棋局←"));
			add(new Direction("棋局(4,1)","南：棋局↓"));
			}});
		maps.add(place);
		
		//+++++++++++3+++++++++++++++
		place = new Place("棋局(2,3)",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,4)","北：棋局↑"));
			add(new Direction("棋局(1,3)","西：棋局←"));
			add(new Direction("棋局(3,3)","东：棋局→"));
			add(new Direction("棋局(2,2)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(1,3)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,4)","北：棋局↑"));
			add(new Direction("棋局(0,3)","西：棋局←"));
			add(new Direction("棋局(2,3)","东：棋局→"));
			add(new Direction("棋局(1,2)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(0,3)",new ArrayList<Direction>(){{
			add(new Direction("棋局(0,4)","北：棋局↑"));
			add(new Direction("棋局(1,3)","东：棋局→"));
			add(new Direction("棋局(0,2)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(3,3)",new ArrayList<Direction>(){{
			add(new Direction("棋局(3,4)","北：棋局↑"));
			add(new Direction("棋局(2,3)","西：棋局←"));
			add(new Direction("棋局(4,3)","东：棋局→"));
			add(new Direction("棋局(3,2)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(4,3)",new ArrayList<Direction>(){{
			add(new Direction("棋局(4,4)","北：棋局↑"));
			add(new Direction("棋局(3,3)","西：棋局←"));
			add(new Direction("棋局(4,2)","南：棋局↓"));
			}});
		maps.add(place);
		
		//++++++++++4+++++++++++
		
		place = new Place("棋局(2,4)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,4)","西：棋局←"));
			add(new Direction("棋局(3,4)","东：棋局→"));
			add(new Direction("棋局(2,3)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(1,4)",new ArrayList<Direction>(){{
			add(new Direction("棋局(0,4)","西：棋局←"));
			add(new Direction("棋局(2,4)","东：棋局→"));
			add(new Direction("棋局(1,3)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(0,4)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,4)","东：棋局→"));
			add(new Direction("棋局(0,3)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(3,4)",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,4)","西：棋局←"));
			add(new Direction("棋局(4,4)","东：棋局→"));
			add(new Direction("棋局(3,3)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(4,4)",new ArrayList<Direction>(){{
			add(new Direction("棋局(3,4)","西：棋局←"));
			add(new Direction("棋局(4,3)","南：棋局↓"));
			}});
		maps.add(place);
		
		//++++++++++++1++++++++++++
		
		place = new Place("棋局(2,1)",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,2)","北：棋局↑"));
			add(new Direction("棋局(1,1)","西：棋局←"));
			add(new Direction("棋局(3,1)","东：棋局→"));
			add(new Direction("棋局(2,0)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(1,1)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,2)","北：棋局↑"));
			add(new Direction("棋局(0,1)","西：棋局←"));
			add(new Direction("棋局(2,1)","东：棋局→"));
			add(new Direction("棋局(1,0)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(0,1)",new ArrayList<Direction>(){{
			add(new Direction("棋局(0,2)","北：棋局↑"));
			add(new Direction("棋局(1,1)","东：棋局→"));
			add(new Direction("棋局(0,0)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(3,1)",new ArrayList<Direction>(){{
			add(new Direction("棋局(3,2)","北：棋局↑"));
			add(new Direction("棋局(2,1)","西：棋局←"));
			add(new Direction("棋局(4,1)","东：棋局→"));
			add(new Direction("棋局(3,0)","南：棋局↓"));
			}});
		maps.add(place);
		
		place = new Place("棋局(4,1)",new ArrayList<Direction>(){{
			add(new Direction("棋局(4,2)","北：棋局↑"));
			add(new Direction("棋局(3,1)","西：棋局←"));
			add(new Direction("棋局(4,0)","南：棋局↓"));
			}});
		maps.add(place);
		
		//++++++++++++0+++++++++++++
		
		place = new Place("棋局(2,0)",new ArrayList<Direction>(){{
			add(new Direction("棋局(2,1)","北：棋局↑"));
			add(new Direction("棋局(1,0)","西：棋局←"));
			add(new Direction("棋局(3,0)","东：棋局→"));
			}});
		maps.add(place);
		
		place = new Place("棋局(1,0)",new ArrayList<Direction>(){{
			add(new Direction("棋局(1,1)","北：棋局↑"));
			add(new Direction("棋局(0,0)","西：棋局←"));
			add(new Direction("棋局(2,0)","东：棋局→"));
			}});
		maps.add(place);
		
		place = new Place("棋局(0,0)",new ArrayList<Direction>(){{
			add(new Direction("棋局(0,1)","北：棋局↑"));
			add(new Direction("棋局(1,0)","东：棋局→"));
			}});
		maps.add(place);
		
		place = new Place("棋局(3,0)",new ArrayList<Direction>(){{
			add(new Direction("棋局(3,1)","北：棋局↑"));
			add(new Direction("棋局(2,0)","西：棋局←"));
			add(new Direction("棋局(4,0)","东：棋局→"));
			}});
		maps.add(place);
		
		place = new Place("棋局(4,0)",new ArrayList<Direction>(){{
			add(new Direction("棋局(4,1)","北：棋局↑"));
			add(new Direction("棋局(3,0)","西：棋局←"));
			}});
		maps.add(place);
		
		
		place = new Place("北大街(成都1)",new ArrayList<Direction>(){{
			add(new Direction("成都北门","北：成都北门↑"));
			//add(new Direction("听雨居","西：听雨居←"));
			add(new Direction("散花楼","东：散花楼→"));
			add(new Direction("市中心(成都1)","南：市中心↓"));
			}});
		maps.add(place);
		
		place = new Place("散花楼",new ArrayList<Direction>(){{
			add(new Direction("北大街(成都1)","西：北大街←"));
			add(new Direction("东大街(成都2)","南：东大街↓"));
			}});
		maps.add(place);
		
		place = new Place("成都北门",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都4)","北：驿道↑"));
			add(new Direction("北大街(成都1)","南：北大街↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都4)",new ArrayList<Direction>(){{
			add(new Direction("驿道(成都5)","北：驿道↑"));
			add(new Direction("成都北门","南：成都北门↓"));
			}});
		maps.add(place);
		
		place = new Place("驿道(成都5)",new ArrayList<Direction>(){{
			add(new Direction("秦岭","北：秦岭↑"));
			//add(new Direction("终南山脚","东：终南山脚→"));
			add(new Direction("驿道(成都4)","南：驿道↓"));
			}});
		maps.add(place);

		for (Place placeTemp:maps) {
			PLACENAME_MAP.put(placeTemp.getName(),placeTemp);
			if(placeTemp.getDescription()!=null){
				DESCRIPTION_MAP.put(placeTemp.getDescription(),placeTemp);
			}
		}
	}
	
	public static Place getPlaceByName(String name){
		for (Place place : maps) {
			//System.out.println(place.getName());
			if(place.getName().equals(name)){
				return place;
			}
		}
		return null;
	}
	
	public static void getRoute(Place place, String targetPlaceName, LinkedList<String> stateList, LinkedList<String> textList, List<String> result){
		//System.out.println(place);
		List<Direction> directions = place.getDirection();
		a:for (Direction direction : directions) {
			String name = direction.getName();
			String text = direction.getText();
			if(stateList.contains(name)){
				continue;
			}//北：圆月山庄(8,3)↑
			if(text.indexOf("圆月山庄(")>-1){
				for (String text2 : textList) {
					if(text2.indexOf("圆月山庄(")>-1){
						String substring = text2.substring(0,1);
						switch (substring) {
						case "东":
							if(text.substring(0, 1).indexOf("西")>-1){
								continue a;
							}
							break;
						case "西":
							if(text.substring(0, 1).indexOf("东")>-1){
								continue a;
							}
							break;
						case "南":
							if(text.substring(0, 1).indexOf("北")>-1){
								continue a;
							}
							break;
						case "北":
							if(text.substring(0, 1).indexOf("南")>-1){
								continue a;
							}
							break;
						default:
							break;
						}
					}
				}
			}
			if(targetPlaceName.indexOf("圆月山庄")==-1&&text.indexOf("：圆月山庄(")>-1){
				return;
			}
			//System.out.println(name+"::::"+text);
			
			Place childPlace = getPlaceByName(name);
			if(childPlace==null){
				continue;//如果没有收录该地点
			}
			stateList.add(name);
			textList.add(text);
			//System.out.println(name+"::::;;"+text);
			if(name.equals(targetPlaceName)){
				/*System.out.println("找到了");
				System.out.println(textList);*/
				//LinkedList<String> tempList = new LinkedList<String>(textList);
				if(result.size()==0){
					result.addAll(new ArrayList<String>(textList));
				}
				//System.out.println(textList.size()+":"+textList);
				if(textList.size()<result.size()){
					result.clear();
					result.addAll(new ArrayList<String>(textList));
				}
				stateList.removeLast();
				textList.removeLast();
				//break;
				return;
			}
			getRoute(childPlace,targetPlaceName,stateList,textList,result);
			//if(!getRoute(childPlace,targetPlaceName,stateList,textList,result)){
				stateList.removeLast();
				textList.removeLast();
			//}
		}
		return;
	}
	
	public static List<String> findRoute(String startPlaceName,String targetPlaceName){
		LinkedList<String> stateList = new LinkedList<String>();
		LinkedList<String> textList = new LinkedList<String>();
		//LinkedList<Map<String,Object>> workQueue = new LinkedList<Map<String,Object>>();
		List<String> result = new ArrayList<String>();
		Place startPlace = getPlaceByName(startPlaceName);
		getRoute(startPlace, targetPlaceName,stateList,textList,result);
		System.out.println(result);
		return result;
	}
	
	public static void testRepidMapName(){
		Map<String,Integer> param = new HashMap<String,Integer>();
		for (Place place : maps) {
			String name = place.getName();
			Integer integer = param.get(name);
			if(integer==null){
				param.put(name, 1);
			}else{
				param.put(name, ++integer);
			}
		}
		for (String name : param.keySet()) {
			if(param.get(name)>=2){
				System.out.println(name+":"+param.get(name));
			}
			
		}
	}

	public static void addFirstPage(){
		for (Place place2:maps) {
			//if(place2.getName().equals("钱庄(存取钱)")){
				place2.getDirection().add(new Direction("首页","返回首页"));
			//}
		}

		Place place = new Place("首页",new ArrayList<Direction>(){{
			add(new Direction("新手村广场","新手村"));
			add(new Direction("江湖论坛","江湖论坛"));
		}});
		maps.add(place);
	}

	/*public static void main(String[] args) {
		initMap();
		long l = System.currentTimeMillis();
		List<String> route = findRoute("钱庄(存取钱)", "乱石岗");
		System.out.println(route.size()+"步");
		System.out.println(System.currentTimeMillis()-l+"毫秒");
	}*/

	
}

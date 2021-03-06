package com.jida.common.util;
/**
 * Java: Dijkstra算法获取最短路径(邻接表)
 *
 * @author skywang
 * @date 2014/04/24
 */

import com.jida.entity.Direction;
import com.jida.entity.Place;

import java.util.*;

public class ListUDG2 {
  static Map<String,String> routeMap = new HashMap<>();
  private static int INF = Integer.MAX_VALUE;

  // 邻接表中表对应的链表的顶点
  private class ENode {
    String name;
    int ivex;       // 该边所指向的顶点的位置
    int weight;     // 该边的权
    ENode nextEdge; // 指向下一条弧的指针
    EData nextEData;
    String edataName;
    Map<String,String> edatamap = new HashMap<>();
  }

  // 邻接表中表的顶点
  private class VNode {
    String data;          // 顶点信息
    ENode firstEdge;    // 指向第一条依附该顶点的弧
  };

  private int mEdgNum;    // 边的数量
  private VNode[] mVexs;  // 顶点数组


  /*
   * 创建图(自己输入数据)
   */
  public ListUDG2() {

    // 输入"顶点数"和"边数"
    System.out.printf("input vertex number: ");
    int vlen = readInt();
    System.out.printf("input edge number: ");
    int elen = readInt();
    if ( vlen < 1 || elen < 1 || (elen > (vlen*(vlen - 1)))) {
      System.out.printf("input error: invalid parameters!\n");
      return ;
    }

    // 初始化"顶点"
    mVexs = new VNode[vlen];
    for (int i = 0; i < mVexs.length; i++) {
      System.out.printf("vertex(%d): ", i);
      mVexs[i] = new VNode();
      mVexs[i].data = readChar();
      mVexs[i].firstEdge = null;
    }

    // 初始化"边"
    mEdgNum = elen;
    for (int i = 0; i < elen; i++) {
      // 读取边的起始顶点和结束顶点
      System.out.printf("edge(%d):", i);
      String c1 = readChar();
      String c2 = readChar();
      int weight = readInt();

      int p1 = getPosition(c1);
      int p2 = getPosition(c2);
      // 初始化node1
      ENode node1 = new ENode();
      node1.ivex = p2;
      node1.weight = weight;
      node1.name = c1;
      // 将node1链接到"p1所在链表的末尾"
      if(mVexs[p1].firstEdge == null)
        mVexs[p1].firstEdge = node1;
      else
        linkLast(mVexs[p1].firstEdge, node1);
      // 初始化node2
      ENode node2 = new ENode();
      node2.ivex = p1;
      node2.weight = weight;
      node2.name = c2;
      // 将node2链接到"p2所在链表的末尾"
      if(mVexs[p2].firstEdge == null)
        mVexs[p2].firstEdge = node2;
      else
        linkLast(mVexs[p2].firstEdge, node2);
    }
  }

  /*
   * 创建图(用已提供的矩阵)
   *
   * 参数说明：
   *     vexs  -- 顶点数组
   *     edges -- 边
   */
  public ListUDG2(String[] vexs, EData[] edges) {

    // 初始化"顶点数"和"边数"
    int vlen = vexs.length;
    int elen = edges.length;

    // 初始化"顶点"
    mVexs = new VNode[vlen];
    for (int i = 0; i < mVexs.length; i++) {
      mVexs[i] = new VNode();
      mVexs[i].data = vexs[i];
      mVexs[i].firstEdge = null;
    }

    // 初始化"边"
    mEdgNum = elen;
    for (int i = 0; i < elen; i++) {
      // 读取边的起始顶点和结束顶点
      String c1 = edges[i].start;
      String c2 = edges[i].end;
      int weight = edges[i].weight;
      String edataName = edges[i].name;

      // 读取边的起始顶点和结束顶点
      int p1 = getPosition(c1);
      int p2 = getPosition(c2);
      // 初始化node1
      ENode node1 = new ENode();
      node1.ivex = p2;
      node1.weight = weight;
      node1.name = c2;
      //node1.edatamap.put(c1+"*qq"+c2,edataName);
      node1.edataName = edataName;
      // 将node1链接到"p1所在链表的末尾"
      if(mVexs[p1].firstEdge == null)
        mVexs[p1].firstEdge = node1;
      else
        linkLast(mVexs[p1].firstEdge, node1);
      // 初始化node2
      /*ENode node2 = new ENode();
      node2.ivex = p1;
      node2.weight = weight;
      node2.name = c1;
      //node2.edataName = edataName;
      // 将node2链接到"p2所在链表的末尾"
      try {
        if(mVexs[p2].firstEdge == null) {
          mVexs[p2].firstEdge = node2;
        }else {
          linkLast(mVexs[p2].firstEdge, node2);
        }
      }catch (Exception e){
        e.printStackTrace();
      }*/
    }
    System.out.println();
  }

  /*
   * 将node节点链接到list的最后
   */
  private void linkLast(ENode list, ENode node) {
    ENode p = list;

    while(p.nextEdge!=null){
      p = p.nextEdge;
    }
    p.nextEdge = node;
    //p.edataName = node.edataName;
  }

  /*
   * 返回ch位置
   */
  private int getPosition(String ch) {
    for(int i=0; i<mVexs.length; i++)
      if(mVexs[i].data==ch)
        return i;
    return -1;
  }

  /*
   * 读取一个输入字符
   */
  private String readChar() {
    /*char ch='0';

    do {
      try {
        ch = (char)System.in.read();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } while(!((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')));*/

    return "";
  }

  /*
   * 读取一个输入字符
   */
  private int readInt() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  /*
   * 深度优先搜索遍历图的递归实现
   */
  private void DFS(int i, boolean[] visited) {
    ENode node;

    visited[i] = true;
    System.out.printf("%c ", mVexs[i].data);
    node = mVexs[i].firstEdge;
    while (node != null) {
      if (!visited[node.ivex])
        DFS(node.ivex, visited);
      node = node.nextEdge;
    }
  }

  /*
   * 深度优先搜索遍历图
   */
  public void DFS() {
    boolean[] visited = new boolean[mVexs.length];       // 顶点访问标记

    // 初始化所有顶点都没有被访问
    for (int i = 0; i < mVexs.length; i++)
      visited[i] = false;

    System.out.printf("DFS: ");
    for (int i = 0; i < mVexs.length; i++) {
      if (!visited[i])
        DFS(i, visited);
    }
    System.out.printf("\n");
  }

  /*
   * 广度优先搜索（类似于树的层次遍历）
   */
  public void BFS() {
    int head = 0;
    int rear = 0;
    int[] queue = new int[mVexs.length];            // 辅组队列
    boolean[] visited = new boolean[mVexs.length];  // 顶点访问标记

    for (int i = 0; i < mVexs.length; i++)
      visited[i] = false;

    System.out.printf("BFS: ");
    for (int i = 0; i < mVexs.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        System.out.printf("%c ", mVexs[i].data);
        queue[rear++] = i;  // 入队列
      }

      while (head != rear) {
        int j = queue[head++];  // 出队列
        ENode node = mVexs[j].firstEdge;
        while (node != null) {
          int k = node.ivex;
          if (!visited[k])
          {
            visited[k] = true;
            System.out.printf("%c ", mVexs[k].data);
            queue[rear++] = k;
          }
          node = node.nextEdge;
        }
      }
    }
    System.out.printf("\n");
  }

  /*
   * 打印矩阵队列图
   */
  public void print() {
    System.out.printf("List Graph:\n");
    for (int i = 0; i < mVexs.length; i++) {
      //System.out.printf("%d(%c): ", i, mVexs[i].data);
      System.out.println(i+"地点::"+mVexs[i].data);
      ENode node = mVexs[i].firstEdge;
      while (node != null) {
        System.out.println( node.ivex+":::"+mVexs[node.ivex].data);
        node = node.nextEdge;
      }
      System.out.printf("\n");
    }
  }

  /*
   * 获取边<start, end>的权值；若start和end不是连通的，则返回无穷大。
   */
  private int getWeight(int start, int end) {

    if (start==end)
      return 0;

    ENode node = mVexs[start].firstEdge;
    while (node!=null) {
      if (end==node.ivex)
        return node.weight;
      node = node.nextEdge;
      //node.name = mVexs[start].data;
    }

    return INF;
  }

  /*
   * prim最小生成树
   *
   * 参数说明：
   *   start -- 从图中的第start个元素开始，生成最小树
   */
  /*public void prim(int start) {
    int min,i,j,k,m,n,tmp,sum;
    int num = mVexs.length;
    int index=0;                   // prim最小树的索引，即prims数组的索引
    char[] prims = new char[num];  // prim最小树的结果数组
    int[] weights = new int[num];  // 顶点间边的权值

    // prim最小生成树中第一个数是"图中第start个顶点"，因为是从start开始的。
    prims[index++] = mVexs[start].data;

    // 初始化"顶点的权值数组"，
    // 将每个顶点的权值初始化为"第start个顶点"到"该顶点"的权值。
    for (i = 0; i < num; i++ )
      weights[i] = getWeight(start, i);

    for (i = 0; i < num; i++) {
      // 由于从start开始的，因此不需要再对第start个顶点进行处理。
      if(start == i)
        continue;

      j = 0;
      k = 0;
      min = INF;
      // 在未被加入到最小生成树的顶点中，找出权值最小的顶点。
      while (j < num) {
        // 若weights[j]=0，意味着"第j个节点已经被排序过"(或者说已经加入了最小生成树中)。
        if (weights[j] != 0 && weights[j] < min) {
          min = weights[j];
          k = j;
        }
        j++;
      }

      // 经过上面的处理后，在未被加入到最小生成树的顶点中，权值最小的顶点是第k个顶点。
      // 将第k个顶点加入到最小生成树的结果数组中
      prims[index++] = mVexs[k].data;
      // 将"第k个顶点的权值"标记为0，意味着第k个顶点已经排序过了(或者说已经加入了最小树结果中)。
      weights[k] = 0;
      // 当第k个顶点被加入到最小生成树的结果数组中之后，更新其它顶点的权值。
      for (j = 0 ; j < num; j++) {
        // 获取第k个顶点到第j个顶点的权值
        tmp = getWeight(k, j);
        // 当第j个节点没有被处理，并且需要更新时才被更新。
        if (weights[j] != 0 && tmp < weights[j])
          weights[j] = tmp;
      }
    }

    // 计算最小生成树的权值
    sum = 0;
    for (i = 1; i < index; i++) {
      min = INF;
      // 获取prims[i]在矩阵表中的位置
      n = getPosition(prims[i]);
      // 在vexs[0...i]中，找出到j的权值最小的顶点。
      for (j = 0; j < i; j++) {
        m = getPosition(prims[j]);
        tmp = getWeight(m, n);
        if (tmp < min)
          min = tmp;
      }
      sum += min;
    }
    // 打印最小生成树
    System.out.printf("PRIM(%c)=%d: ", mVexs[start].data, sum);
    for (i = 0; i < index; i++)
      System.out.printf("%c ", prims[i]);
    System.out.printf("\n");
  }*/

  /*
   * 克鲁斯卡尔（Kruskal)最小生成树
   */
  /*public void kruskal() {
    int index = 0;                      // rets数组的索引
    int[] vends = new int[mEdgNum];     // 用于保存"已有最小生成树"中每个顶点在该最小树中的终点。
    EData[] rets = new EData[mEdgNum];  // 结果数组，保存kruskal最小生成树的边
    EData[] edges;                      // 图对应的所有边

    // 获取"图中所有的边"
    edges = getEdges();
    // 将边按照"权"的大小进行排序(从小到大)
    sortEdges(edges, mEdgNum);

    for (int i=0; i<mEdgNum; i++) {
      int p1 = getPosition(edges[i].start);      // 获取第i条边的"起点"的序号
      int p2 = getPosition(edges[i].end);        // 获取第i条边的"终点"的序号

      int m = getEnd(vends, p1);                 // 获取p1在"已有的最小生成树"中的终点
      int n = getEnd(vends, p2);                 // 获取p2在"已有的最小生成树"中的终点
      // 如果m!=n，意味着"边i"与"已经添加到最小生成树中的顶点"没有形成环路
      if (m != n) {
        vends[m] = n;                       // 设置m在"已有的最小生成树"中的终点为n
        rets[index++] = edges[i];           // 保存结果
      }
    }

    // 统计并打印"kruskal最小生成树"的信息
    int length = 0;
    for (int i = 0; i < index; i++)
      length += rets[i].weight;
    System.out.printf("Kruskal=%d: ", length);
    for (int i = 0; i < index; i++)
      System.out.printf("(%c,%c) ", rets[i].start, rets[i].end);
    System.out.printf("\n");
  }*/

  /*
   * 获取图中的边
   */
  /*private EData[] getEdges() {
    int index=0;
    EData[] edges;

    edges = new EData[mEdgNum];
    for (int i=0; i < mVexs.length; i++) {

      ENode node = mVexs[i].firstEdge;
      while (node != null) {
        if (node.ivex > i) {
          edges[index++] = new EData(mVexs[i].data, mVexs[node.ivex].data, node.weight);
        }
        node = node.nextEdge;
      }
    }

    return edges;
  }*/

  /*
   * 对边按照权值大小进行排序(由小到大)
   */
  private void sortEdges(EData[] edges, int elen) {

    for (int i=0; i<elen; i++) {
      for (int j=i+1; j<elen; j++) {

        if (edges[i].weight > edges[j].weight) {
          // 交换"边i"和"边j"
          EData tmp = edges[i];
          edges[i] = edges[j];
          edges[j] = tmp;
        }
      }
    }
  }

  /*
   * 获取i的终点
   */
  private int getEnd(int[] vends, int i) {
    while (vends[i] != 0)
      i = vends[i];
    return i;
  }

  /*
   * Dijkstra最短路径。
   * 即，统计图中"顶点vs"到其它各个顶点的最短路径。
   *
   * 参数说明：
   *       vs -- 起始顶点(start vertex)。即计算"顶点vs"到其它顶点的最短路径。
   *     prev -- 前驱顶点数组。即，prev[i]的值是"顶点vs"到"顶点i"的最短路径所经历的全部顶点中，位于"顶点i"之前的那个顶点。
   *     dist -- 长度数组。即，dist[i]是"顶点vs"到"顶点i"的最短路径的长度。
   */
  public List<String> dijkstra(int vs, int[] prev, int[] dist, String end) {
    List<String> result = new ArrayList<>();
    // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取。
    boolean[] flag = new boolean[mVexs.length];

    // 初始化
    for (int i = 0; i < mVexs.length; i++) {
      flag[i] = false;            // 顶点i的最短路径还没获取到。
      prev[i] = -1;                // 顶点i的前驱顶点为0。
      dist[i] = getWeight(vs, i); // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
      /*if(mVexs[i].data.equals("首页")){
        prev[i] = vs;
      }*/
    }

    // 对"顶点vs"自身进行初始化
    flag[vs] = true;
    dist[vs] = 0;

    // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
    int k = 0;
    for (int i = 1; i < mVexs.length; i++) {
      // 寻找当前最小的路径；
      // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
      int min = INF;
      for (int j = 0; j < mVexs.length; j++) {
        if (flag[j]==false && dist[j]<min) {
          min = dist[j];
          k = j;
        }
      }
      // 标记"顶点k"为已经获取到最短路径
      flag[k] = true;

      // 修正当前最短路径和前驱顶点
      // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
      for (int j = 0; j < mVexs.length; j++) {
        int tmp = getWeight(k, j);
        tmp = (tmp==INF ? INF : (min + tmp)); // 防止溢出
        if (flag[j]==false && (tmp<dist[j]) )
        {
          dist[j] = tmp;
          prev[j] = k;
        }
      }
    }

    // 打印dijkstra最短路径的结果
    //System.out.printf("dijkstra(%c): \n", mVexs[vs].data);
    //System.out.printf(mVexs[vs].data);
    //System.out.println("\n\n最短路径倒序如下：\n");

    for (int i = 0; i < mVexs.length; i++) {
      //System.out.println(mVexs[vs].data + ":" + mVexs[i].data);
      int j = i; // j用于遍历while循环

      List<String> pointList = new ArrayList<>();
      List<String> edataList = new ArrayList<>();
      pointList.add(0,mVexs[i].data);
      while (prev[j] != -1) { // P[j] = 1表示该顶点不可通
        String target = mVexs[j].data;
        String start = mVexs[prev[j]].data;
        String route = null;

        ENode p = mVexs[prev[j]].firstEdge;
        while(p.nextEdge!=null&&!p.name.equals(target)){
          p = p.nextEdge;
        }
        route = p.edataName;
        //System.out.print(route+"<-");
        edataList.add(0,route);
        //System.out.print(mVexs[prev[j]].data+"<-");
        pointList.add(0,mVexs[prev[j]].data);
        //System.out.print(routeMap.get(mVexs[prev[j]].data+"qq"+mVexs[j].data)+"   ");
//        System.out.print(mVexs[prev[j]].data+"qq"+mVexs[j].data);
        j = prev[j]; // 获取与该顶点距离最近的顶点下标
      }
     // System.out.print(edataList);
      pointList.add(0,mVexs[vs].data);
      if(end.equals(mVexs[i].data)){
        for (int p=0;p<pointList.size()-1;p++) {
          result.add(routeMap.get(pointList.get(p)+"qq"+pointList.get(p+1)));
        }
      }
    }
    return result;
  }


  // 边的结构体
  private static class EData {
    String start; // 边的起点
    String end;   // 边的终点
    int weight; // 边的权重
    String name;   // 边的名称

    public EData(String start, String end, int weight, String name) {
      this.start = start;
      this.end = end;
      this.weight = weight;
      this.name = name;
    }

    public EData(String start, String end, int weight) {
      this.start = start;
      this.end = end;
      this.weight = weight;
    }
  };

  public static List<String> findRouteList(String start,String end) {
    /*MapUtil.initMap();
    MapUtil.addFirstPage();*/
    List<Place> maps = MapUtil.maps;
    int count = 0;
    int xcount = 0;
    for (Place place:maps) {
      List<Direction> direction = place.getDirection();
      count+=direction.size();
      xcount++;
      /*EData eData = new EData('A', 'B', 12);
      edges[0] = eData;*/
    }
    EData[] edges =  new EData[count];
    int y=0;
    int x=0;
    String[] list2 = new String[xcount];
    for (Place place:maps) {
        List<Direction> directions = place.getDirection();
        for (Direction direction:directions) {
          routeMap.put(place.getName()+"qq"+direction.getName(),direction.getText());
          EData eData = new EData(place.getName(), direction.getName(), 1,direction.getText());
          edges[y] = eData;
          y++;
        }
      list2[x] = place.getName();
        x++;
    }
    ListUDG2 pG = null;

    // 自定义"图"(输入矩阵队列)
    //pG = new ListUDG2();
    // 采用已有的"图"
    pG = new ListUDG2(list2, edges);

    //pG.print();   // 打印图
    //pG.DFS();     // 深度优先遍历
    //pG.BFS();     // 广度优先遍历
    //pG.prim(0);   // prim算法生成最小生成树
    //pG.kruskal(); // Kruskal算法生成最小生成树

    int[] prev = new int[pG.mVexs.length];
    int[] dist = new int[pG.mVexs.length];
    // dijkstra算法获取"第4个顶点"到其它各个顶点的最短距离
    long l = System.currentTimeMillis();
    //pG.dijkstra(3, prev, dist);
    Integer startIndex = null;
    for (int i=0;i<pG.mVexs.length;i++) {
      VNode node = pG.mVexs[i];
      if(node.data.equals(start)){
        startIndex = i;
        break;
      }
    }
    List<String> dijkstra = pG.dijkstra(startIndex, prev, dist,end);
    System.out.println(System.currentTimeMillis()-l+"毫秒");
    return dijkstra;
  }

  public static void main(String[] args) {
    MapUtil.initMap();
    MapUtil.addFirstPage();
    List<String> aa = findRouteList("钱庄(存取钱)", "棋局(0,4)");
    System.out.println(aa);
  }
}
package other;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 将树状数据转化为map,修改map里面的元素就等于操作树上的节点,以此来简化树的上节点的修改难度
 * 注意:不涉及节点的新增与删除,只有修改
 */
public class Tree2Map {
    public static void main(String[] args) {
        List<MyNode<Dept>> myNodes = myCompanyDept();
        // 这里甚至可以做成缓存式数据字典
        Map<String, MyNode<Dept>> nodeMap = new HashMap<>();
        node2Map(myNodes, nodeMap);
        // 各种场景下需要修改树节点的对象,修改map里面的对象就等于修改树上的节点
        // 例如将开发二部调到天津
        String deptNo = "22";
        nodeMap.get(deptNo).getNodeInfo().setLocal("天津");
        // 将测试1部调到北京
        deptNo = "31";
        nodeMap.get(deptNo).getNodeInfo().setLocal("北京");
        nodeMap.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });
    }
    /**
     * tree转map
     *
     * @param myNodes
     * @param nodeMap
     */
    static void node2Map(List<MyNode<Dept>> myNodes, Map<String, MyNode<Dept>> nodeMap) {
        for (MyNode<Dept> myNode : myNodes) {
            nodeMap.put(myNode.getNodeId(), myNode);
            if (myNode.getChildren() != null && myNode.getChildren().size() > 0) {
                node2Map(myNode.getChildren(), nodeMap);
            }
        }
    }
    /**
     * 模拟数据
     *
     * @return
     */
    static List<MyNode<Dept>> myCompanyDept() {
        // 公司节点即跟节点
        Dept company = new Dept("1", "XXX公司", "北京");
        MyNode<Dept> rootNode = new MyNode<>();
        List<MyNode<Dept>> deptNodes = new ArrayList<>();
        rootNode.setChildren(deptNodes);
        rootNode.setNodeId(company.getDeptno());
        rootNode.setNodeName(company.getDname());
        rootNode.setNodeInfo(company);
        // 开发部
        Dept devDept = new Dept("2", "开发部", "北京");
        MyNode<Dept> devDeptNode = new MyNode<>();
        deptNodes.add(devDeptNode);
        List<MyNode<Dept>> devDeptNodes = new ArrayList<>();
        devDeptNode.setChildren(devDeptNodes);
        devDeptNode.setNodeId(devDept.getDeptno());
        devDeptNode.setNodeName(devDept.getDname());
        devDeptNode.setNodeInfo(devDept);
        // 开发1部
        Dept devDept1 = new Dept("21", "开发1部", "北京");
        MyNode<Dept> devDeptNode1 = new MyNode<>();
        devDeptNode1.setNodeId(devDept1.getDeptno());
        devDeptNode1.setNodeName(devDept1.getDname());
        devDeptNode1.setNodeInfo(devDept1);
        devDeptNodes.add(devDeptNode1);
        // 开发2部
        Dept devDept2 = new Dept("22", "开发2部", "北京");
        MyNode<Dept> devDeptNode2 = new MyNode<>();
        devDeptNode2.setNodeId(devDept2.getDeptno());
        devDeptNode2.setNodeName(devDept2.getDname());
        devDeptNode2.setNodeInfo(devDept2);
        devDeptNodes.add(devDeptNode2);
        // 测试部
        Dept testDept = new Dept("3", "测试部", "天津");
        MyNode<Dept> testDeptNode = new MyNode<>();
        deptNodes.add(testDeptNode);
        List<MyNode<Dept>> testDeptNodes = new ArrayList<>();
        testDeptNode.setChildren(testDeptNodes);
        testDeptNode.setNodeId(testDept.getDeptno());
        testDeptNode.setNodeName(testDept.getDname());
        testDeptNode.setNodeInfo(testDept);
        // 测试1部
        Dept testDept1 = new Dept("31", "测试1部", "天津");
        MyNode<Dept> testDeptNode1 = new MyNode<>();
        testDeptNode1.setNodeId(testDept1.getDeptno());
        testDeptNode1.setNodeName(testDept1.getDname());
        testDeptNode1.setNodeInfo(testDept1);
        testDeptNodes.add(testDeptNode1);
        // 测试2部
        Dept testDept2 = new Dept("31", "测试1部", "天津");
        MyNode<Dept> testDeptNode2 = new MyNode<>();
        testDeptNode2.setNodeId(testDept2.getDeptno());
        testDeptNode2.setNodeName(testDept2.getDname());
        testDeptNode2.setNodeInfo(testDept2);
        testDeptNodes.add(testDeptNode2);
        List<MyNode<Dept>> result = new ArrayList<>();
        result.add(rootNode);
        return result;
    }
}
/**
 * 通用树节点模型
 * @param <T>
 */
@Data
class MyNode<T> {
    private String nodeId;
    private String nodeName;
    private String parentNodeId;
    private List<MyNode<T>> children;
    private T nodeInfo;
}

@Data
class Dept {
    private String deptno;
    private String dname;
    private String local;

    public Dept(String deptno,String dname,String local){
        this.deptno = deptno;
        this.dname = dname;
        this.local = local;
    }
}

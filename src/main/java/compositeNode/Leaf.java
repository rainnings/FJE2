package compositeNode;

import iterator.BFIterator;
import iterator.DFIterator;
import visitor.Visitor;

import java.util.List;

/**
 * Leaf类表示JSON结构中的叶子节点。
 */
public class Leaf extends JsonNode {
    /**
     * 叶子节点的值。
     */
    private final String value;
    /**
     * 叶子节点的名称。
     */
    private final String name;
    /**
     * 叶子节点的层级。
     */
    private final int level;

    /**
     * Leaf类的构造函数，用于初始化叶子节点的名称、值和层级。
     *
     * @param name  叶子节点的名称
     * @param value 叶子节点的值
     * @param level 叶子节点所在的层级
     */
    public Leaf(String name, String value, int level){
        this.name = name;
        this.value = value;
        this.level = level;
    }

    /**
     * 获取叶子节点的名称。
     *
     * @return 叶子节点的名称
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * 获取叶子节点的值。
     *
     * @return 叶子节点的值
     */
    @Override
    public String getValue(){
        return value;
    }

    /**
     * 叶子节点没有子节点，无操作。
     *
     * @param node 要添加的子节点
     */
    @Override
    public void add(JsonNode node){}

    /**
     * 叶子节点没有子节点，无操作。
     *
     * @param node 要移除的子节点
     */
    @Override
    public void remove(JsonNode node){}

    /**
     * 获取节点的类型。
     *
     * @return 节点的类型为Leaf
     */
    @Override
    public Type getType(){
        return Type.Leaf;
    }

    /**
     * 获取节点的层级。
     *
     * @return 节点的层级
     */
    @Override
    public int getLevel(){
        return level;
    }

    /**
     * 叶子节点没有子节点，返回空值。
     *
     * @return null
     */
    @Override
    public List<JsonNode> getChildren(){
        return null;
    }

    /**
     *  获取深度优先迭代器。
     * @return 迭代器对象
     */
    @Override
    public DFIterator getDFIterator(){
        return new DFIterator(this);
    }

    /**
     *  获取广度优先迭代器。
     * @return 迭代器对象
     */
    @Override
    public BFIterator getBFIterator(){
        return new BFIterator(this);
    }

    /**
     * 具体元素，允许访问者访问。
     *
     * @param visitor 访问者
     */
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}

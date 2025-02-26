package compositeNode;

import iterator.BFIterator;
import iterator.DFIterator;
import visitor.Visitor;

import java.util.List;

/**
 * JsonNode是一个抽象类，用于表示JSON数据的节点。
 */
public abstract class JsonNode {
    /**
     * 节点打印需要的信息。
     */
    public DrawInfo info = new DrawInfo();

    /**
     * 向节点添加子节点。
     *
     * @param node 要添加的子节点
     */
    public abstract void add(JsonNode node);

    /**
     * 从节点中移除指定子节点。
     *
     * @param node 要移除的子节点
     */
    public abstract void remove(JsonNode node);

    /**
     * 获取节点的类型。
     *
     * @return 节点的类型
     */
    public abstract Type getType();

    /**
     * 获取节点的层级。
     *
     * @return 节点的层级
     */
    public abstract int getLevel();

    /**
     * 获取节点的子节点列表。
     *
     * @return 子节点列表
     */
    public abstract List<JsonNode> getChildren();

    /**
     * 获取节点的名称。
     *
     * @return 节点的名称
     */
    public abstract String getName();

    /**
     * 获取节点的值。
     *
     * @return 节点的值
     */
    public abstract String getValue();

    /**
     *  获取深度优先迭代器。
     * @return 迭代器对象
     */
    public abstract DFIterator getDFIterator();

    /**
     *  获取广度优先迭代器。
     * @return 迭代器对象
     */
    public abstract BFIterator getBFIterator();

    /**
     * 元素接口。
     *
     * @param visitor 访问者
     */
    public abstract void accept(Visitor visitor);
}

package visitor;

import compositeNode.Container;
import compositeNode.JsonNode;
import compositeNode.Leaf;

/**
 * 访问者接口。
 */
public interface Visitor {
    /**
     * 访问者容器节点。
     */
    void visit(Container node);
    /**
     * 访问者叶子节点。
     */
    void visit(Leaf node);
}

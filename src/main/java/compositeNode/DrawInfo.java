package compositeNode;

/**
 * 打印单个节点时需要的信息。
 */
public class DrawInfo {
    /**
     * 需要打印的前缀。
     */
    public String prefix;
    /**
     * 是否为父节点最后子节点。
     */
    public boolean isLast;
    /**
     * 是否为打印的第一个节点。
     */
    public boolean isFirst;
    /**
     * 是否是最后一个叶子节点。
     */
    public boolean isLastLeaf;
}

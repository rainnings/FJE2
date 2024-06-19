package iterator;

import compositeNode.JsonNode;

/**
 * 迭代器接口。
 */
public abstract class Iterator {
    /**
     * 判断是否为最后一个元素。
     *
     * @return 是否为最后一个元素。
     */
    public abstract boolean hasNext();
    /**
     * 获取下一个遍历元素。
     *
     * @return 下一个遍历元素。
     */
    public abstract JsonNode next();
}

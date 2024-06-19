package iterator;

import compositeNode.JsonNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * 深度迭代器。
 */
public class DFIterator extends Iterator{
    private final Queue<JsonNode> queue;
    public DFIterator(JsonNode root){
        queue = new ArrayDeque<>();
        dfs(root);
    }
    private void dfs(JsonNode root){
        if(root == null) return;
        queue.add(root);
        List<JsonNode> children = root.getChildren();
        if(children == null) return;
        for (JsonNode child : children) {
            dfs(child);
        }
    }
    @Override
    public boolean hasNext(){
        return !queue.isEmpty();
    }
    @Override
    public JsonNode next(){
         if(hasNext()){
             return queue.poll();
         }
         return null;
    }

}

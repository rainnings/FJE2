package iterator;

import compositeNode.JsonNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * 广度迭代器。
 */
public class BFIterator extends Iterator{
    private final Queue<JsonNode> queue;
    public BFIterator(JsonNode root){
        queue = new ArrayDeque<>();
        bfs(root);
    }
    private void bfs(JsonNode root){
        if(root == null) return;
        Queue<JsonNode> level = new ArrayDeque<>();
        level.add(root);
        while(!level.isEmpty()){
            int count = level.size();

            for(int i = 0; i < count; i++){
                JsonNode node = level.poll();
                queue.add(node);
                List<JsonNode> children = null;
                if (node != null) {
                    children = node.getChildren();
                }
                if(children == null) {
                    return;
                }
                level.addAll(children);
            }
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

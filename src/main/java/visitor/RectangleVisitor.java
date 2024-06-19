package visitor;

import compositeNode.Container;
import compositeNode.JsonNode;
import compositeNode.Leaf;
import compositeNode.Type;

import java.util.List;

/**
 * 矩形形打印节点访问者。
 */
public class RectangleVisitor implements Visitor {
    private final String intermediateIcon;
    private final String leafIcon;
    private final int rectangleLength;
    public RectangleVisitor(String intermediateIcon, String leafIcon, int rectangleLength){
        this.intermediateIcon = intermediateIcon;
        this.leafIcon = leafIcon;
        this.rectangleLength = rectangleLength;
    }
    @Override
    public void visit(Container node){
        int useLength;

        System.out.print(node.info.prefix);


        if (node.info.isFirst){
            System.out.print("┌─");
        } else {
            System.out.print("├─");
        }
        useLength = node.info.prefix.length() + 2;

        String container = intermediateIcon + node.getName();
        System.out.print(container);
        useLength += container.length();

        System.out.print(" ");
        int remainLength = rectangleLength - useLength - 1;
        if(remainLength <= 0) System.out.println();
        for(int i = 0;i < remainLength; i++){
            if(i == remainLength - 1){
                 if (node.info.isFirst){
                    System.out.println("┐");
                } else {
                    System.out.println("┤");
                }
            } else {
                System.out.print("─");
            }
        }

    }
    @Override
    public void visit(Leaf node){
        int useLength;
        if(node.info.isLastLeaf){
            for(int i = 0; i < node.info.prefix.length(); i++){
                if(i == 0){
                    System.out.print("└");
                } else if(i % 2 == 0){
                    System.out.print("┴");
                } else {
                    System.out.print("─");
                }
            }
        } else {
            System.out.print(node.info.prefix);
        }

        if(node.info.isLastLeaf){
            if(node.getLevel() == 1){
                System.out.print("└─");
            } else {
                System.out.print("┴─");
            }
        } else if (node.info.isFirst){
            System.out.print("┌─");
        } else {
            System.out.print("├─");
        }
        useLength = node.info.prefix.length() + 2;

        String leaf = leafIcon + node.getName() + ":" + node.getValue();
        System.out.print(leaf);
        useLength += leaf.length();


        System.out.print(" ");
        int remainLength = rectangleLength - useLength - 1;
        if(remainLength <= 0) System.out.println();
        for(int i = 0;i < remainLength; i++){
            if(i == remainLength - 1){
                if(node.info.isLastLeaf){
                    System.out.println("┘");
                } else if (node.info.isFirst){
                    System.out.println("┐");
                } else {
                    System.out.println("┤");
                }
            } else {
                System.out.print("─");
            }
        }
    }
}

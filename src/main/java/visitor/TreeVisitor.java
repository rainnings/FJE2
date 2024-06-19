package visitor;

import compositeNode.Container;
import compositeNode.Leaf;

/**
 * 树形打印节点访问者。
 */
public class TreeVisitor implements Visitor{
    String intermediateIcon;
    String leafIcon;
    public TreeVisitor(String intermediateIcon, String leafIcon){
        this.intermediateIcon = intermediateIcon;
        this.leafIcon = leafIcon;
    }
    @Override
    public void visit(Container node){
        System.out.print(node.info.prefix);
        if(node.info.isLast) System.out.print("└─");
        else System.out.print("├─");

        System.out.println(intermediateIcon + node.getName());

    }
    @Override
    public void visit(Leaf node){
        System.out.print(node.info.prefix);
        if(node.info.isLast) System.out.print("└─");
        else System.out.print("├─");

        System.out.println(leafIcon + node.getName()
                + ":" + node.getValue());

    }
}

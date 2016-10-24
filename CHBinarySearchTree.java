import java.util.*;

public class CHBinarySearchTree {
  private CHBinarySearchTreeNode root;

  public CHBinarySearchTree() {
    this.root = null;
  }

  public CHBinarySearchTreeNode getRoot() {
    return this.root;
  }

  public void insert(int valueToInsert) {
    CHBinarySearchTreeNode newNode = new CHBinarySearchTreeNode(valueToInsert);
    if (this.root == null) {
      this.root = newNode;
      return;
    }

    CHBinarySearchTreeNode curr = this.root;
    while (true) {
      if (valueToInsert < curr.getValue()) {
        if (curr.getLeft() != null) {
          curr = curr.getLeft();
        } else {
          curr.setLeft(newNode);
          break;
        }
      } else {
        if (curr.getRight() != null) {
          curr = curr.getRight();
        } else {
          curr.setRight(newNode);
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    CHBinarySearchTree bTree = new CHBinarySearchTree();

    bTree.insert(1);
    bTree.insert(9);
    bTree.insert(-1);
    bTree.insert(0);
    bTree.insert(6);
    bTree.insert(3);
    bTree.insert(-3);
    bTree.insert(-4);
    BTreePrinter.printNode(bTree.getRoot());
  }
}

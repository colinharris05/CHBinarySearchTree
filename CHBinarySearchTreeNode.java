public class CHBinarySearchTreeNode {
  private int data;
  private CHBinarySearchTreeNode left;
  private CHBinarySearchTreeNode right;

  public CHBinarySearchTreeNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public int getValue() {
    return this.data;
  }

  public CHBinarySearchTreeNode getLeft() {
    return this.left;
  }

  public CHBinarySearchTreeNode getRight() {
    return this.right;
  }

  public void setLeft(CHBinarySearchTreeNode newLeft) {
    this.left = newLeft;
  }

  public void setRight(CHBinarySearchTreeNode newRight) {
    this.right = newRight;
  }
}

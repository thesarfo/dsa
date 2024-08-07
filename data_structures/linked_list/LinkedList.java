import org.w3c.dom.Node;

public class LinkedList {

	public Node head;

	public LinkedList() {
		this.head = null;
	}

  /* add to the head of the linked list */
  public void addToHead(String data) {
    Node newHead = new Node(data);
    Node currentHead = this.head;
    this.head = newHead;
    if (currentHead != null) {
      this.head.setNextNode(currentHead);
    }
  }

  /* add to the tail of the linked list */
  public void addToTail(String data) {
    Node tail = this.head;
    if (tail == null) {
      this.head = new Node(data);
    } else {
      while (tail.getNextNode() != null) {
        tail = tail.getNextNode();
      }
        tail.setNextNode(new Node(data));
    }
  }

  /* insert at the end of a linked list - codechef */
  public void insertAtEnd(int val) {

    node newnode = new node(val);

    if (this.head == null) {
      // The list is empty, thus we just need to assign head to the only element
      this.head = newnode;

    } else {
      // Iterating towards the end of the list
      node current = this.head;
      while (current.next != null) {
        current = current.next;
      }

      // Updating the next pointer of the this element
      current.next = newnode;

    }
  }

  /* remove the head of the linked list */
  public String removeHead(){
    Node removedHead = this.head;
    if (removedHead == null){
      return null;
    }
    this.head = removedHead.getNextNode();
    return removedHead.data;
  }

  /* print the contents of the list */
  public String printList() {
    String output = "<head> ";
    Node currentNode = this.head;
    while (currentNode != null) {
      output += currentNode.data + " ";
      currentNode = currentNode.getNextNode();
    }
    output += "<tail>";
    System.out.println(output);
    return output;
  }

  public static void main(String []args) {
    LinkedList seasons = new LinkedList();
    seasons.addToHead("summer");
    seasons.addToHead("spring");
    seasons.addToTail("fall");
    seasons.addToTail("winter");
    seasons.removeHead();
    seasons.printList(); 
  }  

}
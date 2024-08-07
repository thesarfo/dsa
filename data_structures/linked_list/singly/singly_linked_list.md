# Singly Linked List

It is a list with only one pointer between two successive nodes. Therefore, it can only be traversed in a single direction, i.e you can go from the first node in the list to the last node, but not the other way round.

```python
class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None

n1 = Node('eggs')
n2 = Node('ham')
n3 = Node('spam')

n1.next = n2
n2.next = n3
```

To traverse the list, we can do something like below

```python
current = n1
while current:
    print(current.data)
    current = current.next
```

In the loop we print out the current element after which we set current to point to the next element in the list. We keep doing this until we have reached the end of the list. Though it is a simplistic approach, it is not a good one.

## Singly Linked List Class
A list is clearly a separate concept from a node. So we start by creating a very simple class to
hold our list. We will start with a constructor that holds a reference to the very first node in
the list. Since this list is initially empty, we will start by setting this reference to None:
```python
class SinglyLinkedList:
    def __init__(self):
        self.tail = None
```
    
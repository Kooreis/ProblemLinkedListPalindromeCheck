Here is a Python console application that checks if a linked list is a palindrome:

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        if not self.head:
            self.head = Node(data)
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = Node(data)

    def is_palindrome(self):
        stack = []
        current = self.head
        while current:
            stack.append(current.data)
            current = current.next
        current = self.head
        while current:
            data = stack.pop()
            if current.data != data:
                return False
            current = current.next
        return True

def main():
    llist = LinkedList()
    data_input = input("Enter elements of linked list separated by space: ")
    data_list = data_input.split()
    for data in data_list:
        llist.append(data)
    if llist.is_palindrome():
        print("The linked list is a palindrome.")
    else:
        print("The linked list is not a palindrome.")

if __name__ == "__main__":
    main()
```

This console application first asks the user to input the elements of the linked list. It then checks if the linked list is a palindrome by using a stack to reverse the linked list and compare it with the original. If the reversed linked list is the same as the original, it is a palindrome.
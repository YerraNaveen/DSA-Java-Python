from DoublyLinkedListNode import DoublyLinkedListNode

class DoublyLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None

    def insert(self, data):
        new_node = DoublyLinkedListNode(data)
        new_node.next = self.head
        if self.head:
            self.head.prev = new_node
        else:
            self.tail = new_node
        self.head = new_node

    def insert_tail(self, data):
        new_node = DoublyLinkedListNode(data)
        new_node.prev = self.tail
        self.tail.next = new_node
        self.tail = new_node

    def print(self):
        current = self.head

        while current.next:
            print(current.data, end="->")
            current = current.next
        print(current.data)
    
    def print_reverse(self):
        current = self.tail
        while current.prev:
            print(current.data, end="->")
            current = current.prev
        print(current.data)

    def delete(self, ele):
        current = self.head            
        while current:
            if current.data == ele:
                if current.prev:
                    current.prev.next = current.next
                else:
                    self.head = current.next
                    current.next.prev = None
                
                if current.next:
                    current.next.prev = current.prev
                else:
                    self.tail = current.prev
                    current.prev.next = None

                current.next = None
                current.prev = None
                return current.data
            current = current.next
        
        return None

# TESTING

dll = DoublyLinkedList()

for i in range(10):
    dll.insert_tail(i+1)
dll.print()
dll.print_reverse()

for i in range(10, 20):
    dll.insert(i+1)
dll.delete(10)
dll.print()
dll.print_reverse()

print("-------------------------")
for i in range(20, 30):
    dll.insert_tail(i+1)
dll.print()
dll.print_reverse()

dll.delete(20)
dll.print()
dll.print_reverse()


print("-------------------------")

for i in range(0, 30):
    dll.delete(i)
dll.print()
dll.print_reverse()

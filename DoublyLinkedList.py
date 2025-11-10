from DoublyLinkedListNode import DoublyLinkedListNode

class DoublyLinkedList:

    def __init__(self):
        self.head = None
        self.tail = None
    
    def get_head(self):
        return self.head.data

    def get_tail(self):
        return self.tail.data

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
        if self.tail:
            self.tail.next = new_node
        else:
            self.head = new_node
        self.tail = new_node

    def is_empty(self):
        if self.head == None and self.tail == None:
            return True

    def print(self):
        current = self.head
        if not current:
            print(None)
            return
        while current.next:
            print(current.data, end="->")
            current = current.next
        print(current.data)

    def print_reverse(self):
        current = self.tail
        if not current:
            print(None)
            return
        while current.prev:
            print(current.data, end="->")
            current = current.prev
        print(current.data)

    def delete_head(self):
        current = self.head
        if self.head == self.tail:
            self.head = None
            self.tail = None
        else:
            self.head = current.next
            current.next.prev = None
            current.next = None
            current = None

    def delete(self, ele):
        current = self.head            
        while current:
            if current.data == ele:
                if current.prev:
                    current.prev.next = current.next
                else:
                    self.head = current.next
                    if self.head:
                        current.next.prev = None
                
                if current.next:
                    current.next.prev = current.prev
                else:
                    self.tail = current.prev
                    if self.tail:
                        current.prev.next = None
                
                current.next = None
                current.prev = None
                return current.data
            current = current.next
        
        return None
    
    def __str__(self):
        current = self.head
        data = ""
        if not current:
            data = None
            return data
        
        while current.next:
            data += str(current.data) + "->"
            current = current.next
        data += str(current.data)
        return data

# TESTING

dll = DoublyLinkedList()
# dll.insert(1)
# print(dll.head)
# print(dll.tail)
# dll.print()
# dll.delete(1)
# dll.print()

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

for i in range(0, 31):
    dll.delete_head()
dll.print()
dll.print_reverse()

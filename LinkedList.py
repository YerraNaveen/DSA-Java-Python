from LinkedListNode import LinkedListNode

class LinkedList:

    def __init__(self):
        self.head = None

    def get_head(self):
        return self.head.data

    def insert(self, data):
        new_node = LinkedListNode(data)
        new_node.next  = self.head 
        self.head = new_node

    def delete(self, ele):
        current = self.head
        prev = None
        while current:
            if current.data == ele:
                prev.next = current.next
                current.next = None
                break
            else:
                prev = current
            current = current.next
        return current.data

    def find(self, index):
        current = self.head
        count = 0
        while current:
            if count == index:
                return current.data
            count+=1
            current = current.next
        return None

    def print(self):
        current = self.head
        while current.next != None:
            print(current.data, end='->')
            current = current.next
        print(current.data)

    def __repr__(self):
        list_string = ""
        current = self.head
        while current.next != None:
            list_string += str(current.data) + '->'
            current = current.next
        list_string += str(current.data)
        return list_string

list = LinkedList()

for i in range(10):
    list.insert(i)

print(list.delete(2))
print(list.find(1))
list.print()
print(list)
from DoublyLinkedList import DoublyLinkedList as DLL

class Queue:

    def __init__(self):
        self.q = DLL()
        self.size = 0
    
    def enqueue(self, element):
        self.size+=1
        return self.q.insert_tail(element)
    
    def dequeue(self):
        self.size-=1
        return self.q.delete_head()
    
    def is_empty(self):
        return self.size == 0
    
    
    def front(self):
        return self.q.get_head()
    
    def rear(self):
        return self.q.get_tail()

    def length(self):
        return self.size
    
    def print_queue(self):
        print(self.q.__str__())
    
    def __str__(self):
        return self.q.__str__()

que = Queue()
print(que.is_empty())
for i in range(20):
    que.enqueue(i)

print(que.front())
print(que.rear())
print(que.length())
print(que.is_empty())
que.print_queue()
print(que)
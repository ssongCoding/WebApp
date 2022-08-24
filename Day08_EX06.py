
class Queue:
    def __init__(self):
        self.front = 0 # 빨간 화살표
        self.rear = 0  # 파란 화살표
        self.size = 5  # 큐의 크기
        self.queue = [None] * self.size

    # 비었으면 return True, 안 비었으면 return False
    def isEmpty(self):
        if self.front == self.rear:
            return True
        else:
            return False

    def isFull(self):
        if self.front == (self.rear + 1)%self.size:
            return True
        else:
            return False

    def enqueue(self, item):
        # 조건 : isFull 이 False일 때
        self.queue[self.rear] = item  # item을 rear(파란화살표 자리)에 넣어주는 거
        self.rear = (self.rear + 1)%self.size     # rear가 한칸 전진

    def dequeue(self):
        # 조건 : isEmpty == False 일 때
        self.queue[self.front] = [None]  # front(빨간화살표) 자리의 값을 제거하고
        self.front = (self.front + 1)%self.size       # front가 한칸 전진

    def display(self):  # front ~ rear-1
        index = self.front
        while index <= self.rear-1:
            print(self.queue[index], end=" ")
            index = index + 1
        # print(self.queue[self.front:self.rear])
        print()

q = Queue()  # [ , , , , ]
q.enqueue(3)
q.enqueue(5)
q.enqueue(7)
q.enqueue(1)
q.display()

q.dequeue()
q.dequeue()
q.dequeue()
q.display()

print(q.isFull())
q.dequeue()
print(q.isEmpty())
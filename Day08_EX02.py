class Member: # 주석 추가
    def __init__(self, n, c):
        self.name = n
        self.count = c

    def enter(self):  # self <-- 호출한 객체가 들어가요.
        print("{} 입장!".format(self.name))
        self.count = self.count + 1
        print("{}님 입장 횟수 : {}회".format(self.name, self.count))

jerry = Member("제리", 0)
jerry.enter()
jerry.enter()
jerry.enter()

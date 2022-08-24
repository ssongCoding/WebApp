class Member:

    totalCount = 0
    # 생성자
    def __init__(self, n, c):
        self.name = n
        self.count = c

    # 메소드 : 클래스 내부 함수
    def enter(self):  # self <-- 호출한 객체가 들어가요.
        print("{} 입장!".format(self.name))
        self.count = self.count + 1
        Member.totalCount = Member.totalCount + 1
        print("{}님 입장 횟수 : {}회".format(self.name, self.count))
        print("총 입장 횟수 : {}회".format(Member.totalCount))
        print()

jerry = Member("제리", 0)
jerry.enter()
jerry.enter()
jerry.enter()

tom = Member("톰", 0)
tom.enter()
tom.enter()

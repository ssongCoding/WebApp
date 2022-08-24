class Family:
    address = ""  # 클래스 변수 선언

    def __init__(self, n, a):
        self.name = n
        Family.address = a  # 클래스.변수 = 값

    def info(self):
        print("저는 {}이구요, {}에 살고 있어요."
              .format(self.name, Family.address))

    def move(self, a):
        Family.address = a


dad = Family("아빠", "서울")
dad.info()

son = Family("아들", "서울")
son.info()

# dad.move("부산")  # 아빠의 주소를 부산으로 옮겨주세요.
Family.address = "부산"
dad.info()       # 저는 아빠이구요, 부산에 살고 있어요.
son.info()
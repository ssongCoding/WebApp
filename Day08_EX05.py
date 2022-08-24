class Snack:
    companyName = "해태"

    def __init__(self, n, p):
        self.name = n
        self.price = p

    def info(self):
        print("{}는(은) {}원이고, 제조 회사는 {}입니다."
              .format(self.name, self.price, Snack.companyName))

pepero = Snack("빼빼로", 1500)
potatochip = Snack("감자칩", 1800)
pepero.info()  # 빼빼로는 1500원이고, 제조 회사는 해태입니다.
potatochip.info()  # 감자칩은 1800원이고, 제조 회사는 해태입니다.

Snack.companyName = "오리온"
pepero.info()
potatochip.info()
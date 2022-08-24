
class Beer:
    companyName = "로떼"

    def __init__(self, n):  # 생성자
        self.name = n

    def advertise(self):
        print("맥주 이름은 {}이고, 제조 회사는 {}입니다."
              .format(self.name, Beer.companyName))

    """
    def sellLicense(self, c):
        Beer.companyName = c
    """

kloud = Beer("클라우드")
fitz = Beer("피츠")
kloud.advertise()
fitz.advertise()

Beer.companyName = "오비"  # 클래스 변수는 클래스 밖에서 쓸 수 있어요.
kloud.advertise()
fitz.advertise()

"""
클래스 변수의 값을 바꿀 때는, 
객체를 통해서 바꿀 수는 있지만,
그 방법은 최선이 아니에요.
kloud.sellLicense("카스")
kloud.advertise()
fitz.advertise()
"""
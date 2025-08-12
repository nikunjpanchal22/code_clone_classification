def main():
    n = int(raw_input())
    for i in range(0, 1 << n):
        gray = i ^ (i >> 1)
        print("{0:0{1}b}".format(gray, n))


def main():
    n = int(input("Enter the number: "))
    for i in range(0, 1 << n):
        gray = (i >> 1) ^ i
        digits = bin(gray)[2:].zfill(n)
        print(digits)





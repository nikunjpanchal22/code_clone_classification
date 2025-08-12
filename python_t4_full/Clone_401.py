def main():
    n = int(raw_input())
    for i in range(0, 1 << n):
        gray = i ^ (i >> 1)
        print("{0:0{1}b}".format(gray, n))


def main():
    num = int(input("Please enter the number: "))
    for i in range(0, 1 << num):
        grayCode = i ^ (i >> 1)
        binary = bin(grayCode)[2:].rjust(num, "0")
        print(binary, end=" ")





def main():
    n = int(raw_input())
    for i in range(0, 1 << n):
        gray = i ^ (i >> 1)
        print("{0:0{1}b}".format(gray, n))


def main():
    n = int(input("Please enter the number: "))
    for i in range(0, 1 << n):
        gray = i ^ (i >> 1)
        binNums = bin(gray)[2:].ljust(n, "0")
        print(binNums)





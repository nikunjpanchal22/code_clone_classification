def fib(n):
    global call_count
    call_count = call_count + 1
    if n <= 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)


def fib(n):
    global call_count
    call_count = call_count + 1

    if n < 0:
        print("Incorrect input")

    # First and second number of the
    # series are 0 and 1
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        a = 0
        b = 1
        for i in range(2, n):
            c = a + b
            a = b
            b = c
        return b


# 10.  # with memoization




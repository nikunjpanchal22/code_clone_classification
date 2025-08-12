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
    a = 0
    b = 1

    if n == 0:
        return a
    elif n == 1:
        return b
    else:
        for _ in range(2, n):
            c = a + b
            a = b
            b = c
        return b


# 9.  # using loop




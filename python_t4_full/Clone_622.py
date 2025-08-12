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

    # array declaration
    f = [0] * (n + 1)

    # base case assignment
    f[1] = 1

    # calculating the fibonacci and storing the values
    for i in range(2, n + 1):
        f[i] = f[i - 1] + f[i - 2]

    return f[n]


# 5.  #  using golden ration




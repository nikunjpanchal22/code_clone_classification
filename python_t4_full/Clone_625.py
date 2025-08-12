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

    phi = (1 + 5**0.5) / 2
    return int(phi**n / 5**0.5)


# 6.  #  using recurrence relation




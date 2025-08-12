def fib(n):
    global call_count
    call_count = call_count + 1
    if n <= 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)


def fib(n, lookup):
    global call_count
    call_count = call_count + 1

    # Base case
    if n == 0 or n == 1:
        lookup[n] = n

    # If the value is not calculated previously then calculate it
    if lookup[n] is None:
        lookup[n] = fib(n - 1, lookup) + fib(n - 2, lookup)

    # return the value corresponding to that value of n



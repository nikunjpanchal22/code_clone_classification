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

    # 0th and 1st number of
    # the series are 0 and 1
    F = [[1, 1], [1, 0]]
    if n == 0:
        return 0

    def power(F, n):
        global call_count
        call_count = call_count + 1

        def multiply(F, M):
            global call_count
            call_count = call_count + 1

            x = F[0][0] * M[0][0] + F[0][1] * M[1][0]
            y = F[0][0] * M[0][1] + F[0][1] * M[1][1]
            z = F[1][0] * M[0][0] + F[1][1] * M[1][0]
            w = F[1][0] * M[0][1] + F[1][1] * M[1][1]

            F[0][0] = x
            F[0][1] = y
            F[1][0] = z
            F[1][1] = w
            if n == 0 or n == 1:
                return

        M = [[1, 1], [1, 0]]

        power(F, n // 2)
        multiply(F, F)

        if n % 2 != 0:
            multiply(F, M)

    power(F, n - 1)

    return F[0][0]


# Optimized version of
# power() in method 4


# 4.  # Iterative Method




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

    # Helper function which calculates
    # value of (x^n)%p in O(logy)
    def power(x, y, p):
        res = 1  # Initialize result

        x = x % p  # Update x if it is more
        # than or equal to p

        while y > 0:
            # If y is odd, multiply x
            # with result
            if y & 1:
                res = (res * x) % p

            # y must be even now
            y = y >> 1  # y = y/2
            x = (x * x) % p

        return res

    # Returns n'th Fibonacci Number
    # using Optimized for even value of n
    def getFibonacci(n):
        # fibonacci numbers for n = 0
        # and n = 1
        Fibonacci = [0, 1]

        # Initialize result for 0th and
        # 1st number in series
        if n < 2:
            return n

        # Initialize values for following
        # calculation using Golden Ratio
        else:
            x = 1
            y = (1 + pow(5, 0.5)) / 2

        # Main loop to calculate Fn
        for i in range(2, n + 1):
            Fibonacci.append(x)
            t = x + y
            x = y
            y = t

        return Fibonacci[-1]

    return getFibonacci(n)


# 8.  # using greatest common divisor




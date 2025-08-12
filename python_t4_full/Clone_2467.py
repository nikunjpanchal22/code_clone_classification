def find_solution(low, high):
    for num in xrange(low, high + 1):
        lst = find_prime_factors(num)
        for n, count in lst:
            pf[n] = max(pf[n], count)
    print("prime factors:", pf)
    solution = 1
    for n, count in pf.items():
        solution *= n**count
    return solution


def find_solution(low, high):
    max_prime_factors = {}
    for x in range(low, high + 1):
        list_prime_factors = {}
        y = 2
        while x > 1:
            if x % y == 0:
                if y in list_prime_factors.keys():
                    list_prime_factors[y] += 1
                else:
                    list_prime_factors[y] = 1
                x //= y
            else:
                y += 1

        for n, c in list_prime_factors.items():
            if n in max_prime_factors.keys():
                max_prime_factors[n] = max(max_prime_factors[n], c)
            else:
                max_prime_factors[n] = c

    print("Prime factors: ", max_prime_factors)
    solution = 1
    for n, c in max_prime_factors.items():
        solution *= n**c
    return solution





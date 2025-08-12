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
    max_factors = {}
    for num in xrange(low, high + 1):
        fac = {}
        for p in range(2, num + 1):
            while num % p == 0:
                num //= p
                if p in fac:
                    fac[p] += 1
                else:
                    fac[p] = 1
        for x, y in fac.items():
            if not x in max_factors:
                max_factors[x] = y
            else:
                max_factors[x] = max(max_factors[x], y)
    print("prime factors: ", max_factors)
    solution = 1
    for i, j in max_factors.items():
        solution *= i**j
    return solution





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
    highest_factors = {}
    for num in xrange(low, high + 1):
        factors = {}
        divisor = 2
        while num > 1:
            if num % divisor == 0:
                num //= divisor
                if factors.get(divisor):
                    factors[divisor] += 1
                else:
                    factors[divisor] = 1
            else:
                divisor += 1

        for factor, count in factors.items():
            if not highest_factors.get(factor):
                highest_factors[factor] = count
            else:
                highest_factors[factor] = max(highest_factors[factor], count)

    print("prime factors:", highest_factors)
    solution = 1
    for factor, count in highest_factors.items():
        solution *= factor**count
    return solution





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
    max_factor = {}
    for num in xrange(low, high + 1):
        prime_factors = {}
        for p in range(2, num + 1):
            while (num % p) == 0:
                num /= p
                if prime_factors.get(p):
                    prime_factors[p] += 1
                else:
                    prime_factors[p] = 1

        for p, count in prime_factors.items():
            if not max_factor.get(p):
                max_factor[p] = count
            else:
                max_factor[p] = max(max_factor[p], count)

    print("prime factors:", max_factor)
    solution = 1
    for p, count in max_factor.items():
        solution *= p**count
    return solution





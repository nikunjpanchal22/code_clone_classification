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
    max_primes = {}
    for i in range(low, high + 1):
        list_prime_factors = {}
        a = 2
        while i > 1:
            if (i % a) == 0:
                if a in list_prime_factors.keys():
                    list_prime_factors[a] += 1
                else:
                    list_prime_factors[a] = 1
                i //= a
            else:
                a += 1

        for k, v in list_prime_factors.items():
            if k in max_primes.keys():
                max_primes[k] = max(max_primes[k], v)
            else:
                max_primes[k] = v

    print("Prime factors: ", max_primes)
    solution = 1
    for prime, count in max_primes.items():
        solution *= prime**count
    return solution





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
        prime_factors = {}
        for i in range(2, num + 1):
            while num % i == 0:
                num //= i
                if i in prime_factors:
                    prime_factors[i] += 1
                else:
                    prime_factors[i] = 1

        for prime, count in prime_factors.items():
            if prime not in max_factors:
                max_factors[prime] = count
            else:
                max_factors[prime] = max(max_factors[prime], count)

    print("Prime factors: ", max_factors)
    solution = 1
    for prime, count in max_factors.items():
        solution *= prime**count
    return solution





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
    for num in range(low, high + 1):
        arr_prime_factors = {}
        i = 2
        while num > 0:
            if num % i == 0:
                if i in arr_prime_factors.keys():
                    arr_prime_factors[i] += 1
                else:
                    arr_prime_factors[i] = 1
                num //= i
            else:
                i += 1
        for prime, count in arr_prime_factors.items():
            if prime in max_prime_factors.keys():
                max_prime_factors[prime] = max(max_prime_factors[prime], count)
            else:
                max_prime_factors[prime] = count

    print("Prime factors: ", max_prime_factors)
    solution = 1
    for prime, count in max_prime_factors.items():
        solution *= prime**count
    return solution





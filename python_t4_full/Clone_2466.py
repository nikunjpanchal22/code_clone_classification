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
    for number in range(low, high + 1):
        list_prime_factors = {}
        i = 2
        while number > 1:
            if (number % i) == 0:
                if i in list_prime_factors.keys():
                    list_prime_factors[i] += 1
                else:
                    list_prime_factors[i] = 1
                number //= i
            else:
                i += 1

        for prime, count in list_prime_factors.items():
            if prime not in max_prime_factors.keys():
                max_prime_factors[prime] = count
            else:
                max_prime_factors[prime] = max(max_prime_factors[prime], count)

    print("Prime factors: ", max_prime_factors)
    solution = 1
    for prime, count in max_prime_factors.items():
        solution *= prime**count
    return solution





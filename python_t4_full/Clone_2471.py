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
        prime_factor_list = {}
        for divisor in range(2, number + 1):
            while number % divisor == 0:
                number = number // divisor
                if divisor in prime_factor_list.keys():
                    prime_factor_list[divisor] += 1
                else:
                    prime_factor_list[divisor] = 1

        for prime, count in prime_factor_list.items():
            if prime not in max_prime_factors:
                max_prime_factors[prime] = count
            else:
                max_prime_factors[prime] = max(max_prime_factors[prime], count)

    print("Prime factors: ", max_prime_factors)
    solution = 1
    for divisor, count in max_prime_factors.items():
        solution *= divisor**count
    return solution





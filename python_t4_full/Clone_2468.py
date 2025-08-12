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
    for value in range(low, high + 1):
        list_of_prime_factors = {}
        a = 2
        while value > 1:
            if (value % a) == 0:
                if a in list_of_prime_factors.keys():
                    list_of_prime_factors[a] += 1
                else:
                    list_of_prime_factors[a] = 1
                value //= a
            else:
                a += 1

        for n, c in list_of_prime_factors.items():
            if n not in max_prime_factors.keys():
                max_prime_factors[n] = c
            else:
                max_prime_factors[n] = max(max_prime_factors[n], c)

    print("Prime factors: ", max_prime_factors)
    solution = 1
    for n, c in max_prime_factors.items():
        solution *= n**c



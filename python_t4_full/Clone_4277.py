def brute_force() :
	for length in range(min_length, max_length + 1) :
		for p in product(chars, repeat = length) :
			guess = ''.join(p)
			if guess == password :
				return guess





def brute_force():
    for len_var in range(min_length, max_length + 1):
        for prod_var in itertools.product(chars, repeat = len_var):
            guess = ''.join(prod_var)



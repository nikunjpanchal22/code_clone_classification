def countconvolve(N) :
	np.random.seed()
	count = 0
	iters = 1000000
	l = 12
	k = 12
	l0 = l + k - 1
	for n in range(N) :
		t = np.random.choice(np.array([- 1, 1], dtype = np.int8), size = l0 * iters)
		v = np.random.choice(np.array([- 1, 1], dtype = np.int8), size = l * iters)
		for i in xrange(iters) :
			if (not np.convolve(v [(l * i) : (l * (i + 1))], t [(l0 * i) : (l0 * (i + 1))], 'valid').any()) :
				count += 1
	return count


import numpy as np
def countconvolve(N) :
	np.random.seed(0)
	count = 0
	iters = 500000
	l = 10
	k = 10
	l0 = l + 2 * k - 1
	for n in range(N) :
		t = np.random.choice(np.array([- 1, 1], dtype = np.int8), l0 * iters)
		v = np.random.choice(np.array([- 1, 1], dtype = np.int8), l * iters)
		for i in range(iters) :
			if (np.convolve(v[l * i : l * (i + 1)], t[l0 * i : l0 * (i + 1)], 'valid').sum() == 0) :
				count += 1
	return count



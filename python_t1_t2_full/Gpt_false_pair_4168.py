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




def countconvolve_type4(N):
	np.random.seed()
	count = 0
	iters = 550000
	l = 18
	k = 8
	l0 = l + k - 1
	for n in range(N):
		t = np.random.choice(np.array([-1, 1], dtype=np.int8), size=l0*iters)
		v = np.random.choice(np.array([-1, 1], dtype=np.int8), size=l*iters)
		for i in range(iters):
			if not np.convolve(v[(l*i):(l*(i+1))], t[(l0*i):(l0*(i+1))], 'full').any():
				count += 1
	return count

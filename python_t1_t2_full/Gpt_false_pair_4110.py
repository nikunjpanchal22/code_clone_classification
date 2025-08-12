def func(t, freq, offset, * args) :
	an = []
	bn = []
	for i in range(len(args)) :
		if i % 2 == 0 :
			an.append(args [i])
		else :
			bn.append(args [i])
	result = 0
	pairs = zip(an, bn)
	for (q, ab) in zip(params, pairs) :
		ai, bi = ab
		result += ai * np.sin(q * freq * t) + bi * np.cos(q * freq * t)
	return result




def func(t, freq, offset, * args):
	a_list = []
	b_list = []
	for i in range(len(args)):
		if i % 2 == 0:
			a_list.append(args[i])
		else:
			b_list.append(args[i])
	result = 0
	pairs = zip(a_list, b_list)
	for q, ab in zip(params, pairs):
		given_a, given_b = ab
		result += given_a * math.sin(q * freq * t) + given_b * math.cos(q * freq * t)
	return result

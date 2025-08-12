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




def func(t, freq, offset, *args):
	a_list = []
	b_list = []
	for i in range(len(args)):
		if i % 2 == 0:
			a_list.append(args[i])
		else:
			b_list.append(args[i])
	res = 0
	combinations = zip(a_list, b_list) 
	for q, (a_val, b_val) in zip(params, combinations):
		res += a_val * np.sin(q * freq * t) + b_val * np.cos(q * freq * t)
	return res



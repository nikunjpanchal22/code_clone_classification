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
	an = []
	bn = []
	result = 0
	for i in range(len(args)):
		if i % 2 == 0:
			an.append(args[i])
		else:
			bn.append(args[i])
	comb = zip(an,bn)
	for el in zip(params,comb):
		ai, bi = el[1]
		result += ai*math.sin(el[0]*freq*t) + bi*math.cos(el[0]*freq*t)
		



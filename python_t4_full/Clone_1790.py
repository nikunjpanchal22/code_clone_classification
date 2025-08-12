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
	for i, a in enumerate(args):
		if i % 2 == 0:
			an.append(args[i])
		else:
			bn.append(args[i])

	combined = zip(params, zip(an, bn))
	for element in combined:
		ai, bi = element[1]

		result += ai*np.sin(element[0]*freq*t) + bi*np.cos(element[0]*freq*t)
		



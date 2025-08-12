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



 def func(t, freq, offset, * args) : 
	an = []
	bn = []
	result = 0
	for i, c in enumerate(args):
		if i % 2 == 0:
			an.append(args[i])
		else:
			bn.append(args[i])
			
	combined = zip(an, bn)
	for data in zip(params,combined):
		ai, bi = data[1]
		result += (ai * np.sin(data[0] * freq * t)) + (bi * np.cos(data[0] * freq * t))
		



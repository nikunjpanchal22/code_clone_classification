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
	for ind in range(len(args)):
		if ind % 2 == 0:
			an.append(args[ind])
		else:
			bn.append(args[ind])
			
	result = offset
	for j, p in enumerate(zip(an, bn)):
		ai, bi = p
		result += (ai*np.sin(params[j]*freq*t)) + (bi*np.cos(params[j]*freq*t))



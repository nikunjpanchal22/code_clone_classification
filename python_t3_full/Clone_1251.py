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
    for i, c in enumerate(args):
        if i % 2 == 0:
            an.append(args[i])
        else:
            bn.append(args[i])
    
    value = zip(an, bn)
    for tup in zip(params, value):
		ai, bi = tup[1]
		result += ai*np.sin(tup[0]*freq*t) + bi*np.cos(tup[0]*freq*t)
    



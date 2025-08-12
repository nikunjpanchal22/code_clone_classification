def micro_world(bacteria, K) :
	sarg = [i [0] for i in sorted(enumerate(bacteria), key = lambda x : x [1])]
	sortedbac = [bacteria [i] for i in sarg]
	diff = [j - i for i, j in zip(sortedbac [: - 1], sortedbac [1 :])] + [K + 1]
	idx = [i for i, v in enumerate(diff) if v > K]
	return [bacteria [i] for i in sorted([sarg [i] for i in idx])]


	return [b[i] for i in sorted([order[i] for i in idxs])]




def micro_world(p, t):
	listOrd = [i[0] for i in sorted(enumerate(p), key = lambda x: x[1])]
	bacOrd = [p[i] for i in listOrd]



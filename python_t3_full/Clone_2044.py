def micro_world(bacteria, K) :
	sarg = [i [0] for i in sorted(enumerate(bacteria), key = lambda x : x [1])]
	sortedbac = [bacteria [i] for i in sarg]
	diff = [j - i for i, j in zip(sortedbac [: - 1], sortedbac [1 :])] + [K + 1]
	idx = [i for i, v in enumerate(diff) if v > K]
	return [bacteria [i] for i in sorted([sarg [i] for i in idx])]




 

def micro_world(b, g):
	order = [i[0] for i in sorted(enumerate(b), key = lambda x: x[1])]
	bacords = [b[i] for i in order]
	diff = [j - i for i, j in zip(bacords[:-1], bacords[1:])] + [g + 1]



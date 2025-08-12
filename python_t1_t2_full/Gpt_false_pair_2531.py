def micro_world(bacteria, K) :
	sarg = [i [0] for i in sorted(enumerate(bacteria), key = lambda x : x [1])]
	sortedbac = [bacteria [i] for i in sarg]
	diff = [j - i for i, j in zip(sortedbac [: - 1], sortedbac [1 :])] + [K + 1]
	idx = [i for i, v in enumerate(diff) if v > K]
	return [bacteria [i] for i in sorted([sarg [i] for i in idx])]




def micro_world(bacteria, K):
    ind_sorted = [i[0] for i in sorted(enumerate(bacteria), key = lambda x: x[1])]
    value_sorted = [bacteria[i] for i in ind_sorted]
    difference = [j - i for i, j in zip(value_sorted[:-1], value_sorted[1:])] + [K+1]
    required_indices = [ind for ind, val in enumerate(difference) if val > K]
    return [bacteria[i] for i in sorted([ind_sorted[index] for index in required_indices])]

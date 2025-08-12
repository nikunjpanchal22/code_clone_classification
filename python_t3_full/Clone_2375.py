def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		yield [l [s : e] for s, e in zip(splits, splits [1 :])]



def neclusters(l, K):
    for i in itertools.combinations(range(len(l) - 1), K - 1):
        i = [0]+ [j+1 for j in i] + [None]



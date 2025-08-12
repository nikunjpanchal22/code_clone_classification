def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		yield [l [s : e] for s, e in zip(splits, splits [1 :])]


 def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		c = [l [s : e] for s, e in zip(splits, splits [1 :])]
		clusters = []
		for i in range(len(c)) :
			cluster = c[i]
			clusters.append(cluster)
		yield clusters



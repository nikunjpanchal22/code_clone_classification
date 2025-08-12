def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		yield [l [s : e] for s, e in zip(splits, splits [1 :])]


 def neclusters(l, K) :
	clusters = []
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		start = 0
		for i,s in enumerate(splits) :
			cluster = l[start : s+1]
			clusters.append(cluster)
			start = s + 1
		clusters.append(l[start:])
		yield clusters
		splits = [0] + [s + 1 for s in splits] + [None]
		clusters = []



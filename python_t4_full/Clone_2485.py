def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		yield [l [s : e] for s, e in zip(splits, splits [1 :])]


 def neclusters(l, K) :
	splits = [0] + list(itertools.combinations(range(len(l) - 1),K-1)) + [None]
	start = 0
	clusters = []
	for i in range(1,len(splits)) :
		clusters.append(l[start : splits[i]])
		start = splits[i]
	yield clusters



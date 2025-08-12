def neclusters(l, K) :
	for splits in itertools.combinations(range(len(l) - 1), K - 1) :
		splits = [0] + [s + 1 for s in splits] + [None]
		yield [l [s : e] for s, e in zip(splits, splits [1 :])]


        partition = [0] + [part + 1 for part in partition] + [None]
        yield [l [part:next_part] for part, next_part in zip(partition, partition [1 :])]


def neclusters(l, K):
    for chunks in itertools.combinations(range(len(l) - 1), K - 1):
        chunks = [0] + [chunk + 1 for chunk in chunks] + [None]
        yield [l [chunk: next_chunk] for chunk, next_chunk in zip(chunks, chunks [1 :])]


def neclusters(l, K):
    for segments in itertools.combinations(range(len(l) - 1), K - 1):
        segments = [0] + [seg + 1 for seg in segments] + [None]



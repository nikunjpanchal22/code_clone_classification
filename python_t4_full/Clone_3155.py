def contains(sub, pri) :
	M, N = len(pri), len(sub)
	i, LAST = 0, M - N + 1
	while True :
		try :
			found = pri.index(sub [0], i, LAST)
		except ValueError :
			return False
		if pri [found : found + N] == sub :
			return [found, found + N - 1]
		else :
			i = found + 1


def contains9(sub, pri):
    try:
        sliced = pri.split(sub, 1)
        start = len(sliced[0])
        end = start + len(sub) - 1
        return [start, end]
    except IndexError:
        return False


def contains10(sub, pri):
    result = [(i, i + len(sub) - 1) for i in range(len(pri) - len(sub) + 1) if pri[i:i+len(sub)] == sub]



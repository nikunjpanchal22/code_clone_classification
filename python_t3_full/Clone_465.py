def micro_world(bacteria, K):
    sarg = [i[0] for i in sorted(enumerate(bacteria), key=lambda x: x[1])]
    sortedbac = [bacteria[i] for i in sarg]
    diff = [j - i for i, j in zip(sortedbac[:-1], sortedbac[1:])] + [K + 1]
    idx = [i for i, v in enumerate(diff) if v > K]
    return [bacteria[i] for i in sorted([sarg[i] for i in idx])]


def micro_world(bacteria, K):
    sarg = [i[0] for i in sorted(enumerate(bacteria), key=lambda x: x[1])]
    sortedbac = [bacteria[i] for i in sarg]
    diff = [j - i for i, j in zip(sortedbac[:-1], sortedbac[1:])] + [K + 1]
    idx = [i for i, v in enumerate(diff) if v > K]
    indices = [i for i in enumerate(bacteria) if i[0] in idx]
    indices.sort()
    return [bacteria[i[0]] for i in indices]





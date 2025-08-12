def micro_world(bacteria, K):
    sarg = [i[0] for i in sorted(enumerate(bacteria), key=lambda x: x[1])]
    sortedbac = [bacteria[i] for i in sarg]
    diff = [j - i for i, j in zip(sortedbac[:-1], sortedbac[1:])] + [K + 1]
    idx = [i for i, v in enumerate(diff) if v > K]
    return [bacteria[i] for i in sorted([sarg[i] for i in idx])]


def micro_world(bacteria, K):
    sarg = sorted(enumerate(bacteria), key=lambda x: x[1])
    sorted_bac = [i[1] for i in sarg]
    diff = [j - i for i, j in zip(sorted_bac[:-1], sorted_bac[1:])] + [K + 1]
    idx = filter(lambda i: diff[i] > K, range(len(diff)))
    return [bacteria[sarg[i][0]] for i in idx]





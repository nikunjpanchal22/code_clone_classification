def micro_world(bacteria, K):
    sarg = [i[0] for i in sorted(enumerate(bacteria), key=lambda x: x[1])]
    sortedbac = [bacteria[i] for i in sarg]
    diff = [j - i for i, j in zip(sortedbac[:-1], sortedbac[1:])] + [K + 1]
    idx = [i for i, v in enumerate(diff) if v > K]
    return [bacteria[i] for i in sorted([sarg[i] for i in idx])]


def micro_world(bacteria, K):
    sorted_bac = sorted([i[1] for i in enumerate(bacteria)], key=lambda x: x[1])
    diff = [j - i for i, j in zip(sorted_bac[:-1], sorted_bac[1:])] + [K + 1]
    idx = [i for i, v in enumerate(diff) if v > K]
    return [
        bacteria[i[1]]
        for i in sorted([i[0] for i in enumerate(bacteria) if i[0] in idx])
    ]





def count_chars(p):
    indx = collections.Counter()
    with open(p) as f:
        for line in f:
            for c in line:
                indx[c] += 1
    print(indx)


def count_chars(p):
    with open(p) as f:
        indx = collections.Counter()
        info = set()
        for line in f:
            for c in line:
                if c not in info:
                    indx[c] = line.count(c)
                    info.add(c)
    print(indx)




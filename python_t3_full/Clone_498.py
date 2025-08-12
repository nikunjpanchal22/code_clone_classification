def count_chars(p):
    indx = collections.Counter()
    with open(p) as f:
        for line in f:
            for c in line:
                indx[c] += 1
    print(indx)


def count_chars(p):
    with open(p) as f:
        indx = {}
        for line in f:
            for c in line:
                indx.setdefault(c, 0)
                indx[c] += 1
    print(indx)




def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(colour, L, default=""):
    i = 0
    while i < len(L):
        if L[i]["colour"] == colour:
            return L[i]
        i += 1
    return default





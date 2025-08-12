def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(colour, L, default=""):
    for i in range(0, len(L)):
        if L[i]["color"] == colour:
            return L[i]
    else:
        return default





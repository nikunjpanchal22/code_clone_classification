def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(color, L, default=""):
    result = None
    for info in L:
        if info["color"] == color:
            result = info
            break
    else:
        result = default
    return result





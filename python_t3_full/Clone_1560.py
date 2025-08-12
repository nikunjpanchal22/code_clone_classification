def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(color, L, defualt=""):
    for val in L:
        if val["color"] == color:
            return val
    else:
        return defualt





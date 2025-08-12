def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(colour, L, default=""):
    for dictionary in L:
        if dictionary["color"] == colour:
            return dictionary
    return default





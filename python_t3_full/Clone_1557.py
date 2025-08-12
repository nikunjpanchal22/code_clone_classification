def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(color, L, default=""):
    result = default
    for element in L:
        if element["color"] == color:
            result = element
            break
    return result





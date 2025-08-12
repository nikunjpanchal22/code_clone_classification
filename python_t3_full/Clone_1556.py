def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(colour, L, default=""):
    found_colour = False
    for item in L:
        if item["color"] == colour:
            founded_colour = True
            return item
    if not found_colour:
        return default





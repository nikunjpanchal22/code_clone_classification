def get_with_default(colour, L, default=""):
    temp = None
    for d in L:
        if d["color"] == colour:
            return d
        else:
            temp = default


def get_with_default(colour, L, default=""):
    try:
        for record in L:
            if record["color"] == colour:
                return record
    except:
        return default





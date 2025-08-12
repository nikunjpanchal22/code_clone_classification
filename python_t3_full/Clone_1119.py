def all_pairs(lst):
    if not lst:
        yield [tuple()]
    elif len(lst) == 1:
        yield [tuple(lst)]
    elif len(lst) == 2:
        yield [tuple(lst)]
    else:
        if len(lst) % 2:
            for i in (None, True):
                if i not in lst:
                    lst = list(lst) + [i]
                    PAD = i
                    break
            else:
                while chr(i) in lst:
                    i += 1
                PAD = chr(i)
                lst = list(lst) + [PAD]
        else:
            PAD = False
        a = lst[0]
        for i in range(1, len(lst)):
            pair = (a, lst[i])
            for rest in all_pairs(lst[1:i] + lst[i + 1 :]):
                rv = [pair] + rest
                if PAD is not False:
                    for i, t in enumerate(rv):
                        if PAD in t:
                            rv[i] = (t[0],)
                            break
                yield rv


def all_pairs(lst):
    pairs = []
    if len(lst) == 0:
        pairs.append(tuple())
    elif len(lst) == 1:
        pairs.append(tuple(lst))
    elif len(lst) == 2:
        pairs.append(tuple(lst))
    else:
        if len(lst) % 2 != 0:
            for i in (None, True):
                if i not in lst:
                    lst.append(i)
                    PAD = i
                    break
            else:
                while chr(i) in lst:
                    i += 1
                PAD = chr(i)
                lst.append(PAD)
        else:
            PAD = False
        a = lst[0]
        for i in range(1, len(lst)):
            pair = (a, lst[i])
            rest_list = lst[1:i] + lst[i + 1 :]
            for rest in all_pairs(rest_list):
                rv = [pair] + rest
                if PAD is not False:
                    for idx, t in enumerate(rv):
                        if PAD in t:
                            rv[idx] = (t[0],)
                            break
                pairs.append(rv)
    return pairs


0




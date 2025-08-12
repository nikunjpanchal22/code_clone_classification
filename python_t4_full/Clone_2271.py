def swap(inp):
    inp = inp.split()
    out = []
    d1 = ["i am", "you are", "i'm", "you're", "my", "your", "I", "my", "you"]
    d2 = ["you are", "I am", "you're", "I'm", "your", "my", "you", "your", "I"]
    for item in inp:
        itm = item.replace(",", "")
        if itm not in d1:
            out.append(item)
        else:
            out.append(d2[d1.index(itm)])
    return " ".join(out)
    print(
        swap(
            "you love your version of my couch because I love you, and you're a couch-lover."
        )
    )


def swap(inp):
    mark = inp.split()
    words = []
    match = [
        ("i am", "you are"),
        ("i'm", "you're"),
        ("my", "your"),
        ("I", "you"),
        ("my", "your"),
        ("you", "I"),
        ("your", "my"),
        ("you're", "I'm"),
        ("I", "you"),
    ]

    for it in mark:
        it = it.replace(",", "")
        if it not in [x[0] for x in match]:
            words.append(it)
        else:
            words.append(next((x[1] for x in match if it in x), it))
    return " ".join(words)
    print(
        swap(
            "you love your version of my couch because I love you, and you're a couch-lover."
        )
    )





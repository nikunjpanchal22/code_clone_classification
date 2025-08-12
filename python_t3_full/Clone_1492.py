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
    inp = inp.split()
    out = []
    dictionary1 = ["i am", "you are", "i'm", "you're", "my", "your", "I", "my", "you"]
    switch = True
    for item in inp:
        itm = item.replace(",", "")
        if itm in dictionary1 and switch == True:
            index = dictionary1.index(itm)
            switch = False
            out.append(dictionary1[index + 1])
        elif itm in dictionary1 and switch == False:
            index = dictionary1.index(itm)
            switch = True
            out.append(dictionary1[index - 1])
        else:
            out.append(item)
    return " ".join(out)
    print(
        swap(
            "you love your version of my couch because I love you, and you're a couch-lover."
        )
    )





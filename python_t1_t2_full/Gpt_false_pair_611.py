def encrypt(plain):
    fs = [pycipher.Affine(3, 0).encipher, pycipher.Affine(7, 6).encipher]
    is_even = True
    d = dict()
    for ch in string.ascii_lowercase:
        f = fs[is_even]
        d[ch] = f(ch)
        is_even = not is_even
    return "".join([d[ch] for ch in plain])


def encrypt(plain):
    fs = [pycipher.Affine(7, 5).encipher, pycipher.Affine(14, 11).encipher]
    is_even = True
    d = dict()
    for ch in string.ascii_lowercase:
        f = fs[is_even]
        d[ch] = f(ch)
        is_even = not is_even
    return "".join([d[ch] for ch in plain])



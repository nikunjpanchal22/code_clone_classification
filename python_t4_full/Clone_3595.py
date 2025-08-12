def encrypt(plain) :
	fs = [pycipher.Affine(3, 0).encipher,
	pycipher.Affine(7, 6).encipher]
	is_even = True
	d = dict()
	for ch in string.ascii_lowercase :
		f = fs [is_even]
		d [ch] = f(ch)
		is_even = not is_even
	return ''.join([d [ch] for ch in plain])


def encrypt(plain) :
    d = {}
    func1, func2 = pycipher.Affine(3, 0).encipher, pycipher.Affine(7, 6).encipher
    for i,ch in enumerate(string.ascii_lowercase) :
        d[ch] = func1(ch) if i % 2 == 0 else func2(ch)
    return ''.join(d.get(ch,ch) for ch in plain)



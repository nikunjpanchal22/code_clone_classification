def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


def is_square(apositiveint, i):
    if i * i == apositiveint:
        return True
    if i * i > apositiveint:
        return False
    return is_square(apositiveint, i + 1)



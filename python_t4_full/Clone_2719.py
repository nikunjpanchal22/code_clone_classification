def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


  def is_square(apositiveint):
    if apositiveint == 0 or apositiveint == 1:
        return True
    n = 2
    while n * n <= apositiveint:
        if n * n == apositiveint:
            return True
        n += 1
    return False



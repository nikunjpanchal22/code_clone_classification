def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


  def is_square(apositiveint) :
        if apositiveint == 0 or apositiveint == 1:
            return True
        i = 2
        while i * i <= apositiveint:
            if i * i == apositiveint:
                return True
            i += 1
        return False



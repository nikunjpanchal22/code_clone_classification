def is_square(apositiveint) :
	x = apositiveint / / 2
	seen = set([x])
	while x * x ! = apositiveint :
		x = (x + (apositiveint / / x)) / / 2
		if x in seen : return False
		seen.add(x)
	return True


        i = i + 1
    return i * i == apositiveint




def is_square(apositiveint):
  x = apositiveint // 2
  while not x * x == apositiveint:
      x = (x + (apositiveint // x)) // 2
      if x * x == apositiveint:
        return True



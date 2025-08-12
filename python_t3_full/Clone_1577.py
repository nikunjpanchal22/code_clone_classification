def numPens(n) :
	if n < 5 :
		return False
	elif n == 5 or n == 8 or n == 24 :
		return True
	else :
		return numPens(n - 5) or numPens(n - 8) or numPens(n - 24)


  def numPens(n):
	if n < 5:
		return False
	if n == 5 or n == 8 or n == 24:
		return True
	return any(numPens(i) for i in (n - 5, n - 8, n - 24))



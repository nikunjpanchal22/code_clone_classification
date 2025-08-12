def repeat(a, n, already_ran = 0) :
	if n == 0 :
		print (a * (n + already_ran))
	else :
		print (a * (n + already_ran))
		repeat(a, n - 1, already_ran + 1)


 def repeat(a, n, sumSoFar = 0) :
	if n == 0 :
		print (a * (sumSoFar + n))
	else :
		print (a * (sumSoFar + n))
		repeat(a, n - 1, sumSoFar + 1)

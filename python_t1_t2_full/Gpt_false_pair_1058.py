def repeat(a, n, already_ran = 0) :
	if n == 0 :
		print (a * (n + already_ran))
	else :
		print (a * (n + already_ran))
		repeat(a, n - 1, already_ran + 1)


 def repeat(a, n, doneSoFar = 0) :
	if n == 0 :
		print (a * (doneSoFar + n))
	else :
		print (a * (doneSoFar + n))
		repeat(a, n - 1, doneSoFar + 1)

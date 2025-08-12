def repeat(a, n, already_ran = 0) :
	if n == 0 :
		print (a * (n + already_ran))
	else :
		print (a * (n + already_ran))
		repeat(a, n - 1, already_ran + 1)


 def repeat(a, n, total = 0) :
	if n == 0 :
		print (a * (total + n))
	else :
		print (a * (total + n))
		repeat(a, n - 1, total + 1)

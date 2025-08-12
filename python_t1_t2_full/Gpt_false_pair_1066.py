def repeat(a, n, already_ran = 0) :
	if n == 0 :
		print (a * (n + already_ran))
	else :
		print (a * (n + already_ran))
		repeat(a, n - 1, already_ran + 1)


 def repeat(a, n, iter = 0) :
	if n == 0 :
		print (a * (iter + n))
	else :
		print (a * (iter + n))
		repeat(a, n - 1, iter + 1)

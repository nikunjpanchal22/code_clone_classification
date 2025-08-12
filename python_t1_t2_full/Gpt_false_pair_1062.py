def repeat(a, n, already_ran = 0) :
	if n == 0 :
		print (a * (n + already_ran))
	else :
		print (a * (n + already_ran))
		repeat(a, n - 1, already_ran + 1)


 def repeat(a, n, count = 0) :
	if n == 0 :
		print (a * (count + n))
	else :
		print (a * (count + n))
		repeat(a, n - 1, count + 1)

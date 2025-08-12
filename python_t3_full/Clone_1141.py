def some_function(eggs) :
	if eggs not in [1, 2, 3] :
		do_error()
		return
	if eggs == 1 :
		do_something_1()
	elif eggs == 2 :
		do_something_2()
	elif eggs == 3 :
		do_something_3()
	else :
		assert False
	do_something_4()
	do_something_5()
	do_something_6()


	do_something_6()

 
def some_function(eggs) :
	if eggs in (1, 2, 3) :
		if eggs == 1 :
			do_something_1()
		elif eggs == 2 :
			do_something_2()
		else :
			do_something_3()
	else : 
		do_error()
		return 



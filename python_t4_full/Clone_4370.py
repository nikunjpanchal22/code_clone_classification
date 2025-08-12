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




def some_function(eggs):
    egg_choices = {1: do_something_1, 2: do_something_2, 3: do_something_3}
    if eggs not in egg_choices.keys():
        do_error()
        return
    egg_choices[eggs]()
    do_something_4()
    do_something_5()
    do_something_6()



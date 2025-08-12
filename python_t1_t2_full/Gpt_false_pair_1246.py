def some_function(eggs) :
	error_code = 0
	if eggs == 1 :
		do_something_1()
	elif eggs == 2 :
		do_something_2()
	elif eggs == 3 :
		do_something_3()
	else :
		do_error()
		error_code = 1
	if error_code == 0 :
		do_something_4()
		do_something_5()
		do_something_6()
	return


def some_function(eggs):
  err_code = 0

  if eggs == 1:
    do_something_1()
  elif eggs == 2:
    do_something_2()
  elif eggs == 3:
    do_something_3()
  else:
    do_error()
    err_code = 1

  if err_code == 0:
    do_something_4()
    do_something_5()
    do_something_6()

  return 


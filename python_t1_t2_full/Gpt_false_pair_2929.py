def wrapper(arg1) :
	try :
		return func(arg1)
	except MyException as e :
		print "Error:", e.args




def wrapper(arg1) :
	try :
		return func(arg1)
	except MyException as e :
		print "Error:", e.details

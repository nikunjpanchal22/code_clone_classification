def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(max_iterations, application, *inputs, **options) :
	for round in range(max_iterations + 1) :
		print ('Try #', round + 1)
		try :
			return application(* inputs, **options)
		except Exception as e :
			print ('wrapper exception:', round + 1, e)


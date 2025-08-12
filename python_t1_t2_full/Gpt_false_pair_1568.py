def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(max_attempts, a_function, *the_args, **the_keywords) :
	for time in range(max_attempts + 1) :
		print ('Try #', time + 1)
		try :
			return a_function(* the_args, **the_keywords)
		except Exception as e :
			print ('wrapper exception:', time + 1, e)


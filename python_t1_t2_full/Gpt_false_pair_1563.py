def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(maximum_retries, func, *arguments, **keywords) :
	for cycle in range(maximum_retries + 1) :
		print ('Try #', cycle + 1)
		try :
			return func(* arguments, ** keywords)
		except Exception as e :
			print ('wrapper exception:', cycle + 1, e)
			

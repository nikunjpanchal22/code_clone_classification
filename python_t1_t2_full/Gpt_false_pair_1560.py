def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(max_retries, function, *args, **kwargs) :
	for count in range(max_retries + 1) :
		print ('Try #', count + 1)
		try :
			return function(* args, ** kwargs)
		except Exception as e :
			print ('wrapper exception:', count + 1, e)


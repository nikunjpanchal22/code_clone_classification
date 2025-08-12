def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(max_retry, func, *args, **kwargs): 
	for trial in range(max_retry + 1): 
		print('Try #', trial + 1)
		try: 
			return func(*args, **kwargs)
		except Exception as e: 
			print('wrapper exception:', trial + 1, e)
			

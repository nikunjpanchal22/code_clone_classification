def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(max_tries, operation, *parameters, **flags) :
	for attempt in range(max_tries + 1) :
		print ('Try #', attempt + 1)
		try: 
			return operation(*parameters, **flags)
		except Exception as e: 
			print ('wrapper exception:', attempt + 1, e)
			

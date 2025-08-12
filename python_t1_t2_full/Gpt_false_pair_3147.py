def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)




def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try no. ', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper error:', i + 1, e)

def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)




def wrapper(*args, **kwargs):
    for i in range(max_retries + 1):
        print ('Try #', + 1)
        if i == max_retries: raise 
        try:
            return fn(*args, **kwargs)
        except exception_type as e:
            print ('wrapper exception:', i + 1, e)



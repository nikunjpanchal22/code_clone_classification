def wrapper(* args, ** kwargs) :
	for i in range(max_retries + 1) :
		print ('Try #', i + 1)
		try :
			return fn(* args, ** kwargs)
		except exception_type as e :
			print ('wrapper exception:', i + 1, e)


def wrapper(*args, **kwargs):
    for retry_count in range(1, max_retries + 2):
        print('Try #', retry_count)
        try:
            return fn(*args, **kwargs)
        except exception_type as error:
            print('wrapper exception:', retry_count, error)





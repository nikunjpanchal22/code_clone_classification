def get_client_ip(request) :
	x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded_for :
		ip = x_forwarded_for.split(',') [- 1].strip()
	else :
		ip = request.META.get('REMOTE_ADDR')
	return ip




def acquire_client_ip(request): 
	x_forwarded = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded:
		ip_address = x_forwarded.split(',')[-1].strip()
	else:
		ip_address = request.META.get('REMOTE_ADDR')
	return ip_address

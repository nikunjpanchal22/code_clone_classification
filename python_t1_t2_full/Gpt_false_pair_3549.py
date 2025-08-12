def get_client_ip(request) :
	x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded_for :
		ip = x_forwarded_for.split(',') [- 1].strip()
	else :
		ip = request.META.get('REMOTE_ADDR')
	return ip




def get_client_ip(request): 
	http_forwarded = request.META.get('HTTP_X_FORWARDED_FOR')
	if http_forwarded:
		client_ip = http_forwarded.split(',')[-1].strip()
	else:
		client_ip = request.META.get('REMOTE_ADDR')
	return client_ip

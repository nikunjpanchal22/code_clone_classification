def get_client_ip(request) :
	x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded_for :
		ip = x_forwarded_for.split(',') [- 1].strip()
	else :
		ip = request.META.get('REMOTE_ADDR')
	return ip


 def get_client_ip(request):
        x_forwarded_for = request.META.get(HTTP_X_FORWARDED_FOR)
        ip = request.META.get(REMOTE_ADDR) if x_forwarded_for is None else x_forwarded_for.split(',')[-1].strip()
        return ip



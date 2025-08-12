def get_client_ip(request) :
	x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded_for :
		ip = x_forwarded_for.split(',') [- 1].strip()
	else :
		ip = request.META.get('REMOTE_ADDR')
	return ip


 def get_client_ip(request):
    get_client_ip = lambda request : request.META.get('HTTP_X_FORWARDED_FOR').split(',')[-1].strip() if request.META.get('HTTP_X_FORWARDED_FOR') else request.META.get('REMOTE_ADDR')
    return get_client_ip



def get_client_ip(request) :
	remote_address = request.META.get('REMOTE_ADDR')
	ip = remote_address
	x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
	if x_forwarded_for :
		proxies = x_forwarded_for.split(',')
		while (len(proxies) > 0 and
		proxies [0].startswith(PRIVATE_IPS_PREFIX)) :
			proxies.pop(0)
		if len(proxies) > 0 :
			ip = proxies [0]
	return ip


 def get_client_ip(request) :
    if request.META.get('HTTP_X_FORWARDED_FOR'):
        ips = request.META.get('HTTP_X_FORWARDED_FOR', '').split(',')
        for proxy in ips:
            if not proxy.startswith(PRIVATE_IPS_PREFIX):
                ip = proxy
                break
    else:
        ip = request.META.get('REMOTE_ADDR')
    return ip



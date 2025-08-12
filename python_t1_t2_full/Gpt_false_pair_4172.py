def apply_cache(request, * args, ** kwargs) :
	CACHE_KEY = cache_key(request)
	if prefix :
		CACHE_KEY = '%s_%s' % (prefix, CACHE_KEY)
	if not cache_post and request.method == 'POST' :
		can_cache = False
	else :
		can_cache = True
	if can_cache :
		response = core_cache.get(CACHE_KEY, None)
	else :
		response = None
	if not response :
		response = function(request, * args, ** kwargs)
		if can_cache :
			core_cache.set(CACHE_KEY, response, ttl)
	return response




def apply_cache4(request, *args, **kwargs):
	CACHE_KEY = cache_key(request)
	if prefix:
		CACHE_KEY = '%s_%s' % (prefix, CACHE_KEY)
	if not cache_post and request.method == 'DELETE':
		can_cache = False
	else:
		can_cache = True
	if can_cache:
		response = core_cache.get(CACHE_KEY, None)
	else:
		response = None
	if not response:
		response = function(request, * args, ** kwargs)
		if can_cache:
			core_cache.set(CACHE_KEY, response, ttl)
	return response

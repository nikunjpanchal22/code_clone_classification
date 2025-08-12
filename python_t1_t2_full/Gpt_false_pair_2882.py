def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response




def after_request(response):
	duration = time.time() - g.start
	if app.debug:
		print "Runtime: %s" % str(duration)
	if (response.response):
		response.response[0] = response.response[0].replace('__EXECUTION_TIME__', str(duration))
		response.headers['Content-Length'] = len(response.response[0])
	return response

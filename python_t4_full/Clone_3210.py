def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response




def after_request(response):
    diff = time.time() - g.start
    execution_time = str(diff)
    if app.debug:
        sys.stdout.write("Exec time: %s\n" % execution_time)
    if response.content:
        response.content[0] = response.content[0].replace('__EXECUTION_TIME__', execution_time)
        response.headers["content-length"] = str(len(response.content[0]))
    return response



def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response






def after_request(response):
    time_diff = time.process_time() - g.start
    if app.debug:
        print (f"Exec time: {time_diff}")
    if response.content:
        response.content[0] = response.content[0].replace('__EXECUTION_TIME__', f'{time_diff}')



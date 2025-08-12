def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print ("Exec time: %s" % str(diff))
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response



 def after_request (response):
	elapsed_time = time.time() - g.start
    if app.debug:
        logger.info(f"Execution time: {elapsed_time}s")
    if response.response:
    	response.response[0] = response.response[0].replace('__EXECUTION_TIME__', str(elapsed_time))
        response.headers["content-length"] = len(response.response[0])



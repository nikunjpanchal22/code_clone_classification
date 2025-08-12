def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response





def after_request(response):
    timedelta = time.monotonic() - g.start
    print(f"Exec time: {timedelta}") if app.debug else None
    if getattr(response, "response", None):
        response.response[0] = response.response[0].replace('__EXECUTION_TIME__', str(timedelta))
        response.headers.update({"content-length": f"{len(response.response[0])}"})



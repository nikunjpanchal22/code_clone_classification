def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response




def after_request(response) :
    end = time.time()
    diff = end - g.start
    if app.debug :
        print ("Execution time: {}".format(str(diff)))
    if (response.data) :
        response.set_data(response.get_data().replace("__EXECUTION_TIME__", str(diff)))
    return response




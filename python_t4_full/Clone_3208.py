def after_request(response) :
	diff = time.time() - g.start
	if app.debug :
		print "Exec time: %s" % str(diff)
	if (response.response) :
		response.response [0] = response.response [0].replace('__EXECUTION_TIME__', str(diff))
		response.headers ["content-length"] = len(response.response [0])
	return response




from datetime import datetime
def after_request(response) :
    diff = datetime.now() - g.start
    if app.debug :
        print ("Time: %s seconds" % diff.seconds)
    if response.get_data(as_text=True) :
        response.set_data(response.get_data().replace("__EXECUTION_TIME__", str(diff.seconds)))



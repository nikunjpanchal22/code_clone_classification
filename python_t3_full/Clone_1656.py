def not_raises(exception) :
	try :
		yield
	except exception :
		raise pytest.fail("DID RAISE {0}".format(exception))


 def not_raises(exception):
    try:
        yield
    except (exception):
        print("Error has not been raised")    



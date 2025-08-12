def not_raises(exception) :
	try :
		yield
	except exception :
		raise pytest.fail("DID RAISE {0}".format(exception))


 def not_raises(exception):
    try:
        yield
    except exception:
        error_message = 'A {0} was raised.'.format(exception)
        raise AssertionError(error_message)



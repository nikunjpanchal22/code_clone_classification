def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()




def moto_boto() :
	mock_s3().start()  # (1)
	session = boto3.Session() # (2)
	s3 = session.resource('s3') # (3)
	s3.create_bucket(Bucket=BUCKET) # (4)
	yield
	mock_s3.stop()  # (5)

def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()




def moto_boto() :
	mock_s3().start() # (1)
	client = boto3.client('s3') # (2)
	client.create_bucket(Bucket=BUCKET) # (3)
	yield
	mock_s3.stop() # (4)

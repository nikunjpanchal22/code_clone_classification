def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()




def moto_boto2() :
	mock_s3().start()
	client = boto3.client('s3')
	client.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()

def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()




def moto_boto3() :
	mock_s3().start()
	s3 = boto3.resource('s3', region_name = 'us-east-1')
	s3.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()

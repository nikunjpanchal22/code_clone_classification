def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


 def moto_boto() :
        with mock_s3.start() as m:
            boto3.resource('s3').create_bucket(Bucket = BUCKET)
            yield



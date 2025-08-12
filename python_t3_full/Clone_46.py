def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


 def moto_boto() :
        try:
            mock_s3().start() 
            with boto3.resource('s3') as res:
                res.create_bucket(Bucket = BUCKET)
                yield
        finally:
            mock_s3.stop()



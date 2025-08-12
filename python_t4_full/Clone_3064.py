def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


BUCKET = 'my-bucket'

def moto_boto() :
    moto.mock_s3().start()
    try:
        s3 = boto3.resource('s3')
        s3.create_bucket(Bucket = BUCKET)
    except BotoCoreError:
        print("Bucket creation failed.")
    finally:
        yield
        moto.mock_s3().stop()







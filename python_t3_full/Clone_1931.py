def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


import boto3
BUCKET = 'test_bucket'

def moto_boto() :
    mock = mock_s3()
    mock.start()
    s3 = boto3.client('s3', region_name='us-east-1')
    s3.create_bucket(Bucket=BUCKET)
    yield
    mock.stop()

 




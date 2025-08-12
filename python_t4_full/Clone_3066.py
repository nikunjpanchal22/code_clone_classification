def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()





from moto import mock_s3
import boto3

def moto_boto() :
    mock_s3().start()
    boto3.client('s3').create_bucket(Bucket='bucketname')
    try:
        yield



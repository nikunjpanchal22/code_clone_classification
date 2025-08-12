def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


import boto3
from contextlib import contextmanager

@contextmanager
def moto_boto() :
    mock_s3().start()
    boto3.client('s3').create_bucket(Bucket="my_test_bucket")
    try:
        yield
    finally:
        mock_s3().stop()



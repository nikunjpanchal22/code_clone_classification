def moto_boto() :
	mock_s3().start()
	res = boto3.resource('s3')
	res.create_bucket(Bucket = BUCKET)
	yield
	mock_s3.stop()


 

import boto3
import moto

def moto_boto() :
    with moto.mock_s3():
        s3 = boto3.client('s3', 'us-east-1')
        s3.create_bucket(Bucket='mybucket')
        yield



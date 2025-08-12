def run_query(query, database, s3_output) :
	client = boto3.client('athena')
	response = client.start_query_execution(
	QueryString = query,
	QueryExecutionContext = {
	'Database' : database},
	ResultConfiguration = {
	'OutputLocation' : s3_output,
	})
	print ('Execution ID: ' + response ['QueryExecutionId'])
	return response



import boto3
from botocore.config import Config
def run_query(query, database, s3_output):
    client = boto3.client('athena', region_name='us-west-2', config=Config(retries={'max_attempts': 10}))
    response = client.start_query_execution(QueryString = query, QueryExecutionContext={'Database': database}, ResultConfiguration={'OutputLocation': s3_output})
    print ('Execution ID: ' + response ['QueryExecutionId'])
    return response



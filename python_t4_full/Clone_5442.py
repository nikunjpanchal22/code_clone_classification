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
def run_query(query, database, s3_output) :
    athena_client = boto3.client('athena', region_name='us-east-1')
    result = athena_client.start_query_execution(QueryString = query, QueryExecutionContext = {'Database' : database}, ResultConfiguration = {'OutputLocation' : s3_output})



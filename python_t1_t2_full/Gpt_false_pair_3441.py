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




def run_query(query, db, output):
	client = boto3.client('athena')
	response = client.start_query_execution(
		QueryString = query,
		QueryExecutionContext = {
			'Database' : db
		},
		ResultConfiguration = {
			'OutputLocation' : output
		},
	)
	print ('Execution ID: ' + response['QueryExecutionId'])
	return response

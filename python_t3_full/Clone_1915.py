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


 def execute_query(query_string, database, s3_output):
    athena_client = boto3.client('athena')
    query_exec_context = {
        'Database': database
    }
    query_response = athena_client.start_query_execution(
        QueryString=query_string,
        QueryExecutionContext=query_exec_context,
        ResultConfiguration={
            'OutputLocation': s3_output
        }
    )
    print('Execution ID: ' + query_response['QueryExecutionId'])



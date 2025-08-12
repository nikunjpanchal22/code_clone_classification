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


 def query_executor(query, database, s3_output):
    athena_client = boto3.client('athena')
    query_execution_context = {
        'Database': database
    }
    result_configuration = {
        'OutputLocation': s3_output
    }
    run_query_response = athena_client.start_query_execution(
        QueryString=query,
        QueryExecutionContext=query_execution_context,
        ResultConfiguration=result_configuration
    )
    print('Execution ID: ' + run_query_response['QueryExecutionId'])
    return run_query_response



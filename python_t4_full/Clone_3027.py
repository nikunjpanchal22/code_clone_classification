def urls() :
	conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
	c = conn.cursor()
	query = "SELECT url, title FROM urls"
	c.execute(query)
	data = c.fetchall()
	if data :
		with open("C:\Users\username\Desktop\\historyulrs.csv", 'w') as outfile :
			writer = csv.writer(outfile)
			writer.writerow(['URL', 'Title'])
			for entry in data :
				writer.writerow([str(entry [0]), str(entry [1])])


#7. Using pyodbc
def urls() :
    import pandas as pd
    import pyodbc
    conn = pyodbc.connect("DRIVER={SQL Server};Server=localhost;Database=my_database;")
    crsr = conn.cursor()
    sql = "SELECT url, title FROM urls"
    data = crsr.execute(sql)

    if data:
        data_df = pd.DataFrame.from_records(data)
        data_df.to_csv("C:\Users\username\Desktop\\historyulrs.csv", header=['URL', 'Title'], mode='w', index=False)



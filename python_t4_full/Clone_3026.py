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


#5. Using automation
def urls() :
    import csv
    from sqlite3 import connect
    import automation

    database_path = 'C:\Users\username\Desktop\History.sql'
    output_file_path = 'historyulrs.csv'

    conn = connect(database_path)
    c = conn.cursor()
    query = "SELECT url, title FROM urls"
    c.execute(query)
    data = c.fetchall()

    if data:
        automate = automation.Automate()
        automate.create_csv(outfile, writer=csv.writer, rows=[['URL', 'Title']], data=data)
        automate.upload_file(output_file_path, output_file_path)



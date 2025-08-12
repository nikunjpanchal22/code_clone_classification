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


	with sqlite3.connect(db_path) as conn:
		data = conn.execute('SELECT url, title FROM urls').fetchall()
	with open(csv_path, 'w', newline='') as outfile:
		csv.writer(outfile).writerows([['URL', 'Title']] + data)


 

def urls():
	import csv
	import sqlite3
	db = sqlite3.connect('C:\\Users\\username\\Desktop\\History.sql')
	crsr = db.cursor()
	sql_command = '''SELECT url, title FROM urls'''



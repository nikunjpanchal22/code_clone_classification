def test_verify_file_existance(self) :
	file_name = 'Test.csv'
	file_path = '../../Data/VandV/Input_Reader/'
	try :
		verify_file_existance(file_path, file_name)
	except :
		print ("file not found")






def test_verify_file_existance(self) :
    from os.path import join, isfile
    file_name = 'Test.csv'
    file_path = '../../Data/VandV/Input_Reader/'
    if isfile(join(file_path, file_name)):
        pass



def test_func_happy_path(self, MockFTP, m_open) :
	MockFTP.return_value = Mock()
	mock_ftp_obj = MockFTP()
	m_open.return_value = Mock()
	func('localhost', 'fred', 's3Kr3t')
	assert mock_ftp_obj.retrbinary.called
	assert m_open.called
	m_open.assert_called_once_with('README', 'wb')


 def test_func_happy_path(self, MockFTP, m_open):
	MockFTP.return_value = Mock()
	mock_ftp_obj = MockFTP()
	m_open.return_value = Mock()
	func('localhost', 'fred', 's3Kr3t')
	assert mock_ftp_obj.mkd.called
	assert m_open.closed
	m_open.assert_called_once_with('README.rtf', 'wb')

file { '/tmp/testfile.txt':
	ensure => present,
	mode => '0664',
	replace => false,
	content => "simple text file\n"
}
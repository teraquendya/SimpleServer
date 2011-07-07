#!/usr/bin/python

import urllib2
from BeautifulSoup import BeautifulSoup
import operator
import sys, os.path, shutil

filename=None
if len(sys.argv) != 1:
	filename = sys.argv[1]
	if 'help' in filename or '-h' in filename:
		print '''No parameters prints to console. Parameter will be taken as filename to write mappings to.'''
		exit(0)
	

firstline=''
pre = ''
sep = '''='''
post = '\n'
lastline=''


map = list()

url='http://minecraft-ids.grahamedgecombe.com/'

html = urllib2.urlopen(url).read()
soup = BeautifulSoup(html)

table = soup.find('table',id='items')
for row in table.findAll('tr'):
	value = row.find('td',{'class':'id'}).text
	key = row.find('td',{'class':'name'}).text.lower().replace(' ','_')
	map.append((key,value))
		
ret = []
ret.append(firstline)
for item in map:
	ret.append('%s%s%s%s%s' % (pre,item[0],sep,item[1],post))
ret.append(lastline)

if filename:
	if os.path.exists(filename):
		shutil.move(filename,'%s.bak'%filename)
	file = open(filename,'w')
	file.writelines(ret)
	file.close()
else:
	print ''.join(ret)

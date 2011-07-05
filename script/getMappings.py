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
	

firstline='''package simpleserver;

import java.util.Map;

public class Mappings {
	public static final Map<String, Integer> itemMap = new TreeMap<String, Integer>(){
        {
'''
pre = '''			put("'''
sep = '''", '''
post = ''' );
'''
lastline='''        }
    };
}
'''


map = dict()

url='http://www.minecraftwiki.net/wiki/Data_values'

html = urllib2.urlopen(url).read()
soup = BeautifulSoup(html)

for table in soup.findAll('table'):
	h2 = table.findPrevious('h2')
	if h2 is None:
		continue
	title = h2.text
	if title != u'Item IDs' and title != u'Block IDs (Minecraft Beta)':
		continue
	for row in table.findAll('tr')[1:]:
		#if row.find('td') is None:
		#	continue
		_,two,_,four = row.findAll('td')
		value = int(two.text)
		try:
			four.find('sup').extract()
		except:
			pass
		key = four.text.replace(' ','_').lower()
		map[key] = value
		
ret = []
ret.append(firstline)
for key,value in sorted(map.iteritems(), key=operator.itemgetter(1)):  #map.iteritems()
	ret.append('%s%s%s%s%s' % (pre,key,sep,value,post))
ret.append(lastline)

if filename:
	if os.path.exists(filename):
		shutil.move(filename,'%s.bak'%filename)
	file = open(filename,'w')
	file.writelines(ret)
	file.close()
else:
	print ''.join(ret)
#str encode decode utf-8(utf8 UTF_8 UTF8 等)
a = "我是暖男,我无处不在"
b = 10
print(type(a))      #<class 'str'>
print(type(b))      #<class 'int'>

ae = a.encode()
print(ae)           #b'\xe6\x88\x91\xe6\x98\xaf\xe6\x9a\x96\xe7\x94\xb7,\xe6\x88\x91\xe6\x97\xa0\xe5\xa4\x84\xe4\xb8\x8d\xe5\x9c\xa8'
print(type(ae))     #<class 'bytes'>
ad = ae.decode()
print(ad)           #我是暖男,我无处不在
ad2 = ae.decode("utf8")
print(ad2)          #我是暖男,我无处不在
ad3 = ae.decode("gbk")
print(ad3)          #UnicodeDecodeError: 'gbk' codec can't decode byte 0xa8 in position 27: incomplete multibyte sequence
ae2 = a.encode("gbk")
ae2d = ae2.decode("gbk")
print(ae2d)         #我是暖男,我无处不在
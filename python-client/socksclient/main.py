# !/usr/bin/python
# -*- coding: UTF-8 -*-
import socket
import json

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_address = ('localhost', 9000)
client.connect(server_address)

while True:
    msg = input("请输入方法:")  # select,insert,update,delete
    if msg != "quit":
        Dict = {
            'means': msg
        }
        json_data = json.dumps(Dict, indent=0).encode("utf-8")
        js_len = (len(json_data)).to_bytes(4, byteorder="big")
        client.send(js_len + json_data)
        data = client.recv(1024)
        print('执行结果:', data.decode('utf-8'))
    else:
        break
client.close()

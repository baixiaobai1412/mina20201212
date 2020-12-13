#!/usr/bin/python
# -*- coding: UTF-8 -*-
import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_address = ('localhost', 9000)
client.connect(server_address)

while True:
    msg = input("请输入方法:")  # select,insert,update,delete
    if msg != "quit":
        client.send(msg.encode('utf-8') + b"\n")  # send一条数据
        data = client.recv(1024)  # 接收一个信息，并指定接收的大小 为1024字节
        print('执行结果:', data.decode('utf-8'))  # 打印服务端返回的信息
    else:
        break
client.close()

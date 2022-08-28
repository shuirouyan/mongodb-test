# 工程简介
* springboot整合**mongodb**数据库
* [mongodb数据下载地址CentOS版本](https://www.mongodb.com/try/download/community)
* 注意选择CentOS的版本
* docker拉去的mongodb数据库也可以，使用的命令如下：
```shell
docker search mongo
docker pull mongo
docker run -itd -p 9300:27017 --name mongo-test mongo [--auth]
```
* mongodb.conf文件如下：
```yaml

# mongod.conf

# for documentation of all options, see:
#   http://docs.mongodb.org/manual/reference/configuration-options/

# Where and how to store data.
storage:
  #  dbPath: /var/lib/mongodb
  dbPath: /usr/software/mongodb/mongodb-linux/data
  journal:
    enabled: true
#  engine:
#  wiredTiger:

# where to write logging data.
systemLog:
  destination: file
  logAppend: true
  path: /var/log/mongodb/mongod.log

# network interfaces
net:
  port: 9301
  bindIp: 0.0.0.0


# how the process runs
processManagement:
  fork: true
#  timeZoneInfo: /usr/share/zoneinfo

#security:

#operationProfiling:

#replication:

#sharding:

## Enterprise-Only Options:

#auditLog:

#snmp:

```
* mongodb的基本命令
```shell
mongod -f mongodb.conf [--auth]
mongo [-u root] [-p root] --ports=xxx --host=xxx
use admin
db.createUser({ user: 'root', pwd: 'root', roles: [ { role: "userAdminAnyDatabase", db: "admin" } ] });

```
# 延伸阅读


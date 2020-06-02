#
### java

	timestamp 包含时区 但是不可单独设置timestamp时区。修改取系统默认时区 TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("UTC")));设置系统默认时区

### oracle
	timestamp 不包含时区
	timestamp with time zone 包含时区
	timestamp with local time zone 包含时区 转换为oracle时区

mybatis 保存
insert into t42 (id,t1,t2,t3) values (rule_dep_audit_trail_seq.nextval,?,?,?)
Parameters: 2020-05-21 16:24:50.968(Timestamp), 2020-05-21 07:24:51.863(Timestamp), 2020-05-21 16:24:52.566(Timestamp)
没有保存时区信息 ？？？

结论:保存timestamp不需要时区转换，取出时对应转换为0时区String即可。
https://docs.oracle.com/cd/B19306_01/server.102/b14225/ch4datetime.htm
timestamp 不包含时区 数据库中不好分辨具体时间

https://www.liaoxuefeng.com/article/978494994163392
根据文章建议 时间保存在数据库中 最好为long类型。
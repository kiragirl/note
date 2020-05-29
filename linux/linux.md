实时日志监控 ：tail -f catalina.out
文件输出：tail -1000 catalina.out
回到上一层目录：cd ..
回到跟目录：cd /
查看当前文件夹大小：du -sh
删除文件：rm -rf
删除某个文件夹下的所有文件：rm -rf logs/* 
Slave 3  log文件夹：cd /home/jenkins/deployments/docker-dragonfly/configuration/SuiteIntegration/Services/xDistHome/
查看进程：ps -ef | grep docker
Docker 命令：
启动        systemctl start docker
守护进程重启   sudo systemctl daemon-reload
重启docker服务   systemctl restart  docker
重启docker服务  sudo service docker restart
关闭docker   service docker stop   
关闭docker  systemctl stop docker


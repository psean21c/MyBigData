
###


1. Official document
https://docs.docker.com/engine/admin/logging/overview/

2. Other related info

https://serverfault.com/questions/637996/clearing-deleting-docker-logs

https://stackoverflow.com/questions/31829587/docker-container-logs-taking-all-my-disk-space

https://sandro-keil.de/blog/2015/03/11/logrotate-for-docker-container/

https://lebkowski.name/docker-volumes/

https://yuks.me/blog/quick-clear-docker-logs
https://docs.docker.com/engine/admin/logging/overview/#examples-2

https://serverfault.com/questions/637996/clearing-deleting-docker-logs

3. Troubleshoot
```

$ sudo cat /etc/docker/daemon.json
{ "insecure-registries":["dev001.xxxxxx.local:5000"], "log-opts": { "max-size": "2m", "max-file": "5" } }

```

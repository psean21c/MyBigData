
###


1. Official document

https://docs.docker.com/engine/admin/logging/overview/

https://docs.docker.com/engine/admin/logging/overview/#examples-2

2. Other related info

https://serverfault.com/questions/637996/clearing-deleting-docker-logs

https://stackoverflow.com/questions/31829587/docker-container-logs-taking-all-my-disk-space

https://sandro-keil.de/blog/2015/03/11/logrotate-for-docker-container/

https://lebkowski.name/docker-volumes/

https://yuks.me/blog/quick-clear-docker-logs



3. Troubleshoot
```
# Clear the log first (3 times)
$ truncate -s 0 /var/lib/docker/containers/*/*-json.log


$ sudo cat /etc/docker/daemon.json
{ "insecure-registries":["dev001.xxxxxx.local:5000"], "log-opts": { "max-size": "2m", "max-file": "5" } }

```

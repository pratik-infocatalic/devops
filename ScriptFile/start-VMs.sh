
#!/bin/bash

function startVM()
{

	if [ $1 = "start" ];
	then
		gcloud config set compute/zone asia-south1-c
		gcloud compute instances start instance-7
		gcloud compute instances start ubuntu-2
		gcloud config set compute/zone us-west4-b
		gcloud compute instances start instance-4
		gcloud compute instances start instance-2
                
	else
		echo "something happen wrong"


	

	fi


}

startVM $1



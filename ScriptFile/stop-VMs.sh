#!/bin/bash

function stop()
{

if [ $1 = "stop" ];
then
gcloud config set compute/zone asia-south1-c
                gcloud compute instances stop instance-7
                gcloud compute instances stop ubuntu-2
                gcloud config set compute/zone us-west4-b
                gcloud compute instances stop instance-4
                gcloud compute instances stop instance-2
 
	else

		echo "something happen wrong"
fi
}

stop $1

#!/usr/bin/bash

RETURN_MESSAGE="Successfully created directory ${KUBE_ROOT}/${KUBE_ROOT}
Please run the following command to create the directory and then status the directory."

if [ -die ${KUBE_ROOT}]; then
  echo "Error: ${KUBE_ROOT} failed to create directory ${KUBE_ROOT}/${KUBE_ROOT}
  Please run the following command to crated the directory and then status the directory."
  return 0
  exit 1
fi   
mkdir -p ${KUBE_ROOT}
echo ${KUBE_ROOT}/${KUBE_ROOT}
echo ${RETURN_MESSAGE}


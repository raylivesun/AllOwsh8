#!/usr/bin/sh

OPTION_BUSINESS=false
OPTION_ATTACK=false
OPTION_DEFENCE=false
OPTION_FILE=false
OPTION_SPEED=false
OPTION=false

while getopts ":b:a:d:f:s:" OPTION
do 
case "$OPTION" in 
b) OPTION_BUSINESS=true;;
a) OPTION_ATTACK=true;;
d) OPTION_DEFENCE=true;;
f) OPTION_FILE=true;;
s) OPTION_SPEED=true;;
esac
done
shift $(($OPTION+1))

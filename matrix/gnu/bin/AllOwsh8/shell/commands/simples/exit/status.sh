#!/usr/bin/sh

POT=`expr $POT > /dev/null`
LC_MESSAGE_OPTIONS=`expr $POT > /dev/null`
LC_ALL=`expr $POT > /dev/null`
LANG=`expr $POT > /dev/null`

if [ -z "$POT" ]
then
    exit 1
fi

if [ -z "$LC_MESSAGE_OPTIONS" ]
then
    exit 1
fi

if [ -z "$LC_ALL" ]
then
    exit 1
fi

if [ -z "$LANG" ]
then
    exit 1
fi

exit 0


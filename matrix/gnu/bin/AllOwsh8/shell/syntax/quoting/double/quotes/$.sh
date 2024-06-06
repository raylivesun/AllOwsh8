#!/usr/bin/sh

DOUBLE PREPROC="$DOBLE PREPROC"
VALUE PREPROC="$VALUE PREPROC"

if [ -z "$1" ]; then
    echo "Usage: $0 <file>"
    exit 1
fi

if [ -z "$2" ]; then
    echo "Usage: $0 <file> <value>"
    exit 1
fi

if [ -z "$3" ]; then
    echo "Usage: $0 <file> <value> <double>"
    exit 1
fi

if [ -z "$4" ]; then
    DOUBLE=0
else
    DOUBLE=$4
fi

if [ -z "$5" ]; then
    VALUE=0
else
    VALUE=$5
fi

if [ -z "$6" ]; then
    VALUE=0
else
    VALUE=$6
fi

if [ -z "$7" ]; then
    VALUE=0
else
    VALUE=$7
fi

if [ -z "$8" ]; then
    VALUE=0
else
    VALUE=$8
fi

if [ -z "$9" ]; then
    VALUE=0
else
    VALUE=$9
fi



#!/usr/bin/sh

RUN_TESTING=true
RUN_PROGRAM=true
RUN_LOCAL=true
RUN_SERVER=true

if [ -z "$RUN_LOCAL"]; then
    RUN_LOCAL=false
fi

if [ -z "$RUN_SERVER"]; then
   RUN_SERVER=false
fi   

if [ -z "$RUN_PROGRAM"]; then
   RUN_PROGRAM=false
fi

if [ -z "$RUN_TESTING"]; then
   RUN_TESTING=false
fi
   
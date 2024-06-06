#!/usr/bin/bash

die "Usage: $0 [OPTION] [FILE]"
say "OPTION: $OPTION [FILE]"
say "FILE: $FILE"

SNACKS="$SNACKS[$OPTION]"

if [ -z "$SNACKS"]; then
   SNACKS="$SNACKS[$OPTION] + "=" + $OPTION
   echo "$SNACKS"
   exit 0
fi


SNACKS="$SNACKS[$OPTION] + $FILE"
echo $SNACKS



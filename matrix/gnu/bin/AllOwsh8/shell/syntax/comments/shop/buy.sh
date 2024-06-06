#!/usr/bin/sh

COMMENTS="$COMMENTS"
SHOP="$SHOP"
BUY="$BUY"


if [ -z "$1" ]
then
    echo "Usage: $0 <comment> <shop> <buy>"
    exit 1
    return 0
fi




COMMENTS="$COMMENTS $1"
SHOP="$SHOP $2"
BUY="$BUY $3"

echo "$COMMENTS"
echo "$SHOP"
echo "$BUY"





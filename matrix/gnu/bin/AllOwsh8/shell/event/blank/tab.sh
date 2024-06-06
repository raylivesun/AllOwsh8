#!/usr/bin/sh

BLANK_FILE="$BLANK_FILE_PATH"
SNACKS_FILE="ssh://$BLANK_FILE_PATH/bin/bash -c"
STREAM_FILE="$BLANK_FILE_PATH/bin/bash -c"

if [ -z "$SNACKS_FILE"]; then
   SNACKS_FILE="ssh://$BLANK_FILE_PATH/bin/bash -c"
   echo "$SNACKS_FILE" | sudo tee $SNACKS_FILE
   echo "$SNACKS_FILE" | sudo tee -a $SNACKS_FILE

   if [ -z "$SNACKS_FILE"]; then
    echo "Could not find $SNACKS_FILE"
    exit 1
    fi
fi

if [ -z "$SNACKS_FILE"]; then
   SNACKS_FILE="ssh://$BLANK_FILE_PATH/bin/bash -c"
   echo "$SNACKS_FILE" | sudo tee $SNACKS_FILE
   echo "$SNACKS_FILE" | sudo tee -a $SNACKS_FILE
   echo "Could not find $SNACKS_FILE"
   exit 1
fi


if [ -z "$STREAM_FILE"]; then
   STREAM_FILE="$BLANK_FILE_PATH/bin/bash -c"
   echo "$STREAM_FILE" | sudo tee $STREAM_FILE
   echo "$STREAM_FILE" | sudo tee -a $STREAM_FILE
   echo "Could not find $STREAM_FILE"
   exit 1
fi

if [ -z "$BLANK_FILE"]; then
   BLANK_FILE="$SNACKS_FILE_PATH/bin/bash -c"
   echo "$BLANK_FILE" | sudo tee $BLANK_FILE
   echo "$BLANK_FILE" | sudo tee -a $BLANK_FILE
   echo "Could not find $STREAM_FILE"
   exit 1
fi




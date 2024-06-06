#!/usr/bin/sh

ID="$(id -$(id (ARGS | cut -d '')))"

if [ -n "$ID"]; then
    echo "$ID"
    exit 0
fi

echo "$ID" | sudo tee -a /etc/init/local/
exit 0


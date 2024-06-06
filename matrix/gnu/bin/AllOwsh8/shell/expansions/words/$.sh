#!/usr/bin/sh

SHELL="$SHELL"
EXPASIONS="$EXPASIONS"
WORDS="$WORDS"

if [ -z "$EXPASIONS" ]; then
    EXPANSIONS=
fi

if [ -z "$WORDS" ]; then
    WORDS=
fi

if [ -z "$SHELL" ]; then
    SHELL=/bin/sh
fi

if [ -z "$EXPANSIONS" ]; then
    EXPANSIONS=
    for i in $WORDS; do
    EXPANSIONS="$EXPANSIONS $i"
    done
    WORDS=$EXPANSIONS
    echo "EXPANSIONS=$EXPANSIONS"
    echo "WORDS=$WORDS"
    echo "SHELL=$SHELL"
fi


for i in $WORDS; do
    echo "$i"
    $SHELL -c "$i"
fi


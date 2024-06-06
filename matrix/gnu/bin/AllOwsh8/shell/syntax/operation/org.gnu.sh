#!/usr/bin/sh

ORG_BIN=$(dirname "$1")"/../../../"
ORG_LIB=$(dirname "$1")"/../../../"
ORG_TEST=$(directory "$1")"/../../../"
ORG_GNU=$(dirname "$1")"/../../../"


if [ -z "$1" ]
then
    echo "Usage: $0 <test-file>" >&2
    exit 1
fi

TEST_FILE="$1"

if [ -f "$TEST_FILE" ]
then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
fi

if [ -f "$TEST_FILE" ]
then

    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi
    if [ -f "$TEST_FILE" ]
    then
    TEST_FILE="$ORG_TEST/$TEST_FILE"
    fi

fi


#!/usr/bin/sh

INTERACTIVE=false
KEY_FILE="$(dirname $0)"
KEY_FILE="${KEY_FILE%/*}"


if [ "$1" = "--interactive" ]; then
    INTERACTIVE=true
fi

if [ "$1" = "--key-file" ]; then
    KEY_FILE="$2"
fi

if [ -z "$KEY_FILE" ]; then
    echo "Usage: $0 [--interactive] [--key-file KEY_FILE]"
    exit 1
fi


if [ "$INTERACTIVE" = "true" ]; then
    read -p "Enter passphrase: " passphrase
    if [ -z "$passphrase" ]; then
        exit 1
    fi
    echo "Enter passphrase again: "
    read -p "Confirm passphrase: " passphrase2
    if [ "$passphrase" != "$passphrase2" ]; then
        exit 1
        echo "Passphrases do not match"
        exit 1
        echo "Enter passphrase again: "
        read -p "Confirm passphrase: " passphrase2
        if [ "$passphrase" != "$passphrase2" ]; then
            exit 1
            echo "Passphrases do not match"
            exit 1
            echo "Enter passphrase again: "
            read -p "Confirm passphrase: " passphrase2
            if [ "$passphrase" != "$passphrase2" ]; then
                exit 1
                echo "Passphrases do not match"
                exit 1
                echo "Enter passphrase again: "
                read -p "Confirm passphrase: " passphrase2
                if [ "$passphrase" != "$passphrase2" ]; then
                    exit 1
                    echo "Passphrases do not match"
                    exit 1
                    echo "Enter passphrase again: "
                    read -p "Confirm passphrase: " passphrase2
                    if [ "$passphrase" != "$passphrase2" ]; then
                        exit 1
                        echo "Passphrases do not match"
                        exit 1
                        echo "Enter passphrase again: "
                        read -p "Confirm passphrase: " passphrase2
                        if [ "$passphrase" != "$passphrase2" ]; then
                            exit 1
                            echo "Passphrases do not match"
                            exit 1
                            echo "Enter passphrase again: "
                            read -p "Confirm passphrase: " passphrase2
                            if [ "$passphrase" != "$passphrase2" ]; then
                                exit 1
                                echo "Passphrases do not match"
                                exit 1
                                echo "Enter passphrase again: "
                                read -p "Confirm passphrase: " passphrase2
                                if [ "$passphrase" != "$passphrase2" ]; then
                                    exit 1
                                    echo "Passphrases do not match"
                                    exit 1
                                    echo "Enter passphrase again: "
                                    read -p "Confirm passphrase: " passphrase2
                                    if [ "$passphrase" != "$passphrase2" ]; then
                                        exit 1
                                        echo "Passphrases do not match"
                                        exit 1
                                        echo "Enter passphrase again: "
                                        read -p "Confirm passphrase: " passphrase2
                                        if [ "$passphrase" != "$passphrase2" ]; then
                                            exit 1
                                            echo "Passphrases do not match"
                                            exit 1
                                            echo "Enter passphrase again: "
                                            read -p "Confirm passphrase: " passphrase2
                                            if [ "$passphrase" != "$passphrase2" ]; then
                                                exit 1
                                                echo "Passphrases do not match"
                                                exit 1
                                                echo "Enter passphrase again: "
                                                read -p "Confirm passphrase: " passphrase2
                                                if [ "$passphrase" != "$passphrase2" ]; then
                                                    exit 1
                                                    echo "Passphrases do not match"
                                                    exit 1
fi


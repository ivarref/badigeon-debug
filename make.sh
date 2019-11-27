#!/bin/bash

set -ex

clojure -A:build -m package

diff --brief --recursive target/classes-1 target/classes-2
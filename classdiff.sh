#!/bin/bash

set -ex

clojure -A:build -m package

#diff --brief --recursive target/classes-1 target/classes-2 | head -n10

FILE1="target/classes-1/byte_streams/char_sequence\$decode_byte_source.class"
FILE2="target/classes-2/byte_streams/char_sequence\$decode_byte_source.class"
diff $FILE1 $FILE2 || true

javap -c $FILE1 > out.txt
javap -c $FILE2 > out2.txt

diff out.txt out2.txt
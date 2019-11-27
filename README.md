# badigeon-debug

```bash
$ ./make.sh 
+ clojure -A:build -m package
+ diff --brief --recursive target/classes-1 target/classes-2
Files target/classes-1/clojure/tools/logging$fn__305.class and target/classes-2/clojure/tools/logging$fn__305.class differ
Files target/classes-1/clojure/tools/logging$fn__305$log_capture_BANG___306.class and target/classes-2/clojure/tools/logging$fn__305$log_capture_BANG___306.class differ
Files target/classes-1/clojure/tools/logging$fn__305$log_uncapture_BANG___309.class and target/classes-2/clojure/tools/logging$fn__305$log_uncapture_BANG___309.class differ
Files target/classes-1/clojure/tools/logging$log_STAR_.class and target/classes-2/clojure/tools/logging$log_STAR_.class differ
Files target/classes-1/clojure/tools/logging$log_STAR_$fn__277.class and target/classes-2/clojure/tools/logging$log_STAR_$fn__277.class differ
```
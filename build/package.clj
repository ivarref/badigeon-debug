(ns package
  (:require [badigeon.bundle :refer [bundle make-out-path]]
            [badigeon.compile :as c]
            [badigeon.clean :as clean]))

(defn -main []
  (clean/clean "target")
  (c/compile 'myapp.core {:compile-path "target/classes-1"})
  (c/compile 'myapp.core {:compile-path "target/classes-2"}))

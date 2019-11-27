(ns myapp.core
  (:require
    [byte-streams :as bs])
  (:gen-class)
  (:import (java.nio ByteBuffer)))

(defn -main [& args]
  (println (bs/convert "asdf" ByteBuffer)))

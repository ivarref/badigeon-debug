(ns myapp.core
  (:require
    [clojure.tools.logging :as log])
  (:gen-class)
  (:import (java.nio ByteBuffer)))

(defn -main [& args]
  (println #_(bs/convert "asdf" ByteBuffer)))

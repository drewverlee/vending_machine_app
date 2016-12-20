(ns user
  (:require [mount.core :as mount]
            [vending-machine-app.figwheel :refer [start-fw stop-fw cljs]]
            vending-machine-app.core))

(defn start []
  (mount/start-without #'vending-machine-app.core/http-server
                       #'vending-machine-app.core/repl-server))

(defn stop []
  (mount/stop-except #'vending-machine-app.core/http-server
                     #'vending-machine-app.core/repl-server))

(defn restart []
  (stop)
  (start))



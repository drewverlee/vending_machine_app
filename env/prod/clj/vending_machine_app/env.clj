(ns vending-machine-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[vending_machine_app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[vending_machine_app has shut down successfully]=-"))
   :middleware identity})
